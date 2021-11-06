package com.company;

public class MuDuck extends Duck{
    public MuDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squek();
    }
    @Override
    public void display(){
        System.out.println("I'm a real MuDack");
    }
}
