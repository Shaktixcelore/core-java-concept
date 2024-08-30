package com.example.spring.learning.dependencyobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansDependencyInjection.xml");
        System.out.println("beans file loaded");

        Student student = context.getBean("stu", Student.class);
        student.cheating();

        AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
        anotherStudent.startcheating();
    }
}
