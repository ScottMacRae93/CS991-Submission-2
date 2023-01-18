package com.hfad.fusballfixtures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MadSevActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_sev);

        //ticket hyperlink >> not working
        Button ticketbtn = (MaterialButton) findViewById(R.id.ticketbtn);
        ImageView stadium_map = (ImageView) findViewById(R.id.stadium_map);
        ImageButton home_btn = (ImageButton) findViewById(R.id.home_btn);

        ticketbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.realmadrid.com/en/tickets"));
                startActivity(browser);
            }
        });

        stadium_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Santiago+Bernabeu/" +
                                                                        "@40.4523638,-3.6906504,286m/data=!3m1!1e3!4m8!1m2!2m1!1" +
                                                                        "sbernabeu!3m4!1s0xd4228e2fe54acd3:0x7bdf12a106fcb23e!8m2!3d40" +
                                                                        ".4521893!4d-3.690659"));
                startActivity(browser);
            }
        });

        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MadSevActivity.this, HomeActivity.class));
            }
        });

    }
}