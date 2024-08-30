package com.example.spring.learning.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heart;


@Autowired
@Qualifier("OctopusHeart")
    public void setHeart(Heart heart){
        this.heart = heart;
        System.out.println("Setter method called");
    }
    
    public void startPumping(){
        if(heart != null){
            heart.pump();
            System.out.println("name of animal: " + heart.getNameOfAnimal() + " number of heart: " + heart.getNoOfHeart());
        }
        else {
            System.out.println("You are dead");
        }
    }
    
}
