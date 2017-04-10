package com.example.android.empollo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary nQuestionLibrary = new QuestionLibrary();

    private TextView nScoreView;
    private TextView nQuestionView;
    private Button nButtonChoice1;
    private Button nButtonChoice2;
    private Button nButtonChoice3;

    private String nAnswer;
    private int nScore = 0;
    private int nQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nScoreView = (TextView) findViewById(R.id.score);
        nQuestionView = (TextView) findViewById(R.id.question);
        nButtonChoice1 = (Button) findViewById(R.id.choice1);
        nButtonChoice2 = (Button) findViewById(R.id.choice2);
        nButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();

        //Button Listener Button1
        nButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (nButtonChoice1.getText() == nAnswer){
                    nScore = nScore + 1;
                    updateScore(nScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End Button Listener Button1
        //Button Listener Button2
        nButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (nButtonChoice2.getText() == nAnswer){
                    nScore = nScore + 1;
                    updateScore(nScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End Button Listener Button2
        //Button Listener Button3
        nButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (nButtonChoice3.getText() == nAnswer){
                    nScore = nScore + 1;
                    updateScore(nScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End Button Listener Button3
    }

    private void updateQuestion() {
        if (nQuestionNumber < nQuestionLibrary.getLength()) {
            nQuestionView.setText(nQuestionLibrary.getQuestion(nQuestionNumber));
            nButtonChoice1.setText(nQuestionLibrary.getChoice1(nQuestionNumber));
            nButtonChoice2.setText(nQuestionLibrary.getChoice2(nQuestionNumber));
            nButtonChoice3.setText(nQuestionLibrary.getChoice3(nQuestionNumber));

            nAnswer = nQuestionLibrary.getCorrectAnswer(nQuestionNumber);
            nQuestionNumber++;
        } else {
            Toast.makeText(MainActivity.this, "It was the last question", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, HighestScoreActivity.class);
            intent.putExtra("score", nScore);
            startActivity(intent);
        }

    }
    private void updateScore(int point) {
        nScoreView.setText("" + nScore);
    }
}
