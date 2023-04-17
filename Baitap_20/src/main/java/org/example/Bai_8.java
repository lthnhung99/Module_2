package org.example;

import java.util.Arrays;

public class Bai_8 {
    //Bài 8: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
    public static void main(String[] args) {
        int[] arr = {10, 9, -4, 7, 2, 5};
        sortOddAscending(arr);
        System.out.println("Số lẻ tăng dần là: " + Arrays.toString(arr));
    }

    public static void sortOddAscending(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] % 2 != 0 && numbers[j] % 2 != 0) {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }
    }

}
