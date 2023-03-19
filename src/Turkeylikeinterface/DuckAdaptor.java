package Turkeylikeinterface;

public class DuckAdaptor implements Turkeylike{
    public Duck duck;

    public void DuckAdaptor(Duck Ducklike) {
        this.duck=Ducklike;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        for (int i =0;i<5;i++){
            duck.fly();
        }
    }

}
