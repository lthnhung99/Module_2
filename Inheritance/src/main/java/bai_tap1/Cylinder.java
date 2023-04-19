package bai_tap1;

public class Cylinder extends Circle {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(10);
        System.out.println(cylinder);
        cylinder = new Cylinder(10,3.0,"pink");
        System.out.println(cylinder);
    }
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * getRadius() * getRadius() * Math.PI;
    }
    @Override
    public String toString() {
        return "Chiều cao= " + getHeight() + " Thể tích= "+ getVolume() +  super.toString();
    }
}
