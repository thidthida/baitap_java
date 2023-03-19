package Turkeylikeinterface;

import java.io.PrintStream;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("I'm a mallard duck");
    }
}
