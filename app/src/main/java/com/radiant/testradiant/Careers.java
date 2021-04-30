package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Careers extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_careers);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void browser3(View view) {
        Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/1EEThu9ToAm6SIbhTDI32tRZxupGHYprsEbGEVjVTu9o/edit?ts=6083b38b&gxids=7628"));
        startActivity(browserIntent1);
    }

}