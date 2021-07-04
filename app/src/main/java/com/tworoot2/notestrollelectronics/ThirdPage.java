package com.tworoot2.notestrollelectronics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThirdPage extends AppCompatActivity {

    private ImageView btn1;
    private CardView ece;
    private CardView dev;
    private CardView cpds;
    private CardView ge3rd;
    private CardView sec3rd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        getSupportActionBar().hide();

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Electronics Circuits on Click

        ece = findViewById(R.id.ece);

        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1_ZMTkZ_9fkqmA-28tOnoijNQm5bUB8Um?usp=sharing");
                startActivity(intent);
            }
        });

        // Digital Electronics on Click

        dev = findViewById(R.id.dev);

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1_aEZCh2pbiErO-qmfsDyLzzwA8K2iD4u?usp=sharing");
                startActivity(intent);
            }
        });

        // C Programming & DS on Click

        cpds = findViewById(R.id.cpds);

        cpds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1_cLr5rslxOGz1-zfmZ8cuFaQgrMIxhMq?usp=sharing");
                startActivity(intent);
            }
        });

        // GE on Click

        ge3rd = findViewById(R.id.ge3rd);

        ge3rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/17FsG4wLJV6vOfoBiNVmbenCeaA9htBfl?usp=sharing");
                startActivity(intent);
            }
        });

        // SEC on Click

        sec3rd = findViewById(R.id.sec3rd);

        sec3rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1ZY8V9khhO8RFjXaAup_1MJvQdRffhVX4?usp=sharing");
                startActivity(intent);
            }
        });

    }
}