package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Ysp extends AppCompatActivity {
    Button buttonCourseDetailysp;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ysp);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        buttonCourseDetailysp = findViewById(R.id.course_details_ysp);
        Button buttonCourseDetailysp = findViewById(R.id.course_details_ysp);
        buttonCourseDetailysp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenPDFysp();
            }
        });


    }

    public void OpenPDFysp() {
        Intent intent = new Intent(this, CourseDetailYsp.class);
        startActivity(intent);
    }


}
