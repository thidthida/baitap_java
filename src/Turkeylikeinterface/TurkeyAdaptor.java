package Turkeylikeinterface;

public class TurkeyAdaptor implements Ducklike{
    public Turkeylike Turkeylike;

    public void Turkeylike(Turkeylike fina){
        this.Turkeylike = Turkeylike;
    }

    @Override
    public void fly() {
        Turkeylike.fly();
    }

    @Override
    public void quack() {
        Turkeylike.gobble();
    }
}
