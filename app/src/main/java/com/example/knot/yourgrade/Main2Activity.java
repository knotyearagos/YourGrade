package com.example.knot.yourgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("string value");
        int score = intent.getIntExtra("int value",0);


        TextView textData = (TextView)findViewById(R.id.ResultName);
        textData.setText(name);

        if(score>=80) {
            TextView textData2 = (TextView) findViewById(R.id.ResultGrade);
            textData2.setText("A");
        }

        else if(score>=70&&score<=79) {
            TextView textData2 = (TextView) findViewById(R.id.ResultGrade);
            textData2.setText("B");
        }

        else if(score>=60&&score<=69) {
            TextView textData2 = (TextView) findViewById(R.id.ResultGrade);
            textData2.setText("C");
        }

        else if(score>=60&&score<=69) {
            TextView textData2 = (TextView) findViewById(R.id.ResultGrade);
            textData2.setText("C");
        }

        else if(score>=50&&score<=59) {
            TextView textData2 = (TextView) findViewById(R.id.ResultGrade);
            textData2.setText("D");
        }

        else if(score<=49) {
            TextView textData2 = (TextView) findViewById(R.id.ResultGrade);
            textData2.setText("F");
        }
    }
}
