package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.afinal.utils.Constants;
import com.example.afinal.utils.Utils;

public class FinalResultActivity extends AppCompatActivity {

    private TextView tvSubject, tvCorrect, tvIncorrect, tvOverallStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_result);

        Intent intent = getIntent();
        int correctAnswer = intent.getIntExtra(Constants.CORRECT, 0);
        int incorrectAnswer = intent.getIntExtra(Constants.INCORRECT, 0);
        String subject = intent.getStringExtra(Constants.SUBJECT);

        tvSubject = findViewById(R.id.textSubject);
        tvCorrect = findViewById(R.id.textCorrect);
        tvIncorrect = findViewById(R.id.textIncorrect);
        tvOverallStatus = findViewById(R.id.textOverall);

        findViewById(R.id.imageViewFinalResultQuiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalResultActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        findViewById(R.id.btnFinishQuiz).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalResultActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        tvSubject.setText(subject);
        tvCorrect.setText(Integer.toString(correctAnswer));
        tvIncorrect.setText(Integer.toString(incorrectAnswer));
        tvOverallStatus.setText(Utils.getOverAllStatus(correctAnswer));
    }
}