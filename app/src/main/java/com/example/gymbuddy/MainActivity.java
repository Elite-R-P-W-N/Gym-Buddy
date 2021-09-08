package com.example.gymbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title_page, sub_title_page, btn_exercise;
    ImageView img_page;
    Animation animimgpage, btone, bttwo, btthree, lefttoright;
    View bgprogress, bgprogresstop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animimgpage = AnimationUtils.loadAnimation(this, R.anim.animimgpage);
        btone = AnimationUtils.loadAnimation(this, R.anim.btone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        lefttoright = AnimationUtils.loadAnimation(this, R.anim.lefttoright);

        title_page = (TextView) findViewById(R.id.title_page);
        sub_title_page = (TextView) findViewById(R.id.sub_title_page);
        img_page = (ImageView)findViewById(R.id.img_page);
        btn_exercise = (TextView) findViewById(R.id.btn_exercise);

        bgprogress = (View) findViewById(R.id.bgprogress);
        bgprogresstop = (View) findViewById(R.id.bgprogresstop);

        img_page.startAnimation(animimgpage);
        title_page.startAnimation(btone);
        sub_title_page.startAnimation(btone);

        btn_exercise.startAnimation(btthree);
        bgprogress.startAnimation(bttwo);
        bgprogresstop.startAnimation(lefttoright);

        //give an event to another page
        btn_exercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,WorkoutActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
    }
}