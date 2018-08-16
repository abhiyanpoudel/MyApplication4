package com.example.getme.form1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText firstname, lastname, password, phoneno;
    Button login, register;
    ImageView imageView;
    SharedPreferences preferences;

    SqlDatabase databaseHelper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = getSharedPreferences("Userinfo", 0);
        databaseHelper = new SqlDatabase(this);
        firstname = (EditText) findViewById(R.id.edtFName);
        lastname = (EditText) findViewById(R.id.edtLName);
        password = (EditText) findViewById(R.id.edtPass);
        phoneno = (EditText) findViewById(R.id.edtPhone);

        login = (Button) findViewById(R.id.btnLogin);
        register = (Button) findViewById(R.id.btnRegister);
        imageView = (ImageView) findViewById(R.id.imageOfClient);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnRegister:
                String newfirstname = firstname.getText().toString();
                String newlastname = lastname.getText().toString();
                String newpassword = password.getText().toString();
                String newphone = phoneno.getText().toString();

        }
    }
}
