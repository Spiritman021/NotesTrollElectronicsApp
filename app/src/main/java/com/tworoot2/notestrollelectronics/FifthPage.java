package com.tworoot2.notestrollelectronics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FifthPage extends AppCompatActivity {

    private ImageView btn1;
    private CardView mm;
    private CardView em;
    private CardView dse5th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_page);
        getSupportActionBar().hide();

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Micro on Click

        mm = findViewById(R.id.mm);

        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FifthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1_wzxwjc-CgeEsTBJP9AmMD_8YboLdaOG?usp=sharing");
                startActivity(intent);
            }
        });

        // Electromagnetics on Click

        em = findViewById(R.id.em);

        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FifthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1_yxtJWPZJgp1Q3hIiluI_Z3lrc7UC_xk?usp=sharing");
                startActivity(intent);
            }
        });

        // DSE on Click

        dse5th = findViewById(R.id.dse5th);

        dse5th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FifthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1gGulrH-fdZ3FiB5IBIAC37T4R-Mm-ZCo?usp=sharing");
                startActivity(intent);
            }
        });

    }
}