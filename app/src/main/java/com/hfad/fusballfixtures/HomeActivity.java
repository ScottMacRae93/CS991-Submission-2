package com.hfad.fusballfixtures;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    ImageButton searchImageButton;
    ImageButton followImageButton;
    ImageButton logoutButton;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ListView listView;
        List list = new ArrayList();
                //new code
        searchImageButton = (ImageButton) findViewById(R.id.search);
        searchImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadSearchActivity = new Intent(HomeActivity.this, SearchActivity.class);
                startActivity(intentLoadSearchActivity);
            }
        });

        followImageButton = (ImageButton) findViewById(R.id.follow);
        followImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadFollowPageActivity = new Intent(HomeActivity.this, FollowPageActivity.class);
                startActivity(intentLoadFollowPageActivity);
            }
        });

        logoutButton = (ImageButton) findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadLogoutActivity = new Intent(HomeActivity.this, LogoutActivity.class);
                startActivity(intentLoadLogoutActivity);
            }
        });
        //end code

/*        Button gotosearchbtn = (MaterialButton) findViewById(R.id.gotosearch);

        gotosearchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, SearchActivity.class));
            }
        });*/

        listView = (ListView) findViewById(R.id.list_view);

        list.add(" London \n Stadium\n\n                WEST HAM   VS  CHELSEA\n\n Sun 13 Mar\n 16:00 \n");
        list.add(" Camp \n Nou\n\n              FC BARCELONA   VS  OSASUNA\n\n Sun 13 Mar\n 21:00 \n");
        list.add(" Rajko Mitic \n Stadium\n\n               CRVENA ZVEZDA   VS  WEST HAM\n\n Thur 17 Mar\n 17:45 \n");
        list.add(" Nef \n Stadyumu\n\n              GALATASARAY   VS  FC BARCELONA\n\n Thur 17 Mar \n 18:45 \n");
        list.add(" Elland \n Road\n\n             LEEDS UTD   VS  WEST HAM\n\n Sun 20 Mar\n 12:00 \n");
        list.add(" Santiago \n Bernabeu\n\n             REAL MADRID   VS  FC BARCELONA\n\n Sun 20 Mar\n 21:00 \n");


        adapter = new ArrayAdapter(getApplicationContext(),R.layout.text_layout,list);
        listView.setAdapter(adapter);
        // adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.text_layout,list);

    }






}