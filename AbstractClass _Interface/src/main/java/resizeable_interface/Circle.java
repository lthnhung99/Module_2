package resizeable_interface;

public class Circle extends Shape implements Resizeable {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);

        Circle circle2 = new Circle(4.5, "red", true);
        System.out.println(circle2);
    }

    private double radius = 1;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double percent) {
        double radius = getRadius();
        radius += radius * percent;
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle có bán kính= " + radius + super.toString();
    }
}
