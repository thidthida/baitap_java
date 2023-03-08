package Pizza;

public class Rectangle implements IShape{
    double _width;
    double _height;
    Rectangle(double w, double h){
        _width = w;
        _height = h;
    }
    @Override
    public double getArea() {
        return _width*_height;
    }
    public String toString(){
        return "Rectangle(h = " + _width + ", w = " + _height + ")";
    }
}
