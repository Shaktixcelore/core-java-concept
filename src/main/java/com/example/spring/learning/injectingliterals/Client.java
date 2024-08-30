package com.example.spring.learning.injectingliterals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("literals.xml");
        System.out.println("beans file loaded");
        Student student = context.getBean("student" , Student.class);
        student.displayStudentInfo();
    }
}
