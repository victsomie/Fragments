package com.example.victor.fragments;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Activity;//Talks to the main act
import android.widget.Button; //Import widget for button
import android.widget.EditText; //Import widget for EditText





public class TopSectionFragment extends Fragment{ //Makes this inherit from fragment

    //Make reference to the freagment items inside the TopSegmentLayout
    private static EditText topTextInput;
    private static EditText bottomTextInput;


    //Create an interface called TopSectionListener
    //This says that the method  inside is implemented when the main implements the interface
    TopSectionListener activityCommander;
    public interface TopSectionListener{
        public void createMeme(String top, String bottom);

    }


    //Is called whenever the fragment is attached to the activity

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }


    }

    @Nullable

    //overide onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.top_section_fragment, container, false);

       topTextInput = (EditText) view.findViewById(R.id.topTextInput);
       bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);
       final Button button =(Button) view.findViewById(R.id.topButton);


       //Create a listener to that button
       button.setOnClickListener(
               new View.OnClickListener(){
                   public void onClick(View v){
                       buttonClicked(v);
                   }

               }
       );
       return view;
    }


    //Call this when the button is clicked
    //Do this outside the onCreateView
    public void buttonClicked(View view){

        //Whatever is inside here is implemented whenever the button is clicked
        activityCommander.createMeme(topTextInput.getText().toString(), bottomTextInput.getText().toString());

    }



}
