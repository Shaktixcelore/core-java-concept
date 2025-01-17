package com.example.spring.learning.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowired.xml");
        Human human = context.getBean("human", Human.class);
        human.startPumping();
    }
}
