package com.s.m.marzuk.n.bogorkuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RatethisApp extends AppCompatActivity {
RadioGroup rgr1;
RadioButton rbu1,rbu2,rbu3,rbu4,rbu5;
TextView tvscors2;
ImageButton imgbut1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratethis_app);

        rgr1 = findViewById(R.id.rg01);
        rbu1 = findViewById(R.id.rb1);
        rbu2 = findViewById(R.id.rb2);
        rbu3 = findViewById(R.id.rb3);
        rbu4 = findViewById(R.id.rb4);
        rbu5 = findViewById(R.id.rb5);
        tvscors2 = findViewById(R.id.tvskor2);
        imgbut1= findViewById(R.id.imgbut);

        cekRadio();
        imgbutIni();
    }

    public void imgbutIni()
    {
        imgbut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent df = new Intent(RatethisApp.this,Home.class);
                startActivity(df);
            }
        });

    }
    public void cekRadio()
    {
        rgr1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rb1:
                        tvscors2.setText(rbu1.getText());
                        break;

                    case R.id.rb2:
                        tvscors2.setText(rbu2.getText());
                        break;

                    case R.id.rb3:
                        tvscors2.setText(rbu3.getText());
                        break;

                    case R.id.rb4:
                        tvscors2.setText(rbu4.getText());
                        break;

                    case R.id.rb5:
                        tvscors2.setText(rbu5.getText());
                        break;
                }
            }
        });
    }
}
