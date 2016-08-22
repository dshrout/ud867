package com.dshrout.comedian;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ComedianActivity extends AppCompatActivity {
    public static final String ANSWER = "answer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_comedian_activity);
        ComedianActivityFragment comedian;

        if(savedInstanceState == null) {
            Bundle args = new Bundle();
            args.putString(ANSWER, getIntent().getStringExtra(ANSWER));

            comedian = new ComedianActivityFragment();
            comedian.setArguments(args);
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_comedian_container, comedian).commit();
        }
    }
}
