package com.tworoot2.notestrollelectronics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondPage extends AppCompatActivity {

    private ImageView btn1;
    private CardView sd;
    private CardView ap;
    private CardView aecc2nd;
    private CardView ge2nd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        getSupportActionBar().hide();

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Semiconductor & Devices on Click

        sd = findViewById(R.id.sd);

        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1ZxS3bOpheWvRlJF5ctPHjA_h9ahFNi3O?usp=sharing");
                startActivity(intent);
            }
        });

        // Applied Physics on Click

        ap = findViewById(R.id.ap);

        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1_-znRfLuLsLV7-ykGCHaHfuAvfGSJg70?usp=sharing");
                startActivity(intent);
            }
        });

        // GE First Semester on Click

        ge2nd = findViewById(R.id.ge2nd);

        ge2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1jhIa9B3XS8KZs6FV__ODC1Yktw5nu1J5?usp=sharing");
                startActivity(intent);
            }
        });

        // AECC First Semester on Click

        aecc2nd = findViewById(R.id.aecc2nd);

        aecc2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/109hJzAImkeU1fdmCU4QatYEudXnMhIFc?usp=sharing");
                startActivity(intent);
            }
        });





    }
}