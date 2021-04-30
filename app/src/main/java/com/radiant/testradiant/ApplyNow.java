package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ApplyNow extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_now);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }

    public void browser2(View view) {
        Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSc-ipv7wSU5bDZymqP8xOE-QDuqPWqtvIP0EQOQq70UW8Bc6g/viewform"));
        startActivity(browserIntent1);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}