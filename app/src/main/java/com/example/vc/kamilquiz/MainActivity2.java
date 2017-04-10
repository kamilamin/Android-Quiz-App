package com.example.vc.kamilquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void QuizApp(View V){
        RadioButton R5 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton R6= (RadioButton) findViewById(R.id.radioButton6);
        RadioButton R7 = (RadioButton) findViewById(R.id.radioButton7);
        RadioButton R8 = (RadioButton) findViewById(R.id.radioButton8);

        if(R5.isChecked()){
            Global.score2 = 0;
        }else if(R6.isChecked()) {
            Global.score2 = 0;
        } else if(R7.isChecked()){
            Global.score2 += 10;
        } else if(R8.isChecked()){
            Global.score2 = 0;
        }
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
    }
}
