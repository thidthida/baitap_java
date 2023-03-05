package Pizza;

public class Pizza {
    double _price;
    IShape _shape;
    public Pizza(double p,IShape s){
        _price = p;
        _shape = s;
    }
    public double getPrice(){
        return _price;
    }
    public IShape getShape(){
        return _shape;
    }
    public String toString(){
        return "Pizza(price = "+_price+", Size = "+ getShape()+")";
    }
}
