package com.example.android_user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText myname;
    private Button myAss;
    private EditText myN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        myname = findViewById(R.id.myname);
        myN = findViewById(R.id.myN);
        myAss = findViewById(R.id.myAss);
        myAss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(myname.getText().toString());
                int num2 = Integer.parseInt(myN.getText().toString());

                int rel=num1+num2;

                Toast.makeText(MainActivity.this, "The Sum of two numbers:" + String.valueOf(rel).toString(),Toast.LENGTH_LONG).show();

            }
        });

    }
}
