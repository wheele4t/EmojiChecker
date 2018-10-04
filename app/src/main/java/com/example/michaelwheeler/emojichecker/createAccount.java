

package com.example.michaelwheeler.emojichecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class createAccount extends AppCompatActivity {
// fields for Edit Buttons and Buttons
    Button editchooseEmoji;
    EditText editName;
    EditText editEmail;
    EditText editPhone;
    EditText editUserName;
    EditText editPassword;
    Button editSubmit;

    String fChooseEmoji, fName, fEmail, fPhone, fUserName, fPassword, fSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
//locates buttons
        editchooseEmoji= (Button) findViewById(R.id.editchooseEmoji);
        editName= (EditText) findViewById(R.id.editName);
        editEmail= (EditText) findViewById(R.id.editEmail);
        editPhone= (EditText) findViewById(R.id.editPhone);
        editUserName= (EditText) findViewById(R.id.editUserName);
        editPassword= (EditText) findViewById(R.id.editPassword);
        editSubmit= (Button) findViewById(R.id.editSubmit);


    }
//gets string created
    public void onClick(View v) {
        fChooseEmoji = editchooseEmoji.getText().toString();
        fName = editName.getText().toString();
        fEmail = editEmail.getText().toString();
        fPhone = editPhone.getText().toString();
        fUserName = editUserName.getText().toString();
        fPassword = editPassword.getText().toString();
        fSubmit = editSubmit.getText().toString();

//dislplay stind on bottom of screen

        showToast(fChooseEmoji);
        showToast(fName);
        showToast(fEmail);
        showToast(fPhone);
        showToast(fUserName);
        showToast(fPassword);
        showToast(fSubmit);







    }
   //toast is used to show buttom string on bottom of page
    private void showToast(String text){
        Toast.makeText(createAccount.this, text, Toast.LENGTH_SHORT);
    }

}


