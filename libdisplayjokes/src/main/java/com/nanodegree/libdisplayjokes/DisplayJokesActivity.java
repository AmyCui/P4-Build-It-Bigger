package com.nanodegree.libdisplayjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokesActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayjokes);

        String joke =  getIntent().getStringExtra(JOKE_EXTRA);
        TextView jokeview = (TextView)findViewById(R.id.joke_text);
        jokeview.setText(joke);


    }
}
