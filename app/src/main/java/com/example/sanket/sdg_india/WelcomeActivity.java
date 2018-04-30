package com.example.sanket.sdg_india;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class WelcomeActivity extends AppCompatActivity {

    private CardView sus,country,vol,youth,leader;
    private ImageView s,c,v,y,fb,tw,insta;
    private TextView su,co,vo,yo,sl1,sl2;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    Typeface tf1,tf2;



    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        fb=(ImageView)findViewById(R.id.fb);
        tw=(ImageView)findViewById(R.id.tw);
        insta=(ImageView)findViewById(R.id.insta);

        tf1=collapsingToolbarLayout.getCollapsedTitleTypeface();
        tf2=Typeface.createFromAsset(getAssets(),"AmaticBold.ttf");
        collapsingToolbarLayout.setCollapsedTitleTypeface(tf2);

        sl1=(TextView)findViewById(R.id.slt1);
        tf1=Typeface.createFromAsset(getAssets(),"AmaticBold.ttf");
        sl1.setTypeface(tf1);
        sl2=(TextView)findViewById(R.id.slit1);
        tf2=Typeface.createFromAsset(getAssets(),"GreatVibesRegular.otf");
        sl2.setTypeface(tf2);

        sl1=(TextView)findViewById(R.id.slt2);
        tf1=Typeface.createFromAsset(getAssets(),"AmaticBold.ttf");
        sl1.setTypeface(tf1);
        sl2=(TextView)findViewById(R.id.slit2);
        tf2=Typeface.createFromAsset(getAssets(),"GreatVibesRegular.otf");
        sl2.setTypeface(tf2);

        sl1=(TextView)findViewById(R.id.slt3);
        tf1=Typeface.createFromAsset(getAssets(),"AmaticBold.ttf");
        sl1.setTypeface(tf1);
        sl2=(TextView)findViewById(R.id.slit3);
        tf2=Typeface.createFromAsset(getAssets(),"GreatVibesRegular.otf");
        sl2.setTypeface(tf2);

        sl1=(TextView)findViewById(R.id.slt4);
        tf1=Typeface.createFromAsset(getAssets(),"AmaticBold.ttf");
        sl1.setTypeface(tf1);
        sl2=(TextView)findViewById(R.id.slit4);
        tf2=Typeface.createFromAsset(getAssets(),"GreatVibesRegular.otf");
        sl2.setTypeface(tf2);

        sl1=(TextView)findViewById(R.id.slt5);
        tf1=Typeface.createFromAsset(getAssets(),"AmaticBold.ttf");
        sl1.setTypeface(tf1);
        sl2=(TextView)findViewById(R.id.slit5);
        tf2=Typeface.createFromAsset(getAssets(),"GreatVibesRegular.otf");
        sl2.setTypeface(tf2);

        viewFlipper=(ViewFlipper)findViewById(R.id.viewflip);
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        sus=(CardView) findViewById(R.id.suscardId);
        s=(ImageView) findViewById(R.id.susimage);
        su=(TextView) findViewById(R.id.sustext);

        country=(CardView) findViewById(R.id.concardid);
        c=(ImageView) findViewById(R.id.countryimage);
        co=(TextView) findViewById(R.id.countrytext);

        vol=(CardView) findViewById(R.id.volcardid);
        v=(ImageView) findViewById(R.id.volunteerimage);
        vo=(TextView) findViewById(R.id.voltext);

        youth=(CardView) findViewById(R.id.youthcardid);
        y=(ImageView) findViewById(R.id.youthimage);
        yo=(TextView) findViewById(R.id.youthtext);

        leader=(CardView) findViewById(R.id.leadercardid);



        sus.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(WelcomeActivity.this,SustainableActivity.class);

                Pair[] pairs=new Pair[2];
                pairs[0]=new Pair<View,String>(s,"susimage");
                pairs[1]=new Pair<View,String>(su,"sustext");

                ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(WelcomeActivity.this,pairs);
                startActivity(startIntent,options.toBundle());
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(WelcomeActivity.this,CountryActivity.class);

                Pair[] pairs=new Pair[2];
                pairs[0]=new Pair<View,String>(c,"countryimage");
                pairs[1]=new Pair<View,String>(co,"countrytext");

                ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(WelcomeActivity.this,pairs);
                startActivity(startIntent,options.toBundle());
            }
        });

        vol.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(WelcomeActivity.this,VolunteerActivity.class);

                Pair[] pairs=new Pair[2];
                pairs[0]=new Pair<View,String>(v,"volunteerimage");
                pairs[1]=new Pair<View,String>(vo,"voltext");

                ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(WelcomeActivity.this,pairs);
                startActivity(startIntent,options.toBundle());
            }
        });

        youth.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(WelcomeActivity.this,YouthActivity.class);

                Pair[] pairs=new Pair[2];
                pairs[0]=new Pair<View,String>(y,"youthimage");
                pairs[1]=new Pair<View,String>(yo,"youthtext");

                ActivityOptions options= ActivityOptions.makeSceneTransitionAnimation(WelcomeActivity.this,pairs);
                startActivity(startIntent,options.toBundle());
            }
        });

        leader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://theleadership30.com/"));
                startActivity(browserintent);
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserintent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/theleadership30/"));
                startActivity(browserintent);

            }
        });
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserintent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/theleadership30"));
                startActivity(browserintent);

            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserintent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/theleadership30/"));
                startActivity(browserintent);

            }
        });


    }


}
