package com.example.spring.learning.springloosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clients {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansLooseCoupling.xml");
        System.out.println("beans file loaded");

        Student student = context.getBean("stu", Student.class);
        student.cheating();
    }
}
