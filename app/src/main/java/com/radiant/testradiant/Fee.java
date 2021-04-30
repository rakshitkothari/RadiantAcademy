package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Fee extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        ImageView feestructure = findViewById(R.id.fees_structure);
        feestructure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                RadiantFeeStructure();
            }
        });

        ImageView feedepositmode = findViewById(R.id.i212);
        feedepositmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                RadiantFeeDepositMode();
            }
        });
    }
    public void RadiantFeeStructure() {
        Intent intent = new Intent(this, FeeStructure.class);
        startActivity(intent);
    }
    public void RadiantFeeDepositMode() {
        Intent intent = new Intent(this, FeeDepositMode.class);
        startActivity(intent);
    }
}