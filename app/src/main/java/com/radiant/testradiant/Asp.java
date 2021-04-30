package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Asp extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asp);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        ImageView jee = findViewById(R.id.i211);
        jee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Courses",Toast.LENGTH_LONG).show();
                Jee();
            }
        });
        ImageView neet = findViewById(R.id.i212);
        neet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Courses",Toast.LENGTH_LONG).show();
                Neet();
            }
        });
    }

    public void Jee() {
        Intent intent = new Intent(this, Jee.class);
        startActivity(intent);
    }

    public void Neet() {
        Intent intent = new Intent(this, Neet.class);
        startActivity(intent);
    }
}