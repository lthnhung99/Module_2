package org.example;
//Bài 2: Hãy liệt kê các vị trí mà giá trị tại đó là số nguyên tố
//trong mảng 1 chiều các số nguyên

public class Bai_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 10, 9};
        for (int i = 0; i < arr.length; i++) {
            boolean check = true;
            if (arr[i] < 2) {
                check = false;
            } else {
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println("Vị trí " + i + " số nguyên tố là: " + arr[i]);
            }


        }
    }
}
