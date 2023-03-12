package Shape;
public class TestAbstractShape {
    public static void main(String[] args){
        Shape c1 = new Circle(8.8);
        System.out.println(c1);
        Shape c2 = new Circle(6.6);
        System.out.println(c2);
        Shape r1 = new Rectangle(6,6);
        System.out.println(r1);
        Shape r2 = new Rectangle(4,6);
        System.out.println(r2);
        Shape s1 = new Square(6);
        System.out.println(s1);
        Shape s2 = new Square(8);
        System.out.println(s2);
    }
}
