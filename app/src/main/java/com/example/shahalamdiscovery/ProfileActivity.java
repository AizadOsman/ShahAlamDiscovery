package com.example.shahalamdiscovery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser user;
    TextView profileText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        auth = FirebaseAuth.getInstance();
        profileText = (TextView)findViewById(R.id.textView);

        user = auth.getCurrentUser();
        profileText.setText(user.getEmail());

    }


    public void signout(View v){
        auth.signOut();
        finish();
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }

    //button to about us page
    public void openAbout(View v){
        Intent i = new Intent(this, about.class);
        startActivity(i);
    }

    public void openMap(View v){
        Intent i= new Intent(this, MapActivity.class);
        startActivity(i);
    }

    public void openDestination(View v){
        //open Top Places Activity
        Intent i= new Intent(this, TopPlacesActivity.class);
        startActivity(i);
    }
}