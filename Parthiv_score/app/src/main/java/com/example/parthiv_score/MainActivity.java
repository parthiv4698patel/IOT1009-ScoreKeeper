package com.example.parthiv_score;

/* import */
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* Initialization */
    Switch aSwitch;
    TextView team1_score, team2_score;
    Button inc_team1,dec_team1,inc_team2,dec_team2;
    RadioGroup radioGroup;
    RadioButton radioButton;
    int team1 =0;
    int team2 =0;
    String t1,t2;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.score_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Toast.makeText(this, "Created by Parthiv Patel"+"\n"+"Student Id: A00226243"+"\n"+ "Course code: IOT-1009", Toast.LENGTH_LONG).show();
                return true;
            case R.id.settings:
                Intent myintent = new Intent(MainActivity.this, NewSettings.class);
                startActivity(myintent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



    /*On create method for Dark mode on and off*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.DarkTheme);
        }
        else{
            setTheme(R.style.AppTheme);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch = findViewById(R.id.mode);
        team1_score= findViewById(R.id.t1_score);
        team2_score =findViewById(R.id.t2_score);
        inc_team1 = findViewById(R.id.inc_team1);
        dec_team1= findViewById(R.id.dec_team1);
        inc_team2=findViewById(R.id.inc_team2);
        dec_team2 = findViewById(R.id.dec_team2);
        radioGroup = findViewById(R.id.radio_group);

        if(AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES){
            aSwitch.setChecked(true);
        }

        /* Condition to turn on dark mode on and off*/
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        /*Increment button for team 1*/
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

        /*Decrement button for team 1*/
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

        /*Increment button for team 2*/
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

        /*Decrement button for team 2*/
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
