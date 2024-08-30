package com.example.spring.learning.annotations;

import org.springframework.stereotype.Component;

@Component("collegeBean") 
public class College {
    private Principal principal;

    public void setPrincipal(Principal principal){
        this.principal = principal;
    }

   public void test(){
    principal.principleInfo();
    System.out.println("testing is called.....");
   }
}
