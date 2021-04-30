package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Neet extends AppCompatActivity {

    Button buttonCourseDetailneet;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neet);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        buttonCourseDetailneet = findViewById(R.id.course_details_neet);
        Button buttonCourseDetailneet = findViewById(R.id.course_details_neet);
        buttonCourseDetailneet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenPDF1();
            }
        });
    }
    public void OpenPDF1() {
        Intent intent = new Intent(this, CourseDetailJeePdf.class);
        startActivity(intent);
    }
}