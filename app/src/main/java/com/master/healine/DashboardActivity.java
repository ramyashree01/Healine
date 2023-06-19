package com.master.healine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {



    BottomNavigationView bottomNavigationView;

    Button q,blog,workout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        q=findViewById(R.id.q1);
        blog=findViewById(R.id.blog);
        workout=findViewById(R.id.workout);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(this::onNavigationItemSelected);
        //bottomNavigationView.setSelectedItemId(R.id.recipe);

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,QuestionnaireActivity.class));
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,BlogsActivity.class));
            }
        });

        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this,WorkoutActivity.class));
            }
        });

    }




    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.recipe:
                startActivity(new Intent(DashboardActivity.this,RecipeActivity.class));
                return true;

            case R.id.game:
                startActivity(new Intent(DashboardActivity.this,AddPlayers.class));
                return true;


            case R.id.nutritionist:
                startActivity(new Intent(DashboardActivity.this,NutritionActivity.class));
                return true;


            case R.id.scanner:
                startActivity(new Intent(DashboardActivity.this,ScannerActivity.class));
                return true;

            case R.id.foodDetect:
                startActivity(new Intent(DashboardActivity.this,FDetect.class));
                return true;


        }

        return false;

    }
}