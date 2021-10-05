package com.example.gymbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class muscle_gain extends AppCompatActivity {

    TextView titlepage, subtitlepage, subtitlepage1, btnexercise;

    View divpage, bgprogress;

    Animation btone, bttwo, btfour, btfive, btsix, btseven, bteight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muscle_gain);

        //Load Animation
        btone = AnimationUtils.loadAnimation(this,R.anim.btone);
        bttwo = AnimationUtils.loadAnimation(this,R.anim.bttwo);
        btfour = AnimationUtils.loadAnimation(this,R.anim.btfour);
        btfive = AnimationUtils.loadAnimation(this,R.anim.btfive);
        btsix = AnimationUtils.loadAnimation(this,R.anim.btsix);
        btseven = AnimationUtils.loadAnimation(this,R.anim.btseven);
        bteight = AnimationUtils.loadAnimation(this,R.anim.bteight);

        titlepage = (TextView) findViewById(R.id.titlepage);
        subtitlepage = (TextView) findViewById(R.id.subtitlepage);
        subtitlepage1 = (TextView) findViewById(R.id.subtitlepage1);
        btnexercise = (TextView) findViewById(R.id.btnexercise);


        divpage = (View) findViewById(R.id.divpage);
        bgprogress = (View) findViewById(R.id.bgprogress);

        //assign the animation
        titlepage.startAnimation(btone);
        subtitlepage.startAnimation(btone);
        subtitlepage1.startAnimation(btone);
        divpage.startAnimation(btone);


        btnexercise.startAnimation(bteight);
        bgprogress.startAnimation(btseven);

        btnexercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(muscle_gain.this,diet_plans.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
    }


}