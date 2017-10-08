package com.example.knot.yourgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    private EditText name, score;
    private Button find, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.Edit_Name);
        score = (EditText) findViewById(R.id.Edit_Score);
        find = (Button) findViewById(R.id.FindButton);
        exit = (Button) findViewById(R.id.ExitButton);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resultname = String.valueOf(name.getText().toString());
                int resultscore = Integer.valueOf(score.getText().toString());

                String error = "";
                String errorscore = Integer.toString(resultscore);

                if(resultname.equals(error)) {
                    name.setError("ป้อนชื่อ");
                }

                else if(errorscore.equals(error)) {
                    score.setError("ป้อนคะแนน");
                }

                else {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("int value", resultscore);
                    intent.putExtra("string value", resultname);
                    startActivity(intent);
                }
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Confirm Exit");
                dialog.setMessage("แน่ใจว่าต้องการออกจากแอพ?");

                dialog.setNegativeButton("ยกเลิก", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                dialog.setPositiveButton("ออก", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                });

                dialog.show();
            }
        });

    }
}
