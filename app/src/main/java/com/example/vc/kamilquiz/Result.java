package com.example.vc.kamilquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    public void onClick(View v){
        EditText ET = (EditText) findViewById(R.id.editText);
        ET.setText("score is: " + Global.result);
    }
}
