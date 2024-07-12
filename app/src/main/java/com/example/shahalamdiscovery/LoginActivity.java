package com.example.shahalamdiscovery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText e1, e2;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);

        mAuth = FirebaseAuth.getInstance();
    }

    public void loginUser(View v){
        if(e1.getText().toString().equals("") && e2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Blank not allowed", Toast.LENGTH_SHORT).show();

        }else{
            mAuth.signInWithEmailAndPassword(e1.getText().toString(),e2.getText().toString())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(getApplicationContext(),"User logged in succesfully",Toast.LENGTH_SHORT).show();
                                finish();
                                Intent i = new Intent(getApplicationContext(),ProfileActivity.class);
                                startActivity(i);
                            }else{
                                Toast.makeText(getApplicationContext(),"User could not be login",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }
}