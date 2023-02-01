package com.example.samplequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Spalsh extends AppCompatActivity {
TextView appname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        appname=findViewById(R.id.app_name);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.spalsh_anim);
        appname.setAnimation(anim);
        new Thread()
        {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                Intent intent = new Intent(Spalsh.this, MainActivity.class);
                startActivity(intent);
                Spalsh.this.finish();
            }


        }.start();


    }
}