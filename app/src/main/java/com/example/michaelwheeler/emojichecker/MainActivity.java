package com.example.michaelwheeler.emojichecker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
//this is the opening screen on the app
public class MainActivity extends AppCompatActivity {
//Button one is logIn
    private Button button1;
    private Button button2;
//Button two is signUp
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// This method connects the LogIn Button to the create account page
           button1 = (Button) findViewById(R.id.editLogIn);
           button2 = (Button) findViewById(R.id.editSignUp);
           //set buuton to one to logIN
           button1.setOnClickListener(new View.OnClickListener() {
                @Override
           public void onClick(View v) {
             openlogIn();
             }

          });
//Button2 to connect signup to create account
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencreateAccount();
            }

        });





          }
          // button1 logIn open create account
         public void opencreateAccount(){
              Intent intent = new Intent(this, createAccount.class);
             startActivity(intent);
         }
         //Button 1 open logIn
    public void openlogIn(){
        Intent intent = new Intent(this, logIn.class);
        startActivity(intent);
    }





}

