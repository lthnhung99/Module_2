package org.example;
//Bài 7: Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí

import java.util.Arrays;

public class Bai_7 {
    public static void main(String[] args) {
        int arr[] = {-10, 9, -5, 2, 3, 1};
        sortPositiveAscending(arr);
        System.out.println("Số dương tăng dần là: " + Arrays.toString(arr) );
    }

    public static void sortPositiveAscending(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > 0 && numbers[j] > 0) {
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
