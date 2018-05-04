package com.example.sanket.sdg_india;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;
;

public class CountryActivity extends Activity {
    private SlidrInterface slidr;
    private  TextView t1,t2,t3;
    private Typeface tf1,tf2,tf3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        slidr = Slidr.attach(this);

        t1=(TextView)findViewById(R.id.turu);
        tf1= Typeface.createFromAsset(getAssets(),"DroidSerif-Italic.ttf");
        t1.setTypeface(tf1);

        t2=(TextView)findViewById(R.id.muru);
        tf2= Typeface.createFromAsset(getAssets(),"DroidSerif-Italic.ttf");
        t2.setTypeface(tf1);

        t3=(TextView)findViewById(R.id.countrytext);
        tf3= Typeface.createFromAsset(getAssets(),"DroidSerif-BoldItalic.ttf");
        t3.setTypeface(tf3);
    }

}
