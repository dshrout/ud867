package com.dshrout.comedian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ComedianActivity extends AppCompatActivity {
    public static final String JOKE = "joke";
    public static final String PUNCH_LINE = "punchline";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_comedian_activity);
        ComedianActivityFragment comedian;

        if(savedInstanceState == null) {
            Bundle args = new Bundle();
            args.putString(JOKE, getIntent().getStringExtra(JOKE));
            args.putString(PUNCH_LINE, getIntent().getStringExtra(PUNCH_LINE));

            comedian = new ComedianActivityFragment();
            comedian.setArguments(args);
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_comedian_container, comedian).commit();
        }
    }
}
