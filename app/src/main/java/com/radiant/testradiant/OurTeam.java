package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class OurTeam extends AppCompatActivity {
//    ImageView imageView;
//    ZoomControls zoomControls;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_team);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

//        imageView = findViewById(R.id.ourteam);
//        zoomControls = findViewById(R.id.zoom_controls);
//        zoomControls.hide();
//
//        imageView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                zoomControls.show();
//                return false;
//            }
//        });
//
//
//        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                float x = imageView.getScaleX();
//                float y = imageView.getScaleY();
//                imageView.setScaleX((float) (x + 1));
//                imageView.setScaleY((float) (y + 1));
//                zoomControls.hide();
//            }
//        });
//
//        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                float x = imageView.getScaleX();
//                float y = imageView.getScaleY();
//                if (x == 1 && y == 1) {
//                     imageView.setScaleX(x);
//                     imageView.setScaleY(y);
//                } else {
//                    imageView.setScaleX((float) (x + 1));
//                    imageView.setScaleY((float) (y + 1));
//                    zoomControls.hide();
//                }
//
//            }
//        });

    }
}