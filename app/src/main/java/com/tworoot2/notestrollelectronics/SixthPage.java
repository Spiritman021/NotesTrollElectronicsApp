package com.tworoot2.notestrollelectronics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SixthPage extends AppCompatActivity {

    private ImageView btn1;
    private CardView ce;
    private CardView photo;
    private CardView dse6th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_page);
        getSupportActionBar().hide();

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Communication Electronics on Click

        ce = findViewById(R.id.ce);

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SixthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1g8mhihf-9duGFPseya5v3ssgnQxlg-Gv?usp=sharing");
                startActivity(intent);
            }
        });

        // Photonics on Click

        photo = findViewById(R.id.photo);

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SixthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/17eFHZzgWN-NFIwd7_i8HJCVcm0olE8So?usp=sharing");
                startActivity(intent);
            }
        });

        // DSE on Click

        dse6th = findViewById(R.id.dse6th);

        dse6th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SixthPage.this,TransferedData.class);
                intent.putExtra("dog","https://drive.google.com/drive/folders/1m7b0I7NR4rpgu7RfqK8yTKZZHcnAjdfc?usp=sharing");
                startActivity(intent);
            }
        });

    }
}