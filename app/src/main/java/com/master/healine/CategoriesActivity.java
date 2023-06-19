package com.master.healine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class CategoriesActivity extends AppCompatActivity {

    Button preg,toddler,child,teen,adult,midAdult,seniorAdult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        preg=findViewById(R.id.preg);
        toddler=findViewById(R.id.toddler);
        child=findViewById(R.id.child);
        adult=findViewById(R.id.adult);
        midAdult=findViewById(R.id.middleAge);
        seniorAdult=findViewById(R.id.senior);


        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        preg.startAnimation(animation);

        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slidein);
        toddler.startAnimation(animation1);

        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        child.startAnimation(animation2);


        Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        adult.startAnimation(animation4);

        Animation animation5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slidein);
        midAdult.startAnimation(animation5);

        Animation animation6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        seniorAdult.startAnimation(animation6);



        adult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoriesActivity.this,DashboardActivity.class));
            }
        });

    }
}