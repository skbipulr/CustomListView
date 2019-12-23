package com.ezzytech.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ezzytech.listview1.adapter.StudentAdapter;
import com.ezzytech.listview1.model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    private Student student;

    private ArrayList<Student> students;

    private StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        student = new Student();

        students = student.getAllStudent();

        studentAdapter = new StudentAdapter(this,students);
        listView.setAdapter(studentAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, students.get(position).getStudentName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
