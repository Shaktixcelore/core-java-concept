package com.example.spring.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {

        // use of ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config loaded");

        // Vodaphone voda = context.getBean("vodaphone", Vodaphone.class);
        // voda.calling();
        // voda.data();

        // interface approach 
        Sim sim  = context.getBean("sim", Sim.class);
        sim.calling();
        sim.data();
    }
    
}
