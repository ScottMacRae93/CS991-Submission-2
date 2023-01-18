package com.hfad.fusballfixtures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FollowPageActivity extends AppCompatActivity {
    ImageButton homeImageButton;
    ImageButton searchImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_page);
        homeImageButton = (ImageButton) findViewById(R.id.home);
        homeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadHomeActivity = new Intent(FollowPageActivity.this, HomeActivity.class);
                startActivity(intentLoadHomeActivity);
            }
        });

        searchImageButton = (ImageButton) findViewById(R.id.search);
        searchImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadSearchActivity = new Intent(FollowPageActivity.this, SearchActivity.class);
                startActivity(intentLoadSearchActivity);
            }
        });
    }
}