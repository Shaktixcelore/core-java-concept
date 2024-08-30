package com.example.spring.learning.project;

public class Airtel {
    private Service service;

    public void setService(Service service){
        this.service = service;
    }
    
    public void service(){
        service.service();
    }
    
}
