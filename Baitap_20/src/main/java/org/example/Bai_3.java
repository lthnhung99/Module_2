package org.example;

public class Bai_3 {
    public static void main(String[] args) {
        int[] arr = {1, 15, 3, 4, 115, 6, 7, 5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            num %= 10;
            if (num == 5) {
                count++;
            }
        }
        System.out.println("Giá trị tận cùng bằng 5 là: " + count);
    }
}
