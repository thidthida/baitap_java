package Turkeylikeinterface;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new CannotQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a DecoyDuck");
        super.display();
    }
}
