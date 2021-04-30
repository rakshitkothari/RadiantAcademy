package com.radiant.testradiant;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FeeStructure extends AppCompatActivity {
    PDFView pdffe;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_structure);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pdffe=(PDFView) findViewById(R.id.fees_structure);
        pdffe.fromAsset("feestructure.pdf").load();
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}