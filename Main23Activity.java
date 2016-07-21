
package com.nashville.kurds.autopin;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main23Activity extends AppCompatActivity {

    // activating pin

    EditText firstNumber;
    Button btnAdd;
    int number = 35;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        Toast.makeText(Main23Activity.this,
                "Type in your Pin Number", Toast.LENGTH_LONG).show();

        btnAdd = (Button)findViewById(R.id.button12);




        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {


                    EditText et = (EditText) findViewById(R.id.editText6);
                    String text= et.getEditableText().toString();

                    String character = Character.toString((char) number);


                    Toast.makeText(Main23Activity.this,
                            "Adding Money to your account has never been this easy", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("*221*" + text + "#")));
                    startActivity(intent);

                } catch (Exception e) {
                }
            }
        });

    }
}

