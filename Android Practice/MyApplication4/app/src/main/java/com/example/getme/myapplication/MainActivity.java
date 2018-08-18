package com.example.getme.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,email,phone,password;
    Button register,login;
    CheckBox rememberme;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences =getSharedPreferences("Userinfo",0);

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.edtPass);
        login = findViewById(R.id.btnLogin);
        register = findViewById(R.id.btnRegister);
        rememberme = findViewById(R.id.rememberMe);
        if (preferences.getBoolean("rememberme",false)){
            startActivity(new Intent(MainActivity.this,HomePage.class));
        finish();
        }


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernamvalue = username.getText().toString();
                String passwordvalue = password.getText().toString();

                String registeredUsername = preferences.getString("username","");
                String registeredPassword = preferences.getString("password","");

                if (usernamvalue.equals(registeredUsername)&&passwordvalue.equals(registeredPassword)){
                    Toast.makeText(MainActivity.this,"Login Sucessful"
                            , Toast.LENGTH_SHORT).show();
                    if (rememberme.isChecked()){
                        preferences.edit().putBoolean("rememberme",true).commit();
                    }
                    startActivity(new Intent(MainActivity.this,HomePage.class));
                }else {
                    Toast.makeText(MainActivity.this,"Username/Password Mismatched"
                            , Toast.LENGTH_SHORT).show();
                }


            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }

        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        update();
    }
    public void update(){

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
