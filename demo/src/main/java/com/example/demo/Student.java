package com.example.demo;

public class Student {
int id;
String lName;
String fName;
static int studentCount=0;



    public Student(String lName, String fName) {
    this.lName = lName;
    this.fName = fName;
    this.id = studentCount++;
}

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return this.fName + ' ' + this.lName;
    }
    
}
