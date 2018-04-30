package com.example.sanket.sdg_india;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ncorti.slidetoact.SlideToActView;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1,l2;
    Button btnsub;
    Animation uptodown,downtoup;
    ImageView imageView;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SlideToActView sta;
        //t=(TextView)findViewById(R.id.O);

        sta=(SlideToActView)findViewById(R.id.slide);
        sta.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideToActView slideToActView) {
                startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
            }
        });

        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotatering);
        //t.setAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                //startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
       // l1 = (LinearLayout) findViewById(R.id.l1);
       // l2 = (LinearLayout) findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        //l1.setAnimation(uptodown);
        //l2.setAnimation(downtoup);

    }
}

