package com.master.healine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionnaireActivity extends AppCompatActivity implements View.OnClickListener{

    TextView totalQ;
    TextView q;
    Button a,b,c;
    Button submit;

    int totalQuestions = Questions.question.length;
    int currentQuestionIndex1= 0;
    int currentQuestionIndex2= 0;
    int currentQuestionIndex3= 0;
    int currentQuestionIndex= 0;
    int k =1;
    int p =1;
    int v =1;

    String selectedOption ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        totalQ=findViewById(R.id.totalQ);
        q=findViewById(R.id.question);
        a=findViewById(R.id.ansA);
        b=findViewById(R.id.ansB);
        c=findViewById(R.id.ansC);

        submit=findViewById(R.id.submitBtn);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);

        submit.setOnClickListener(this);

        totalQ.setText("Total questions : "+totalQuestions);

        loadNewQuestion();




    }

    private void loadNewQuestion() {

        if(currentQuestionIndex == totalQuestions){
            finishQuiz();
            return;
        }

        q.setText(Questions.question[currentQuestionIndex]);
        a.setText(Questions.Options[currentQuestionIndex][0]);
        b.setText(Questions.Options[currentQuestionIndex][1]);
        c.setText(Questions.Options[currentQuestionIndex][2]);

    }

    private void finishQuiz() {


        if(k>totalQuestions*0.60){
            new AlertDialog.Builder(this)
                    .setTitle("Kapha")
                    .setMessage("Your body state is in Kapha" )
                    .setPositiveButton("See the details",(dialogInterface, i) -> startActivity(new Intent(QuestionnaireActivity.this,KaphaActivity.class)))
                    .setCancelable(false)
                    .show();
        }
        if(v>totalQuestions*0.60){
            new AlertDialog.Builder(this)
                    .setTitle("Vitta")
                    .setMessage("Your body state is in Vitta" )
                    .setPositiveButton("See the details",(dialogInterface, i) -> startActivity(new Intent(QuestionnaireActivity.this,VattaActivity.class)))
                    .setCancelable(false)
                    .show();
        }
        if(p>totalQuestions*0.60){
            new AlertDialog.Builder(this)
                    .setTitle("Pitta")
                    .setMessage("Your body state is in Pitta" )
                    .setPositiveButton("See the details",(dialogInterface, i) -> startActivity(new Intent(QuestionnaireActivity.this,PittaActivity.class)))
                    .setCancelable(false)
                    .show();
        }








    }

    @Override
    public void onClick(View view) {

        a.setBackgroundColor(Color.GRAY);
        b.setBackgroundColor(Color.GRAY);
        c.setBackgroundColor(Color.GRAY);


        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submitBtn){

            currentQuestionIndex++;



            loadNewQuestion();



            if(selectedOption.equals(Questions.Kapha[currentQuestionIndex1])){
                k++;
                currentQuestionIndex1++;


            }
            if(selectedOption.equals(Questions.vitta[currentQuestionIndex2])){
                v++;
                currentQuestionIndex2++;


            }
            if(selectedOption.equals(Questions.pitta[currentQuestionIndex3])){
                p++;
                currentQuestionIndex3++;



            }


        }else{
            selectedOption = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.WHITE);
        }
    }
}




