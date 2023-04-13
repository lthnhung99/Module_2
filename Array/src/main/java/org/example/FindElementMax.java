package org.example;

import java.util.Scanner;

public class FindElementMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột");
        int column = scanner.nextInt();
        int matrix[][] = new int[row][column];
        System.out.println("Nhập các phần tử cho ma trận");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("matrix[" + row + "][" + column + "]=");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);


    }

}
