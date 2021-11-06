package com.company;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Я утка-приманка");
    }
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
