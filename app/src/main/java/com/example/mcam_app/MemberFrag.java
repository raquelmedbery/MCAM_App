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
public class MemberFrag extends Fragment {
    WebView web;

    public MemberFrag() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_member, container, false);

        web = view.findViewById(R.id.memberInfo);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/member.html");

        return view;
    }

}
