package Shape;

import java.awt.Rectangle;

public class TestAbstractShape {
    public static void main(String[] args){
        Shape c1 = new Circle(8.8);
        Shape c2 = new Circle(6.6);
        Shape[] list = {c1,c2};
        for(Shape s: list) {
            System.out.println(s.getArea());
        }
    }
}
