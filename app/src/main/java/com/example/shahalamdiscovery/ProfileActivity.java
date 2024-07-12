package com.example.shahalamdiscovery;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    ImageButton url;
    FrameLayout web;
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

        web = findViewById(R.id.webLink);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/AizadOsman/ShahAlamDiscovery.git");
            }
        });

        url = findViewById(R.id.web);
        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/AizadOsman/ShahAlamDiscovery.git");
            }
        });

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

    void gotoUrl(String s){
        try{
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW, uri));
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(), "No Website Linke", Toast.LENGTH_SHORT).show();
        }
    }
}