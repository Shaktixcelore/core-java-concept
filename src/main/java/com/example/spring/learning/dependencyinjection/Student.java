package com.example.spring.learning.dependencyinjection;

public class Student {
    private String studentName;
    private int id;
    private String companyName;

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public void displayStudentInfo(){
        System.out.println("Student name is: " + studentName + 
                           " and the id is : " + id +
                           " and he is wokring in: " + companyName);
    }
}
