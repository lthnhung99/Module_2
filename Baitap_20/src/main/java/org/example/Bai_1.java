package org.example;

//Bài 1: Hãy liệt kê các giá trị có toàn chữ số lẻ trong mảng 1 chiều các số nguyên
public class Bai_1 {
    public static void main(String[] args) {
        int[] arr = {11, -353, 9, 135, 246, 579, 13579};
        System.out.println("Các giá trị có toàn chữ số lẻ là: ");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean checkOdd = true;
            while (num > 0) {
                int number = num % 10;
                if (number % 2 == 0) {
                    checkOdd = false;
                    break;
                }
                num /= 10;
            }
            if (checkOdd) {
                System.out.print(arr[i] + " ");
            }

        }

    }
}




