package com.nashville.kurds.autopin;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

import java.io.File;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    protected static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This application was brought to you by Shevan J Murat @ Nashvillekurds.com ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

         /*if (id == R.id.nav_camera)
        {

            // Handle the camera action
            int RESULT_LOAD_IMAGE =0;
            Intent i = new Intent(
                    Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(i, RESULT_LOAD_IMAGE);

        } */ if (id == R.id.nav_gallery) {
            // request Money
            // automatically sends a text message to a contact you choose with a auto filled in message that says send me some money
            // at the moment you can not choose what to say but, in future updates you should.
            // stores the contacts auto filled number and since we dont know who we leave it as 00000
         /*   int phoneNumber = 000000 ;
            // this is a string message that is tossed in to the message text edit
            String message ="Please send me 1,000 dinars. my phone line is not active";
            // intent calls the future to open up the action view text messaging and phone number above
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + phoneNumber));
            // this is where it sends the message body too
            intent.putExtra("sms_body", message);
            // lets it rip and puts its code where need be.
            startActivity(intent);

         */
            Intent in = new Intent(this, Main22Activity.class);
            // starts the activity
            startActivity(in);

        } else if (id == R.id.nav_slideshow) {
           // send money

          //  display contacts

         /*   // available balance
            try {
                int pinCode = 955606464 ;
                String hash = "#";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:*221*" +pinCode ));
                startActivity(intent);
            } catch (Exception e) {

            }
*/
            // sending money needs a new activity / layout becasue we need much more funtions in there
            // but pretty much intents a new manactivity calss which is called Main2Activity
            Intent in = new Intent(this, Main2Activity.class);
            // starts the activity
            startActivity(in);

        } else if (id == R.id.nav_manage) {

            // sending money needs a new activity / layout becasue we need much more funtions in there
            // but pretty much intents a new manactivity calss which is called Main2Activity
            Intent in = new Intent(this, Main23Activity.class);
            // starts the activity
            startActivity(in);


        }else if (id == R.id.nav_facebook) {
            String url = "https://www.facebook.com/Korek-Auto-Pin-1130018723725079/?skip_nax_wizard=true";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }else if (id== R.id.nav_twitter){
            String url = "https://twitter.com/smartboxerbil";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        } /*else if (id == R.id.nav_smartbox) {
            String url = "http://nashvillekurds.com/tv/smartbox.apk";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }*/ else if (id == R.id.nav_kurdhistory) {
            String url = "https://play.google.com/store/apps/details?id=com.nashvillekurds.android&hl=en";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private class PICK_CONTACT {
    }
}
