package com.solutions.planet.world.andriod.schoolmanagmentsystem.activity.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.solutions.planet.world.andriod.schoolmanagmentsystem.R;

public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Toolbar toolbar =  findViewById(R.id.toolbar); // get the reference of Toolbar
        setSupportActionBar(toolbar);
    }
}
