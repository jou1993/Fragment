package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    Button btnFirst,btnSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFirst=findViewById(R.id.Button1);
        btnSecond=findViewById(R.id.Button2);

        btnFirst.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                    setFragment(new FirstFragment());
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                setFragment(new SecondFragment());
            }
        });
    }

    private void setFragment(Fragment Fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,Fragment);
        fragmentTransaction.commit();
    }
}