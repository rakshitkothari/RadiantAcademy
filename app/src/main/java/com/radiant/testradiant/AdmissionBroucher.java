package com.radiant.testradiant;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AdmissionBroucher extends AppCompatActivity {
    PDFView pdfad;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_broucher);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        pdfad=(PDFView) findViewById(R.id.pdfadmissionbroucher11);
        pdfad.fromAsset("pdfradiantadmissionbroucher.pdf").load();
    }
}