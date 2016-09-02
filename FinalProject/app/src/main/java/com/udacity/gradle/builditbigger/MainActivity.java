package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dshrout.comedian.ComedianActivity;

public class MainActivity extends AppCompatActivity implements EndpointListener {
    private static final String ANSWER = "answer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getJoke(View view){
        new EndpointsAsyncTask(this).execute();
    }

    @Override
    public void jokesReady(String answer) {
        Intent intent = new Intent(this, ComedianActivity.class);
        intent.putExtra(ANSWER, answer);
        startActivity(intent);
    }

}
