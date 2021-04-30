package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CourseProgramme extends AppCompatActivity {

    Button btn_book1, btn_book2;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_programme);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

//        btn_book1 = (Button) findViewById(R.id.book1);
//        btn_book2 = (Button) findViewById(R.id.book2);
//
//        btn_book1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(CourseProgramme.this, Book1.class);
//                startActivity(i);
//            }
//        });
//
//        btn_book1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i2 = new Intent(CourseProgramme.this, Book2.class);
//                startActivity(i2);
//            }
//        });


        ImageView asp = findViewById(R.id.i21);
        asp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                Asp();
            }
        });
        ImageView ysp = findViewById(R.id.i22);
        ysp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                Ysp();
            }
        });
    }

    public void Asp() {
        Intent intent = new Intent(this, Asp.class);
        startActivity(intent);
    }

    public void Ysp() {
        Intent intent = new Intent(this, Ysp.class);
        startActivity(intent);
    }

}



