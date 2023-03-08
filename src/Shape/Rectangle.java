package Shape;

public abstract class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle() {
        super();
        width = -1;
        length = -1;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
    }

    public double getLength() {
        return length;
    }

    public abstract void setWidth(double side);

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return width + length * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "side=" + width + ", length=" + length + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
