package com.example.vc.kamilquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void QuizApp3(View v){
        RadioButton R13 = (RadioButton) findViewById(R.id.radioButton13);
        RadioButton R14 = (RadioButton) findViewById(R.id.radioButton14);
        RadioButton R15 = (RadioButton) findViewById(R.id.radioButton15);
        RadioButton R16 = (RadioButton) findViewById(R.id.radioButton16);

        if(R13.isChecked()){
            Global.score4 = 0;
        } else if(R14.isChecked()){
            Global.score4 = 0;
        } else if(R15.isChecked()){
            Global.score4 = 0;
        } else if(R16.isChecked()){
            Global.score4 = 0;
        }

        Intent intent = new Intent(MainActivity4.this, Result.class);
            startActivity(intent);
    }
}
