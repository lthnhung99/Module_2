package lop_Triangle;


import java.util.Scanner;

public class Triangle extends Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập màu của tam giác");
        String color = scanner.nextLine();
        System.out.println("Nhập cạnh thứ nhất");
        double side1 = scanner.nextDouble();
        System.out.println("Nhập cạnh thứ hai");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập cạnh thứ ba");
        double side3 = scanner.nextDouble();
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            Triangle triangle = new Triangle(color,side1, side2, side3);
            triangle.getPerimeter();
            triangle.getArea();
            triangle.getColor();
            System.out.println(triangle);
        } else {
            System.out.println("Không phải cạnh của tam giác");
        }


    }

    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double S = Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()));
        return S;
    }

    @Override
    public String toString() {
        return "Màu: " + getColor() + " Diện tích= " + getArea() + " Chu vi= " + getPerimeter();
    }

}
