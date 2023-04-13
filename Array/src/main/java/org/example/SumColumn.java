package org.example;
import java.util.Scanner;
public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài matrix");
        int a = scanner.nextInt();
        System.out.println("Nhập vào độ dài của một dòng trong matrix");
        int b = scanner.nextInt();
        int[][] matrix = new int[a][b];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println("Nhập vào giá trị cho matrix tại vị trí dòng " + row + " cột " + column);
                matrix[row][column] = scanner.nextInt();
            }
        }
        System.out.println("Nhap cot muon tinh tong");
        int sumCol = scanner.nextInt();
        int colTotal = 0;
        for (int row = 0; row < matrix.length; row++){
            colTotal += matrix[row][sumCol];
        }
        System.out.println("Tong cua cot "+sumCol+" la "+colTotal);
    }

}
