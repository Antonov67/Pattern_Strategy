package com.company;

public class Main {

    public static void main(String[] args) {
        MuDuck muDuck = new MuDuck();
        muDuck.display();
        muDuck.performFly();
        muDuck.performQuack();
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
