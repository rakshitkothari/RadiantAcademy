package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AdmissionsProgramme extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissions_programme);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        ImageView admissionbrochure = findViewById(R.id.pdfadmissionbroucher11);
        admissionbrochure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                AdmissionBroucher();
            }
        });

        ImageView informaationguide = findViewById(R.id.pdfinformationguide11);
        informaationguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                RadiantInformationGuide();
            }
        });

        ImageView canceladmission = findViewById(R.id.i33);
        canceladmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                CancelAdmission();
            }
        });
    }

    public void AdmissionBroucher() {
        Intent intent = new Intent(this, AdmissionBroucher.class);
        startActivity(intent);
    }

    public void RadiantInformationGuide() {
        Intent intent = new Intent(this, InformationGuide.class);
        startActivity(intent);
    }

    public void CancelAdmission() {
        Intent intent = new Intent(this, CancellationOfAdmission.class);
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}