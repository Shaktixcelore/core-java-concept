package com.example.spring.learning.dependencyobject;

public class Student {
    private int id;
    private MathCheat mathCheat;

    public void setId(int id) {
        this.id = id;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheating() {
        mathCheat.mathCheat(); 
        System.out.println("Here is my id: " + id);
    }
}
