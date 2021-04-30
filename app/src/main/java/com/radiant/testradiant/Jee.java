package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Jee extends AppCompatActivity {

    Button buttonCourseDetailjee;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jee);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        buttonCourseDetailjee = findViewById(R.id.pdfjeecourse);
        Button buttonCourseDetails = findViewById(R.id.pdfjeecourse);
        buttonCourseDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenPDF();
            }
        });


    }

    public void     OpenPDF() {
        Intent intent = new Intent(this, CourseDetailJeePdf.class);
        startActivity(intent);
    }


}