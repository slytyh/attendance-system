package com.example.attendancesystem.entity;

public class Student {
    private String studentID;
    private String name;
    private String className;
    private String status;

    public Student(String studentID, String name, String className, String status) {
        this.studentID = studentID;
        this.name = name;
        this.className = className;
        this.status = status;
    }
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String id) {
        this.studentID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}