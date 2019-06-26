package com.example.mcam_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LinkFrag extends Fragment {
    TextView churchLink, cityLink, countyLink, pubSerLink, moorheadLink;

    public LinkFrag() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_link, container, false);
        churchLink = view.findViewById(R.id.churchId);
        churchLink.setMovementMethod(LinkMovementMethod.getInstance());

        cityLink = view.findViewById(R.id.cityId);
        cityLink.setMovementMethod(LinkMovementMethod.getInstance());

        countyLink = view.findViewById(R.id.countyId);
        countyLink.setMovementMethod(LinkMovementMethod.getInstance());

        pubSerLink = view.findViewById(R.id.pubSerId);
        pubSerLink.setMovementMethod(LinkMovementMethod.getInstance());

        moorheadLink = view.findViewById(R.id.moorheadId);
        moorheadLink.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

}
