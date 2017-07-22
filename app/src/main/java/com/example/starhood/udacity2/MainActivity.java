package com.example.starhood.udacity2;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int Player1Score,Player2Score,Player3Score,Player4Score;
    EditText P1,P2,P3,P4;
    TextView viewScore1,viewScore2,viewScore3,viewScore4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        P1= (EditText)findViewById(R.id.IncomeScore1);
        P2= (EditText)findViewById(R.id.IncomeScore2);
        P3= (EditText)findViewById(R.id.IncomeScore3);
        P4= (EditText)findViewById(R.id.IncomeScore4);

        viewScore1 =(TextView)findViewById(R.id.Player1_Score);
        viewScore2 =(TextView)findViewById(R.id.Player2_Score);
        viewScore3 =(TextView)findViewById(R.id.Player3_Score);
        viewScore4 =(TextView)findViewById(R.id.Player4_Score);
    }

    //ADD VALUE FOR First Player
    public void Player1AddScore(View view) {

        //Empty Impute error handling
        if(P1.getText().toString().isEmpty()) {
            Toast toast = Toast.makeText(this, "NULL value !!", Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        String score= P1.getText().toString();
        Player1Score+= Integer.parseInt(score);
        P1.clearComposingText();
        viewScore1.setText(Player1Score+" Points");
    }

    //ADD VALUE FOR Second Player
    public void Player2AddScore(View view) {

        //Empty Impute error handling
        if(P2.getText().toString().isEmpty()) {
            Toast toast = Toast.makeText(this, "NULL value !!", Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        String score= P2.getText().toString();
        Player2Score+= Integer.parseInt(score);
        P2.clearComposingText();
        viewScore2.setText(Player2Score+" Points");
    }

    //ADD VALUE FOR third Player
    public void Player3AddScore(View view) {

        //Empty Impute error handling
        if(P3.getText().toString().isEmpty()) {
            Toast toast = Toast.makeText(this, "NULL value !!", Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        String score= P3.getText().toString();
        Player3Score+= Integer.parseInt(score);
        P3.clearComposingText();
        viewScore3.setText(Player3Score+" Points");

    }

    ////ADD VALUE FOR Fourth Player
    public void Player4AddScore(View view) {

        //Empty Impute error handling
        if(P4.getText().toString().isEmpty()) {
            Toast toast = Toast.makeText(this, "NULL value !!", Toast.LENGTH_LONG);
            toast.show();
            return;
        }
        String score= P4.getText().toString();
        Player4Score+= Integer.parseInt(score);
        P4.clearComposingText();
        viewScore4.setText(Player4Score+" Points");

    }


    ////Delete the First Player score
    public void ResetScore1(View view) {

        Player1Score =0;
        viewScore1.setText(Player1Score+" Points");

        Toast toast = Toast.makeText(this, "Player 1 Score Deleted", Toast.LENGTH_LONG);
        toast.show();
    }

    ////Delete the Second Player score
    public void ResetScore2(View view) {
        Player2Score =0;
        viewScore2.setText(Player2Score+" Points");

        Toast toast = Toast.makeText(this, "Player 2 Score Deleted", Toast.LENGTH_LONG);
        toast.show();
    }

    ////Delete the Third Player score
    public void ResetScore3(View view) {

        Player3Score =0;
        viewScore3.setText(Player3Score+" Points");

        Toast toast = Toast.makeText(this, "Player 3 Score Deleted", Toast.LENGTH_LONG);
        toast.show();
    }

    ////Delete the Fourth Player score
    public void ResetScore4(View view) {

        Player4Score =0;
        viewScore4.setText(Player4Score+" Points");

        Toast toast = Toast.makeText(this, "Player 4 Score Deleted", Toast.LENGTH_LONG);
        toast.show();
    }


    //compares all the player score to pick a winner
    public void PickWinner(View view) {
        String message="";

        if (Player1Score>=Player2Score&&Player1Score>=Player3Score&&Player1Score>=Player4Score)
        {
            if(Player1Score==Player2Score||Player1Score==Player3Score||Player1Score==Player4Score)
            {
                message="There is a Tie";
                Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
                toast.show();
                return;
            }
            else
            {
                message="Player 1 Wins";
                Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
                toast.show();
                return;

            }
        }else if (Player2Score>=Player1Score&&Player2Score>=Player3Score&&Player2Score>=Player4Score)
        {
            if(Player2Score==Player1Score||Player2Score==Player3Score||Player2Score==Player4Score)
            {
                message="There is a Tie";
                Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
                toast.show();
                return;
            }
            else
            {
                message="Player 2 Wins";
                Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
                toast.show();
                return;

            }
        }
        else if (Player3Score>=Player2Score&&Player3Score>=Player1Score&&Player3Score>=Player4Score)
        {
            if(Player3Score==Player2Score||Player3Score==Player1Score||Player3Score==Player4Score)
            {
                message="There is a Tie";
                Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
                toast.show();
                return;
            }
            else
            {
                message="Player 3 Wins";
                Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
                toast.show();
                return;

            }
        }
        else if (Player4Score>=Player2Score&&Player4Score>=Player3Score&&Player4Score>=Player1Score)
        {
            if(Player4Score==Player2Score||Player4Score==Player3Score||Player4Score==Player1Score)
            {
                message="There is a Tie";
                Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
                toast.show();
                return;
            }
            else
            {
                message="Player 4 Wins";
                Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
                toast.show();
                return;

            }
        }

    }

    //reset all the players values
    public void ResetAll(View view) {
        Player1Score =0;
        Player2Score =0;
        Player3Score =0;
        Player4Score =0;


        viewScore1.setText(Player1Score+" Points");
        viewScore2.setText(Player2Score+" Points");
        viewScore3.setText(Player3Score+" Points");
        viewScore4.setText(Player4Score+" Points");


        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "sadsa")
                .putExtra(AlarmClock.EXTRA_HOUR, 2)
                .putExtra(AlarmClock.EXTRA_MINUTES, 20);


        startActivity(intent);

        Toast toast = Toast.makeText(this, "All Scores Deleted", Toast.LENGTH_LONG);
        toast.show();
    }
}
