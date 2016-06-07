package com.example.victor.fragments;

/**
 * Created by victor on 6/7/16.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;


public class TopSectionFragment extends Fragment{ //Makes this inherit from fragment


   @Nullable

    //overide onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_section_fragment, container, false);
       return view;


    }
}
