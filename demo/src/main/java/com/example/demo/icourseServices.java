package com.example.demo;

import java.util.List;

public interface icourseServices {
    List<Student> getStudents();
   
    List<course> getCourses();
   
    Student getStudentById(long studentId);
   
    course getCourseId(long courseId);
   
    List<course> getCourseOfStudent(long studentId);
   
    boolean addStudentToCourse(long studentId, long courseId);
}
