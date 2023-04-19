package Thuc_hanh;

public class Circle extends Shape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.0);
        System.out.println(circle);
        circle = new Circle(3.0,"indigo",false);
        System.out.println(circle);
    }
    private double radius = 1.0;

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
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius= " + getRadius() + ", Which is a subclass of " + super.toString();
    }
}
