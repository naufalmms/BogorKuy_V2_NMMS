package com.s.m.marzuk.n.bogorkuy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splashScreen();
    }


    public void splashScreen(){
        logo = findViewById(R.id.logo);
        AlphaAnimation animation1 = new AlphaAnimation(0.0f, 1.0f);
        animation1.setDuration(1000);
        animation1.setStartOffset(1000);

        logo.startAnimation(animation1);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreen.this,Home.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
}
