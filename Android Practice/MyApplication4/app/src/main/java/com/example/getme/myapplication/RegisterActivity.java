package com.example.getme.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText username, email, phone, password;
    Button register, cancel;
    RadioGroup gender;
    ImageView imageView;
    SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        preferences =getSharedPreferences("Userinfo",0);

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.edtPass);
        phone = findViewById(R.id.edtPhone);
        imageView = findViewById(R.id.imageOfClient);
        cancel = findViewById(R.id.btnCancel);
        gender = findViewById(R.id.gender);
        register = findViewById(R.id.btnRegister);


    }

    public void btnClick(View view) {
        if (view.getId() == R.id.btnRegister) {
            saveData();

        } else if (view.getId() == R.id.btnCancel) {
            finish();

        }

    }
    public void saveData(){

        String usernamevalue = username.getText().toString();
        String emailvalue = email.getText().toString();
        String passwordvalue = password.getText().toString();
        String phonevalue = username.getText().toString();
        RadioButton checkedBtn = findViewById(gender.getCheckedRadioButtonId());
        String gendervalue =checkedBtn.getText().toString();
        Toast.makeText(this,"username: "+usernamevalue,Toast.LENGTH_SHORT).show();

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("username",usernamevalue);
        editor.putString("email",emailvalue);
        editor.putString("password",passwordvalue);
        editor.putString("phone",phonevalue);
        editor.putString("gender",gendervalue);
        editor.apply();
    }
}
