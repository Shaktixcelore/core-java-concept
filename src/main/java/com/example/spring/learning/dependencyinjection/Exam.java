package com.example.spring.learning.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansdi.xml");
        Student Xcelore = context.getBean("student", Student.class);
        Xcelore.displayStudentInfo();
    }
    
}
