package com.example.spring.learning.injectingliterals;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.interstedCourse}")
    private String interstedCourse;
    @Value("${student.hobby}")
    private String hobby;

    public void setName(String name){
        this.name=name;
    }

    public void setInterstedCourse(String interstedCourse){
        this.interstedCourse = interstedCourse;
    }

    public void setHobby(String hobby){
        this.hobby= hobby;
    }

    public void displayStudentInfo(){
        System.out.println("Student name: " + name);
        System.out.println("Student intersted course: " + interstedCourse);
        System.out.println("Student hobby: " + hobby);
    }
    
}
