package com.ezzytech.listview1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.ezzytech.listview1.R;
import com.ezzytech.listview1.model.Student;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter<Student> {

    private ArrayList<Student> students;
    private Context context;

    public StudentAdapter(@NonNull Context context, ArrayList<Student> students) {
        super(context, R.layout.design_layout,students);
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        TextView studentNameTV, studentIdTV;
        ImageView studentImageIV;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.design_layout,parent,false);

        studentNameTV = view.findViewById(R.id.studentNameTV);
        studentIdTV = view.findViewById(R.id.studentIdTV);
        studentImageIV = view.findViewById(R.id.studentImageIV);

        studentNameTV.setText(students.get(position).getStudentName());
        studentIdTV.setText(students.get(position).getStudentId());
        studentImageIV.setImageResource(students.get(position).getStudentImage());
        return view;
    }
}
