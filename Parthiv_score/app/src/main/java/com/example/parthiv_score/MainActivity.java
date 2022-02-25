package com.example.parthiv_score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView team1_score, team2_score;
    Button inc_team1,dec_team1,inc_team2,dec_team2;
    RadioGroup radioGroup;
    RadioButton radioButton;
    int team1 =0;
    int team2 =0;
    String t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1_score= findViewById(R.id.t1_score);
        team2_score =findViewById(R.id.t2_score);
        inc_team1 = findViewById(R.id.inc_team1);
        dec_team1= findViewById(R.id.dec_team1);
        inc_team2=findViewById(R.id.inc_team2);
        dec_team2 = findViewById(R.id.dec_team2);

        radioGroup = findViewById(R.id.radio_group);

        inc_team1.setOnClickListener(view -> {

            int Id = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(Id);
                if (Id==R.id.radioButton1)
                {
                    team1 = team1+1;
                    t1 = String.valueOf(team1);
                    team1_score.setText(t1);

                }
                else if (Id==R.id.radioButton2)
                {
                    team1 = team1+2;
                    t1 = String.valueOf(team1);
                    team1_score.setText(t1);
                }
                else if (Id==R.id.radioButton3)
                {
                    team1 = team1+3;
                    t1 = String.valueOf(team1);
                    team1_score.setText(t1);
                }
            });

        dec_team1.setOnClickListener(view -> {

            int Id = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(Id);
                if (Id==R.id.radioButton1)
                {
                       team1 = team1-1;
                        t1 = String.valueOf(team1);
                        team1_score.setText(t1);
                }
                else if (Id==R.id.radioButton2)
                {
                        team1 = team1-2;
                        t1 = String.valueOf(team1);
                        team1_score.setText(t1);
                }
                else if (Id==R.id.radioButton3)
                {

                        team1 = team1-3;
                        t1 = String.valueOf(team1);
                        team1_score.setText(t1);
                }
            });

        inc_team2.setOnClickListener(view -> {

            int Id = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(Id);
                if (Id==R.id.radioButton1)
                {
                    team2 = team2+1;
                    t2 = String.valueOf(team2);
                    team2_score.setText(t2);

                }
                else if (Id==R.id.radioButton2)
                {
                    team2 = team2+2;
                    t2 = String.valueOf(team2);
                    team2_score.setText(t2);
                }
                else if (Id==R.id.radioButton3)
                {
                    team2 = team2+3;
                    t2 = String.valueOf(team2);
                    team2_score.setText(t2);
                }
            });

        dec_team2.setOnClickListener(view -> {
            int Id = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(Id);
                if (Id==R.id.radioButton1)
                {

                        team2 = team2-1;
                        t2 = String.valueOf(team2);
                        team2_score.setText(t2);
                }
                else if (Id==R.id.radioButton2)
                {

                        team2 = team2-2;
                        t2 = String.valueOf(team2);
                        team2_score.setText(t2);
                }
                else if (Id==R.id.radioButton3)
                {

                        team2 = team2-3;
                        t2 = String.valueOf(team2);
                        team2_score.setText(t2);
                }

        });

    }
}
