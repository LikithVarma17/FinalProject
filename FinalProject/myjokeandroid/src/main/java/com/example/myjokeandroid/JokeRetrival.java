package com.example.myjokeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeRetrival extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_retrival);
        String joke=getIntent().getExtras().getString("Joke");
        tv=(TextView)findViewById(R.id.joke_view);
        tv.setText(joke);
    }
}
