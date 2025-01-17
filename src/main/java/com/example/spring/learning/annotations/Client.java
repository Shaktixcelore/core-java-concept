package com.example.spring.learning.annotations;

import org.apache.logging.log4j.status.StatusLogger.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        System.out.println("beans is called....");
        College college = context.getBean("collegeBean", College.class);
        System.out.println("College name is printed: " + college);
        college.test();
    }
}
