package com.hfad.fusballfixtures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MadridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madrid);

        TextView fix1teams = (TextView) findViewById(R.id.fix1teams);

        fix1teams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MadridActivity.this, MadSevActivity.class));
            }
        });

        // extras intent to grab dates >> java ISAFTER / ISBEFORE > does java date class exist in android studio
    }
}