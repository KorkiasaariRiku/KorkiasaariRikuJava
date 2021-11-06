package com.example.demo;

public class normalCourse extends course {
int maxStudents=25;
String roomNum;

    public normalCourse(String name, String lecturer, String roomNum) {
        super(name, lecturer);
        this.roomNum = roomNum;
    }
    
    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }
    
    @Override
    public Boolean addStudent(Student student){
        if(this.students.size()>=25){
            this.students.add(student);
            return true;
        }
        else{
            return false;
        }
    }
@Override
public String toString() {
    return this.lecturer + ' ' + this.name + ' ' + this.roomNum;
}
    
}
