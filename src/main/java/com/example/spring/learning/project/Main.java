package com.example.spring.learning.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("project.xml");
        System.out.println("beans is loaded");

        Airtel airtel = context.getBean("alert", Airtel.class);
        airtel.service();
    }   
}
