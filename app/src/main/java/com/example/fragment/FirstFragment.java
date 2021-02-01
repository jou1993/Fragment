package com.example.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment {
    View view;
    Button fragmentButton;
    EditText editText;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_first, container, false);
        fragmentButton = (Button) view.findViewById(R.id.fragmentButton1);
        editText =  (EditText)view.findViewById(R.id.fragmentEditText1);
        fragmentButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                    editText.setText("First fragment");
            }
        });
        return view;
    }
}