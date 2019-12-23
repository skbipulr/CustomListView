package com.ezzytech.listview1.model;

import com.ezzytech.listview1.R;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private String studentId;
    private int studentImage;

    public Student() {
    }

    public Student(String studentName, String studentId, int studentImage) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentImage = studentImage;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getStudentImage() {
        return studentImage;
    }

    public void setStudentImage(int studentImage) {
        this.studentImage = studentImage;
    }

    public ArrayList<Student> getAllStudent(){
        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(new Student("Afsana","ID-54545", R.drawable.images));
        arrayList.add(new Student("Hassan","ID-787878", R.drawable.images));
        arrayList.add(new Student("Musa","ID-878787", R.drawable.images));
        arrayList.add(new Student("Antor","ID-54545", R.drawable.images));
        arrayList.add(new Student("Farjana","ID-54545", R.drawable.images));
        arrayList.add(new Student("Thiti","ID-54545", R.drawable.person));
        arrayList.add(new Student("Anika","ID-54545", R.drawable.person));
        arrayList.add(new Student("Nayem","ID-54545", R.drawable.person));
        arrayList.add(new Student("Afsana","ID-54545", R.drawable.person));
        arrayList.add(new Student("Afsana","ID-54545", R.drawable.person));
        arrayList.add(new Student("Afsana","ID-54545", R.drawable.person));
        arrayList.add(new Student("Afsana","ID-54545", R.drawable.person));
        arrayList.add(new Student("Afsana","ID-54545", R.drawable.person));

        return arrayList;
    }
}
