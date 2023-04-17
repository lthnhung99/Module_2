package org.example;

import java.util.Arrays;

public class Bai_9 {
    public static void main(String[] args) {
        int arr[] = {1, 8, 2, -8, -3, -2};
        sortPositiveIncreaseNegativeDecrease(arr);
        System.out.println("Số dương tăng dần và số âm giảm dần là: "+Arrays.toString(arr));
    }
    public static void sortPositiveIncreaseNegativeDecrease(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > 0 && numbers[j] > 0) {
                    if (numbers[i] > numbers[j]) {
                        swap(numbers, i, j);
                    }
                }
                if (numbers[i] < 0 && numbers[j] < 0) {
                    if (numbers[i] < numbers[j]) {
                        swap(numbers, i, j);
                    }
                }
            }
        }
    }
    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
