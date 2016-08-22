package com.dshrout.comedian;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ComedianActivityFragment extends Fragment {


    public ComedianActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_comedian_activity, container, false);
        ((TextView)view.findViewById(R.id.comedian_joke)).setText(R.string.string_joke);
        ((TextView)view.findViewById(R.id.comedian_punchline)).setText(getArguments().getString(ComedianActivity.ANSWER));

        return view;
    }

}
