package bai_tap1;

public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.0,"pink" +  circle.getArea());
        System.out.println(circle);
    }
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Bán kính = " + getRadius() + " Màu: " + getColor() + " Diện tích= " + getArea();
    }
}
