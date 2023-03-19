package Turkeylikeinterface;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new Squeak();
        System.out.println("Squeak");
    }

    public RubberDuck(Flyable flyBehavior, Quackable quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("I'm a rub ber duck");
    }
}
