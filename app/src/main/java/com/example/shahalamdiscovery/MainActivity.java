package com.example.shahalamdiscovery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRegister(View v){
        Intent i = new Intent(this,RegisterActivity.class);
        startActivity(i);
    }

    public void openLogin(View v){
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);

    }
}