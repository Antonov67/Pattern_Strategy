package com.company;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Я не умею издавать звуки");
    }
}
