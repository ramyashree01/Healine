
package com.master.healine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeatureActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);
        Button continues;

        continues=(Button) findViewById(R.id.cn);

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        // Data
        FeatureModel[] myListData = new FeatureModel[]{
                new FeatureModel("Food Good", "Let's start our diet journey..",R.raw.dietfood),
                new FeatureModel("Recipe", "Our app helps to have \n healthy and tasty food",R.raw.recipe),
                new FeatureModel("Be Choosy", "We assist to clear all \n your doubts",R.raw.choose),
                new FeatureModel("Stay Fit", "Our expert clears \n all your hurdles",R.raw.nutrition)

        };

        // Adapter

        fAdapter adapter = new fAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


        continues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FeatureActivity.this,LoginActivity.class));
            }
        });

    }




    }
