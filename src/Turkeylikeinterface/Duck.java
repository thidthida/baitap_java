package Turkeylikeinterface;

public class Duck implements Ducklike{
    Flyable flyBehavior;
    Quackable quackBehavior;

    public void display(){
        fly();
        quack();
    }

    public void setFlyBehavior(Flyable flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(Quackable quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
