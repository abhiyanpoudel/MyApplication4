package com.example.getme.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class HomePage extends AppCompatActivity {
    EditText logout;

    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_activity);
        preferences = getSharedPreferences("Userinfo",0);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_home,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id){
            case R.id.logout:
                preferences.edit().putBoolean("rememberme",false).commit();
                startActivity(new Intent(HomePage.this,MainActivity.class));

                break;
            case R.id.menu2:
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
