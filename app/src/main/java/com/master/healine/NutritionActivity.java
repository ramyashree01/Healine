package com.master.healine;





        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

public class NutritionActivity extends AppCompatActivity  {
    Button bttn;

    ImageView screen;
    TextView txt;
    TextView txt1;
    Button btn;
    Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        screen = findViewById(R.id.nut);
        txt = findViewById(R.id.textView);
        txt1 = findViewById(R.id.textView1);
        btn = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.nutri_anim);
        screen.startAnimation(animation2);

        Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.nutri_anim);
        txt.startAnimation(animation3);

        Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.nutri_anim);
        txt1.startAnimation(animation4);

        Animation animation5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.nutri_anim);
        btn.startAnimation(animation5);

        Animation animation6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.nutri_anim);
        btn2.startAnimation(animation6);

        bttn = findViewById(R.id.btn2);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wpurl = "https://wa.me/+918197810641?text=Hello Maám?";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                openCertificate();

            }
        });
    }

    public void openCertificate(){
        Intent intent = new Intent(this, Cer.class);
        startActivity(intent);
    }



}