package com.example.android_user.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.android_user.myapplication.R;

public class Image_Activity extends AppCompatActivity {

    private ImageView car;
    private Button btPic1;
    private Button btPic2;
    private Button btPic3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_exercise);
        doThis();
    }

    private void doThis()
    {
        car=findViewById(R.id.car);
        btPic1=findViewById(R.id.btPic1);
        btPic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.setImageDrawable(getDrawable(R.drawable.car));
            }
        });
        btPic2=findViewById(R.id.btPic2);
        btPic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.setImageDrawable(getDrawable(R.drawable.ken));
            }
        });
        btPic3=findViewById(R.id.btPic3);
        btPic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.setImageDrawable(getDrawable(R.drawable.naruto));
            }
        });

    }

}
