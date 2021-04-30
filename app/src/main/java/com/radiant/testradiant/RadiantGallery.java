package com.radiant.testradiant;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class RadiantGallery extends AppCompatActivity {


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiant_gallery);
        getSupportActionBar().setTitle("Radiant Academy");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


//        ImageSlider imageSlider = findViewById(R.id.slider);
//
//        List <SlideModel> slideModels = new ArrayList<>();
//        slideModels.add(new SlideModel("https://picsum.photos/id/237/200/300","1 Image"));
//        slideModels.add(new SlideModel("https://picsum.photos/200/300?grayscale","2 Image"));
//        slideModels.add(new SlideModel("https://picsum.photos/200/300/?blur","3 Image"));
//
//        imageSlider.setImageList(slideModels,true);
////        slideModels.add(new SlideModel("",""));
////        slideModels.add(new SlideModel("",""));
////        slideModels.add(new SlideModel("",""));
    }


}