package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class course {
    String name;
    String lecturer;
    List<Student> students = new ArrayList<>();
    static int count=0;
    int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLecturer() {
        return lecturer;
    }
    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
    public List<Student> getStudents() {

        return new ArrayList<>(students);
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        course.count = count;
    }
    
    public int getId() {
        return id;
    }

    public course(String name, String lecturer) {
        this.name = name;
        this.lecturer = lecturer;
        this.id = count++;
    }  

    public Boolean addStudent(Student student){
        this.students.add(student);
        return true;
}
}