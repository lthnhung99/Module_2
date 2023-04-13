package org.example;

import java.util.Scanner;

public class SumDiagonalMatrix {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ma trận");
        int m = scanner.nextInt();
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
        System.out.println("Ma trận matrix vừa nhập");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                     sum += matrix[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = "+sum);

    }
}
