package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class courseService implements icourseServices {
    List<Student> students = new ArrayList<>();
    List<course> courses = new ArrayList<>();


    @Override
    public List<Student> getStudents() {
        
        return this.students;
    }

    @Override
    public List<course> getCourses() {
        
        return this.courses;
    }

    @Override
    public Student getStudentById(long studentId) {
        for (Student student : students) {
            if(student.getId()==studentId){
                return student;
            }
        }
        return null;
    }

    @Override
    public course getCourseId(long courseId) {
        for (course course : courses) {
            if(course.getId()==courseId){
                return course;
            }
        }
        return null;
    }

    @Override
    public List<course> getCourseOfStudent(long studentId) {
        Student student = this.getStudentById(studentId);
        List<course> studentCourses = new ArrayList<>();
        for (course course : courses) {
             if(course.getStudents().contains(student)){
                 studentCourses.add(course);
             } 
        }
        
        
        return studentCourses;
    }

    @Override
    public boolean addStudentToCourse(long studentId, long courseId) {
        Student student = this.getStudentById(studentId);
        course course = this.getCourseId(courseId);
        return course.addStudent(student);
    }
    
}
