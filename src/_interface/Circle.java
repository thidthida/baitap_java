package _interface;

public class Circle implements IShape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*3.14;
    }
//    public static void main(String[] args){
//            Circle c1 = new Circle(3.14);
//            System.out.println("Area = "+c1.getArea()+"\nPerimeter = "+c1.getPerimeter());

//    }
}
