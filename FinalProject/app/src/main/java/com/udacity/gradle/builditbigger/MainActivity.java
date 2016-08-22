package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.dshrout.comedian.ComedianActivity;

public class MainActivity extends ActionBarActivity {
    private static final String ANSWER = "answer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getJoke(View view){

        new EndpointsAsyncTask(this).execute();

//        Toast joke = Toast.makeText(this, mJokeSmith.getJoke().Joke, Toast.LENGTH_LONG);
//        joke.setGravity(Gravity.CENTER, 0, 0);
//        joke.show();
//
//        Toast punchLine = Toast.makeText(this, mJokeSmith.getJoke().PunchLine, Toast.LENGTH_LONG);
//        punchLine.setGravity(Gravity.CENTER, 0, 0);
//        punchLine.show();
    }

    public void tellJoke(String answer) {
        Intent intent = new Intent(this, ComedianActivity.class);
        intent.putExtra(ANSWER, answer);
        startActivity(intent);
    }


}
