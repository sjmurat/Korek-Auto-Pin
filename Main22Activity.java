package com.nashville.kurds.autopin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main22Activity extends AppCompatActivity {

    // sending text
    EditText firstNumber;
    Button btnAdd;
    String user;
    int amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        btnAdd = (Button) findViewById(R.id.button1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);


        btnAdd = (Button) findViewById(R.id.button1);
        Toast.makeText(Main22Activity.this,
                "Sending request for money has never been this easy. begin by typing a contacts number", Toast.LENGTH_LONG).show();

        amount=1000;
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {

                    //  variable for text3
                    EditText et4 = (EditText) findViewById(R.id.editText3);
                    // variable for text4

                    EditText et5 = (EditText) findViewById(R.id.editText97);


                    String text4 = et4.getEditableText().toString();
                    String text5 = et5.getEditableText().toString();

                    String message = "Click here to send " + text5 + amount + " Dinars to help them gain access to their  phone account.";
                    // intent calls the future to open up the action view text messaging and phone number above
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + text4));
                    // this is where it sends the message body too
                    intent.putExtra("sms_body", message);
                    // lets it rip and puts its code where need be.
                    Toast.makeText(Main22Activity.this,
                            "Click send to send 1000 IQD request to your friends or family", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                } catch (Exception e) {
                }
            }
        });
    }}


