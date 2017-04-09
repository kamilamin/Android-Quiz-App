package com.example.vc.kamilquiz;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public  void QuizApp2(View v){
        RadioButton R9 = (RadioButton) findViewById(R.id.radioButton9);
        RadioButton R10 = (RadioButton) findViewById(R.id.radioButton10);
        RadioButton R11 = (RadioButton) findViewById(R.id.radioButton11);
        RadioButton R12 = (RadioButton) findViewById(R.id.radioButton12);

        if(R9.isChecked()){
            Global.score3 = Global.score3 + 10;
        } else if(R10.isChecked()){
            Global.score3 = 0;
        } else if(R11.isChecked()){
            Global.score3 = 0;
        } else if(R12.isChecked()){
            Global.score3 = 0;
        }

        Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(intent);
    }
}
