package com.solution.planet.world.andriod.jawahargurukulenglishschool.fragment.teacher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.solution.planet.world.andriod.jawahargurukulenglishschool.R;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.student.Demo;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.teacher.AddHomework;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.teacher.MyClass;
import com.solution.planet.world.andriod.jawahargurukulenglishschool.activity.teacher.StudentsAttendance;


public class TeacherHomeFragment extends Fragment implements View.OnClickListener {

public static final String TAG = TeacherHomeFragment.class.getCanonicalName();
Context context;

    public TeacherHomeFragment() {
    }

    CardView cvMyclass, cvAttendance, cvHomework, cvMsg;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teacher_home, container, false);
        Log.i(TAG, "onCreateView: ");
        cvMyclass = view.findViewById(R.id.cvMyClass);
        cvAttendance = view.findViewById(R.id.cvAttendance);
        cvHomework = view.findViewById(R.id.cvHomework);
        cvMsg = view.findViewById(R.id.cvMsg);
        cvMyclass.setOnClickListener(this);
        cvAttendance.setOnClickListener(this);
        cvHomework.setOnClickListener(this);
        cvMsg.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cvMyClass:
                startActivity(new Intent(getContext(), MyClass.class));
                break;

            case R.id.cvAttendance:
                startActivity(new Intent(getContext(), StudentsAttendance.class));
                break;
            case R.id.cvHomework:
                startActivity(new Intent(getContext(), AddHomework.class));
                break;

            case R.id.cvMsg:
                startActivity(new Intent(getContext(), Demo.class));
                break;

        }
    }
}
