package com.example.spring.learning.dependencyobject;

public class AnotherStudent {
    private MathCheat cheat;

    public void setCheat(MathCheat cheat) {
        this.cheat = cheat;
    }

    public void startcheating() {
        cheat.mathCheat();
    }
}
