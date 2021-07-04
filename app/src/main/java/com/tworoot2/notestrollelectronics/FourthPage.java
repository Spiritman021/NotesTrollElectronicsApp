package com.tworoot2.notestrollelectronics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.ImageReader;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FourthPage extends AppCompatActivity {

    private ImageView btn1;
    private CardView opamp;
    private CardView ss;
    private CardView ei;
    private CardView ge4th;
    private CardView sec4th;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);
        getSupportActionBar().hide();

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Operational Amplifier on Click

        opamp = findViewById(R.id.opamp);

        opamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1_e3XnIxnxvgRSzRcBsqL38HHPij5691I?usp=sharing");
                startActivity(intent);
            }
        });

        // Signal System on Click

        ss = findViewById(R.id.ss);

        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1_riNDCiQIue4WYKvCgvmFHWkm4TmM8Ur?usp=sharing");
                startActivity(intent);
            }
        });

        // Instru on Click

        ei = findViewById(R.id.ei);

        ei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1_faDhQsK5WdEVwwNkqqGc7pex9YmvzUO?usp=sharing");
                startActivity(intent);
            }
        });

        // GE on Click

        ge4th = findViewById(R.id.ge4th);

        ge4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/19_NEAB7b3a1VYrcK3a3mHqV2tAu-iJf0?usp=sharing");
                startActivity(intent);
            }
        });

        // SEC on Click

        sec4th = findViewById(R.id.sec4th);

        sec4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1YC8vO46MwVLfXcrdYvA1l1Z_Heh_qK9M?usp=sharing");
                startActivity(intent);
            }
        });

    }
}