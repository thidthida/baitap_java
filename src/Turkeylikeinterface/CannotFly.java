package Turkeylikeinterface;

public class CannotFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
