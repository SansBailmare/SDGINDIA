package com.example.sanket.sdg_india;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class CountryActivity extends AppCompatActivity {
    private SlidrInterface slidr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        slidr = Slidr.attach(this);
    }
}
