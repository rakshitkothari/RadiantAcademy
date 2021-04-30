package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    private Button button;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        //getSupportActionBar().hide();

//     getSupportActionBar().setDisplayShowHomeEnabled(true);
//     getSupportActionBar().setLogo(R.mipmap.ic_launcher);      // for icon before name
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_message);

        getSupportActionBar().setTitle("Radiant Academy");
//         getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


//        getSupportActionBar().hide();
        ImageView aboutus = findViewById(R.id.i100);


        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"Before",Toast.LENGTH_LONG).show();
                AboutUsProgramme();
                // Toast.makeText(getApplicationContext(),"After",Toast.LENGTH_LONG).show();

            }
        });


        ImageView courses = findViewById(R.id.i2);
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Courses",Toast.LENGTH_LONG).show();
                CourseProgramme();
            }
        });
        ImageView admissionbroucher = findViewById(R.id.i3);
        admissionbroucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Courses",Toast.LENGTH_LONG).show();
                AdmissionBroucher();
            }
        });


        ImageView fees = findViewById(R.id.i4);
        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Courses",Toast.LENGTH_LONG).show();
                Fees();
            }
        });

        ImageView scholarship = findViewById(R.id.i5);
        scholarship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Courses",Toast.LENGTH_LONG).show();
                RadiantScholarship();
            }
        });

        ImageView gallery = findViewById(R.id.i6);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Courses",Toast.LENGTH_LONG).show();
                RadiantGallery();
            }
        });
        ImageView applynow = findViewById(R.id.i7);
        applynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Courses",Toast.LENGTH_LONG).show();
                ApplyNow();
            }
        });
        ImageView contactus = findViewById(R.id.i8);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Courses",Toast.LENGTH_LONG).show();
                ContactUs();
            }
        });
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void AboutUsProgramme() {
        Intent intent = new Intent(this, AboutUsProgramme.class);
        startActivity(intent);
    }
    public void RadiantScholarship() {
        Intent intent = new Intent(this, Scholarship.class);
        startActivity(intent);
    }


    public void AdmissionBroucher() {
        Intent intent = new Intent(this, AdmissionsProgramme.class);
        startActivity(intent);
    }

    public void CourseProgramme() {
        Intent intent = new Intent(this, CourseProgramme.class);
        startActivity(intent);
    }

    public void Fees() {
        Intent intent = new Intent(this, Fee.class);
        startActivity(intent);
    }

    public void RadiantGallery() {
        Intent intent = new Intent(this, RadiantGallery.class);
        startActivity(intent);
    }

    public void ApplyNow() {
        Intent intent = new Intent(this, ApplyNow.class);
        startActivity(intent);
    }


    public void ContactUs() {
        Intent intent = new Intent(this, ContactUs.class);
        startActivity(intent);
    }
}