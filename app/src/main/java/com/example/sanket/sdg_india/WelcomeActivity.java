package com.example.sanket.sdg_india;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private CardView sus,country,vol,youth,leader;
    private ImageView s,c,v,y;
    private TextView su,co,vo,yo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

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

    }
}
