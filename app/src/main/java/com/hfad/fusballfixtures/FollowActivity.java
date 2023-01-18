package com.hfad.fusballfixtures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;

import com.google.android.material.button.MaterialButton;

public class FollowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow);

        ImageButton barc_btn = (ImageButton) findViewById(R.id.barcbtn);
        ImageButton westham_btn = (ImageButton) findViewById(R.id.westhambtn);
        ImageButton barc_flw = (ImageButton) findViewById(R.id.barcbtn_flw);
        ImageButton westham_flw = (ImageButton) findViewById(R.id.westham_flw);
        MaterialButton next_btn = (MaterialButton) findViewById(R.id.next_button);



        barc_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                barc_flw.setVisibility(v.VISIBLE);
                barc_btn.setBackgroundColor(getResources().getColor(R.color.neon_yellow));
            }
        });

        westham_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                westham_flw.setVisibility(View.VISIBLE);
                westham_btn.setBackgroundColor(getResources().getColor(R.color.neon_yellow));
            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FollowActivity.this, HomeActivity.class));
            }
        });
    }
}