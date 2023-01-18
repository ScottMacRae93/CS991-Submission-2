package com.hfad.fusballfixtures;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.navigation.NavigationBarView;

public class SearchActivity extends AppCompatActivity {
    ImageButton homeImageButton;
    ImageButton followImageButton;
    private TextView mdatePickerbtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        homeImageButton = (ImageButton) findViewById(R.id.home);
        homeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadHomeActivity = new Intent(SearchActivity.this, HomeActivity.class);
                startActivity(intentLoadHomeActivity);
            }
        });

        followImageButton = (ImageButton) findViewById(R.id.follow);
        followImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadFollowPageActivity = new Intent(SearchActivity.this, FollowPageActivity.class);
                startActivity(intentLoadFollowPageActivity);
            }
        });

        Button searchbtn = (MaterialButton) findViewById(R.id.search_btn);
        TextView dates = (TextView) findViewById(R.id.dates);
        TextView city = (TextView) findViewById(R.id.city_team_box);
        mdatePickerbtn = findViewById(R.id.dates);

        //MaterialDatePicker
        MaterialDatePicker.Builder<Pair<Long, Long>> builder = MaterialDatePicker.Builder.dateRangePicker();

        MaterialDatePicker materialDatePicker = builder.build();

        mdatePickerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materialDatePicker.show(getSupportFragmentManager(), "DATE_PICKER");
            }
        });

        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                dates.setText(materialDatePicker.getHeaderText());
            }
        });

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //madrid
                if (city.getText().toString().equals("Madrid") && dates.getText().toString().equals("Jun 13 – Jun 14")) {
                    startActivity(new Intent(SearchActivity.this, MadridActivity.class));
                //lisbon
                } else if (city.getText().toString().equals("Lisbon") && dates.getText().toString().equals("Jun 13 – Jun 14")) {
                    startActivity(new Intent(SearchActivity.this, LisbonActivity.class));
                //no results
                } else {
                    Toast.makeText(SearchActivity.this, "No fixtures returned from search parameters.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}