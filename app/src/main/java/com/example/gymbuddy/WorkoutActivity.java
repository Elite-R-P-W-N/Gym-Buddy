package com.example.gymbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WorkoutActivity extends AppCompatActivity {

    TextView titlepage, subtitlepage, intropage, subintropage, btnexercise, fitonetitle, fitonedesc, fittwotitle, fittwodesc, fitthreetitle,
            fitthreedesc, fitfourtitle, fitfourdesc;

    View divpage, bgprogress;

    Animation btone, bttwo, btfour, btfive, btsix, btseven, bteight;

    LinearLayout fitone, fittwo, fitthree, fitfour, fitfive;

    Button btnbmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

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
        intropage = (TextView) findViewById(R.id.intropage);
        subintropage = (TextView) findViewById(R.id.subintropage);
        btnexercise = (TextView) findViewById(R.id.btnexercise);
        fitonetitle = (TextView) findViewById(R.id.fitonetitle);
        fitonedesc = (TextView) findViewById(R.id.fitonedesc);
        fittwotitle = (TextView) findViewById(R.id.fittwotitle);
        fittwodesc = (TextView) findViewById(R.id.fittwodesc);
        fitthreetitle = (TextView) findViewById(R.id.fitthreetitle);
        fitthreedesc = (TextView) findViewById(R.id.fitthreedesc);
        fitfourtitle = (TextView) findViewById(R.id.fitfourtitle);
        fitfourdesc = (TextView) findViewById(R.id.fitfourdesc);

        fitone = (LinearLayout) findViewById(R.id.fitone);
        fittwo = (LinearLayout) findViewById(R.id.fittwo);
        fitthree = (LinearLayout) findViewById(R.id.fitthree);
        fitfour = (LinearLayout) findViewById(R.id.fitfour);
        fitfive = (LinearLayout) findViewById(R.id.fitfive);


        btnbmi = (Button) findViewById(R.id.btnbmi);

        divpage = (View) findViewById(R.id.divpage);
        bgprogress = (View) findViewById(R.id.bgprogress);

        //assign the animation
        titlepage.startAnimation(btone);
        subtitlepage.startAnimation(btone);
        divpage.startAnimation(btone);

        intropage.startAnimation(bttwo);
        subintropage.startAnimation(bttwo);

        fitone.startAnimation(bttwo);
        fittwo.startAnimation(btfour);
        fitthree.startAnimation(btfive);
        fitfour.startAnimation(btsix);

        btnexercise.startAnimation(bteight);
        bgprogress.startAnimation(btseven);

        fitone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(WorkoutActivity.this,chest_workout.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        fittwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(WorkoutActivity.this,bicep_workout.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        fitthree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(WorkoutActivity.this,shoulder_workout.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        fitfour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(WorkoutActivity.this,leg_workout.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        btnexercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(WorkoutActivity.this,diet_plans.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        btnbmi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(WorkoutActivity.this,bmi.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }
}