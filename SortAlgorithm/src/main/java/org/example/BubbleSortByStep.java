package org.example;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập giá trị: " + list.length);
        for (int i=0;i<list.length;i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("");

    }
}
