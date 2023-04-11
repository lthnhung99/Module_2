package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[][] matrix = new int[2][3];
//        System.out.println("Enter" + matrix.length + "row and" + matrix[0].length + "colummns:");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = scanner.nextInt();
//            }
//            System.out.println(matrix);
//        }
//       Integer[] a,b;
//       a = new Integer[] {4,3,5};
//       b = new Integer[a.length];
//
//
//       b[0]++;
//        System.out.println(Arrays.deepToString(a));
//        System.out.println(Arrays.deepToString(b));
        char[] copyFrom = {
                'w', 'e', 'c', 'o', 'm', 'e',
                't', 'o',
                'g', 'p', 'c', 'o', 'd', 'e', 'r'
        };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 0, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
