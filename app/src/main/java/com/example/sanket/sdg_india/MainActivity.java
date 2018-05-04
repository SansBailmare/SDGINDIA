package com.example.sanket.sdg_india;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ncorti.slidetoact.SlideToActView;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1,l2;
    Button btnsub;
    RelativeLayout r1;
    Animation uptodown,downtoup;
    ImageView imageView;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SlideToActView sta;
        imageView=(ImageView)findViewById(R.id.whitering);

        sta=(SlideToActView)findViewById(R.id.slide);
        sta.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideToActView slideToActView) {
                startActivity(new Intent(getApplicationContext(),WelcomeActivity.class));
            }
        });

        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotatering);
        imageView.setAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        r1=(RelativeLayout) findViewById(R.id.r1);
        uptodown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.uptodown);
        // downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        r1.setAnimation(uptodown);

    }
}

