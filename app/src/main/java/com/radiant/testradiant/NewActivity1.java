package com.radiant.testradiant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.radiant.testradiant.ui.login.LoginActivity;

public class NewActivity1 extends AppCompatActivity {

    Button buttonGuest, buttonStudent;
    Animation scaleUp, scaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new1);
        getSupportActionBar().hide();


        buttonGuest = findViewById(R.id.button_guest);
        buttonStudent = findViewById(R.id.button_student1);

        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);


        // For animation of the button

//        buttonStudent.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent motionEvent) {
//
//                if (motionEvent.getAction() == MotionEvent.ACTION_UP)
//                {
//                    buttonStudent.startAnimation(scaleUp);
//                }
//                else if (motionEvent.getAction() == MotionEvent.ACTION_DOWN)
//                {
//                    buttonStudent.startAnimation(scaleDown);
//                }
//                return true;
//            }
//        });

        Button buttonGuest = findViewById(R.id.button_guest);
        buttonGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenForGuest();
            }
        });
        Button buttonStudent = findViewById(R.id.button_student1);
        buttonStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenForStudent();
            }
        });

    
    }

    public void OpenForGuest() {
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }

    public void OpenForStudent() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}
