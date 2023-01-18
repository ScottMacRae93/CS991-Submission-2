package com.hfad.fusballfixtures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView haveacc_btn = (TextView) findViewById(R.id.haveacc);
        MaterialButton createacc_btn = (MaterialButton) findViewById(R.id.createaccbtn);

        haveacc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });


        createacc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "Thank you for registering! " +
                        "To activate your account please follow the link in the confirmation email we have sent", Toast.LENGTH_SHORT).show();
            }
        });

    }
}