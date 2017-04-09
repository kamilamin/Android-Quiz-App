package com.example.vc.kamilquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Quiz(View v){
        RadioButton R1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton R2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton R3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton R4 = (RadioButton) findViewById(R.id.radioButton4);

        if(R1.isChecked()){
            Global.score1 = 0;
        } else if(R2.isChecked()){
            Global.score1 = 0;
        } else if(R3.isChecked()){
            Global.score1 = 0;
        } else if(R4.isChecked()){
            Global.score1 = Global.score1 + 10;
        }

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}
