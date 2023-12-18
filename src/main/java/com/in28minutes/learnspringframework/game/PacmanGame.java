package com.in28minutes.learnspringframework.game;

public class PacmanGame implements GamingConsole {

    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Down");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("Accelerate");
    }
}
