package Pizza;

public class Circle implements IShape{
    double _radius;
    Circle(double r){
        _radius = r;
    }
    @Override
    public double getArea() {
        return 3.14*_radius*_radius;
    }
    public String toString(){
        return "Circle(h = " + _radius + ", w = " + _radius + ")";

    }
}
