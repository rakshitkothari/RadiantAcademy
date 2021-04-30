package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutUsProgramme extends AppCompatActivity {
    ImageView youtube;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_programme);

        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        youtube = findViewById(R.id.youtube);

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/results?search_query=the+radiant+academy");
            }
        });

        ImageView aboutradiant = findViewById(R.id.i11);
        aboutradiant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // Toast.makeText(getApplicationContext(),"Hello Rakshit", Toast.LENGTH_LONG).show();
                AboutRadiant();
            }
        });

        ImageView whychooseraddiant = findViewById(R.id.i12);
        whychooseraddiant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                WhyChooseRadiant();
            }
        });
        ImageView theradiantway = findViewById(R.id.i13);
        theradiantway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                TheRadiantWay();
            }
        });
        ImageView ourteam = findViewById(R.id.i14);
        ourteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                OurTeam();
            }
        });
        ImageView careers = findViewById(R.id.i15);
        careers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Hello Rakshit",Toast.LENGTH_LONG).show();
                Careers();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void AboutRadiant() {
        Intent intent = new Intent(this, AboutRadiant.class);
        startActivity(intent);
    }

    public void WhyChooseRadiant() {
        Intent intent = new Intent(this, WhyChooseRadiant.class);
        startActivity(intent);
    }

    public void TheRadiantWay() {
        Intent intent = new Intent(this, TheRadiantWay.class);
        startActivity(intent);
    }

    public void OurTeam() {
        Intent intent = new Intent(this, OurTeam.class);
        startActivity(intent);
    }

    public void Careers() {
        Intent intent = new Intent(this, Careers.class);
        startActivity(intent);
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}