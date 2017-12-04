package com.s.m.marzuk.n.bogorkuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        pindahMenu();
        //tv = findViewById(R.id.hello);
        //tv.setText("Hasil Yang diterima = "+getIntent().getStringExtra("hasil"));


    }

    public void pindahMenu() {
        btn1 = findViewById(R.id.btmenu1);
        btn2 = findViewById(R.id.btmenu2);
        btn3 = findViewById(R.id.btmenu3);
        btn4 = findViewById(R.id.btmenu4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(Home.this,Menu.class);
                startActivity(pindah1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah4 = new Intent(Home.this,SejarahBogor.class);
                startActivity(pindah4);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah3 = new Intent(Home.this,TentangAplikasiIni.class);
                startActivity(pindah3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(Home.this,RatethisApp.class);
                startActivity(pindah2);
            }
        });

    }

}
