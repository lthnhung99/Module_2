package org.example;

import java.util.Scanner;
import  java.util.Arrays;

public class Quiz {
    /**
     * public static Scanner scanner = new Scanner(System.in);
     * <p>
     * public static void main(String[] args) {
     * System.out.println("Nhập vào một số");
     * int number = scanner.nextInt();
     * boolean check = true;
     * if (number < 2) {
     * check = false;
     * } else {
     * for (int i = 2; i < Math.sqrt(number); i++) {
     * if (number % i == 0) {
     * check = false;
     * break;
     * }
     * }
     * }
     * if (check) {
     * System.out.printf("%s là số nguyên tố: ", number);
     * }
     * }
     */
//    public static void main(String[] args) {
//        int n, i, c;
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Nhập vào số phần tử của mảng: ");
//            n = scanner.nextInt();
//        } while (n <= 0);
//
//        int A[] = new int[n];
//
//        System.out.println("Nhập các phần tử cho mảng: ");
//        for (i = 0; i < n; i++) {
//            System.out.print("Nhập phần tử thứ " + i + ": ");
//            A[i] = scanner.nextInt();
//        }
//
//        System.out.println("Nhập số nguyên k: ");
//        int k = scanner.nextInt();
//
//        // xóa phần tử k ra khỏi mảng
//        // vòng lặp for sẽ khởi tạo c = i = 0
//        // và duyệt i từ 0 đến n
//        // nếu phần tử tại vị trí i khác với số nguyên k
//        // thì gán phần tử tại i cho phần tử tại k
//        // sau đó tăng c lên 1
//        for (c = i = 0; i < n; i++) {
//            if (A[i] != k) {
//                A[c] = A[i];
//                c++;
//            }
//        }
//
//        n = c;  // lúc này số phần tử trong mảng sẽ bằng c
//
//        // hiển thị các phần tử trong mảng sau khi xóa k
//        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
//        for (i = 0; i < n; i++) {
//            System.out.print(A[i] + "\t");
//        }
//    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 7, 4, 2, 2, 2, 2, 2, 3, 1};
        delete(2, arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void delete(int a, int[] arr) {
        for (int z = 0; z < arr.length; z++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == a) {
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[1 + j];
                    }
                    arr[arr.length - 1] = 0;
                }
            }
        }
    }
}












