package com.tworoot2.notestrollelectronics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FirstPage extends AppCompatActivity {
    public CardView ntwrk;
    private ImageView btn1;
    private CardView mfe;
    private CardView ge1st;
    private CardView aecc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        getSupportActionBar().hide();

        // Network Analysis on Click

        ntwrk = findViewById(R.id.ntwrk);

        ntwrk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1ZYn43MW_FyhODfHQaUCKrlXOd_Uyq2M5?usp=sharing");
                startActivity(intent);
            }
        });

        // Mathematical Foundation on Click

        mfe = findViewById(R.id.mfe);

        mfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1Zb1-Cau98oCh2l2Q-T-VqQ7q2lAFsjLM?usp=sharing");
                startActivity(intent);
            }
        });

        // GE First Semester on Click

        ge1st = findViewById(R.id.ge1st);

        ge1st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1clAOeiWVHDrnc_TPDmwu5xMNBuq8RYZH?usp=sharing");
                startActivity(intent);
            }
        });

        // AECC First Semester on Click

        aecc = findViewById(R.id.aecc);

        aecc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1YwE5gKU5do8mU0Bmpus6wr6Mwsyoz_Y8?usp=sharing");
                startActivity(intent);
            }
        });



        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}