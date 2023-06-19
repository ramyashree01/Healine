package com.master.healine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title,tagline;
        Button btn;
        ImageView screen;

        title=findViewById(R.id.title);
        tagline= findViewById(R.id.tagline);
        btn=findViewById(R.id.button);



        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.heading);
        title.startAnimation(animation1);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FeatureActivity.class));
            }
        });
    }
}