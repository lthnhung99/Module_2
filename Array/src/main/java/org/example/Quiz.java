package org.example;

import java.util.Scanner;

public class Quiz {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào một số");
        int number = scanner.nextInt();
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.printf("%s là số nguyên tố: ", number);
        }
    }
}












