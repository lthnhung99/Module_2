package org.example;

import java.util.Scanner;

public class Rectangle {
    double width,height;
    public Rectangle() {

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều dài:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Hình chữ nhật:" + rectangle.display());
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPrimeter());
        System.out.println("Dện tích hình chữ nhật là: "+ rectangle.getArea());


    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPrimeter() {
        return (this.width+this.height)*2;
    }
    public String display() {
        return "Hình chữ nhật{" + "chiều rộng="+ width+ ",chiều dài = "+ height + "}";
    }





}

