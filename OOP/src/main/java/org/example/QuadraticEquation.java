package org.example;

import java.util.Scanner;

public class QuadraticEquation {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println("Phương trình: ax^2+bx+c=0");
        double delta = equation.getDiscriminant();
        if (a != 0) {
            if (delta > 0)
                System.out.println("Phương trình có 2 nghiệm phân biệt:" + "x1= "+ equation.getRoot1(delta) + "\n"+ "x2= " + equation.getRoot2(delta));
            else if (delta == 0)
                System.out.println("Phương trình có nghiệm kép: x= " + equation.getRoot1(delta) );
            else System.out.println("Phương trình vô nghiệm");
        }
    }

    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getParameter(double parameter) {
        return parameter;
    }

    public double getDiscriminant() {
        double delta;
        delta = b * b - 4 * a * c;
        return delta;
    }
    public double getRoot1(double delta) {
        return (-b + Math.sqrt(delta)) / 2 * a;
    }

    public double getRoot2(double delta) {
        return (-b - Math.sqrt(delta)) / 2 * a;
    }
}

