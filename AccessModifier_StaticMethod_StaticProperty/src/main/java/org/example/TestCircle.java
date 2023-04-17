package org.example;

public class TestCircle {
    public static void main(String[] args) {
        TestCircle circle = new TestCircle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

    }
    private double radius;
    private String color;
    public TestCircle() {
        this.radius = 1;
        this.color = "red";
    }
    public TestCircle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }

}
