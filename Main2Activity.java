package com.nashville.kurds.autopin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {

// sending money

    EditText firstNumber;
    EditText secondNumber;
    Button   btnAdd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnAdd = (Button)findViewById(R.id.button5);



                    // toast pop up for what to do on this activity
                    Toast.makeText(Main2Activity.this,
                                "Fill in the full information, followed by the Agreement checkboxes and click submit", Toast.LENGTH_LONG).show();
                    btnAdd.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                try {



                                    EditText et  = (EditText)findViewById(R.id.editText4);
                                    EditText et2 = (EditText)findViewById(R.id.editText98);
                                    EditText et3 = (EditText)findViewById(R.id.editText99);



                                    String text  = et.getEditableText().toString();
                                    String text2 = et2.getEditableText().toString();
                                    String text3 = et3.getEditableText().toString();


                                    // toast popup
                                    Toast.makeText(Main2Activity.this,
                                            (text + " at phone Number " + text2 +" is about to receive "+ text3 +" from your phone account"), Toast.LENGTH_LONG).show();

                                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode("*221*" + text2 +"*" + text3 + "#")));
                                    startActivity(intent);
                                } catch (Exception e) {
                                }
                            }
                        });

                    }
                }