package Turkeylikeinterface;

public class CannotQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("can't quack");
    }
}
