package Turkeylikeinterface;

public class RedheadDuck extends Duck{
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("I'm a red head duck");
    }
}
