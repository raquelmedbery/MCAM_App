package com.example.mcam_app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFrag extends Fragment {
    TextView link;
    WebView web;

    public HomeFrag() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        web = view.findViewById(R.id.homeWeb);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/main.html");

        //webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("file:///android_asset/" + fileName);

        link = view.findViewById(R.id.liveStream);
        link.setMovementMethod(LinkMovementMethod.getInstance());
        return view;
    }

}
