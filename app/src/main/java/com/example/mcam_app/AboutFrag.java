package com.example.mcam_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFrag extends Fragment {
    WebView web;

    public AboutFrag() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_about, container, false);

        web = view.findViewById(R.id.aboutInfo);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/about.html");

        return view;
    }

}
