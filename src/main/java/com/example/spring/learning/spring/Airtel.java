package com.example.spring.learning.spring;

public class Airtel implements Sim {
    public Airtel(){
        System.out.println("Constrctor called when xml is excuted");
    }
    public void calling(){
        System.out.println("calling using airtel sim");
    }
    public void data(){
        System.out.println("browsing internet using airtel mobile");
    }
}
