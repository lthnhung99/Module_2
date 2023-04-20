package org.example;

import java.util.Arrays;
//Bài 10: Thêm 1 phần tử x vào mảng tại vị trí k

public class Bai_10 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 5, 17, 9};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        arr = addElement(2, 15, arr);
        System.out.println("Mảng được thêm vào là: " + Arrays.toString(arr));
    }

    public static int[] addElement(int index, int element, int[] numbers) {
        int[] newNumbers = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        for (int i = index; i < newNumbers.length - 1; i++) {
            int temp = newNumbers[i];
            newNumbers[i] = newNumbers[newNumbers.length - 1];
            newNumbers[newNumbers.length - 1] = temp;
        }
        newNumbers[index] = element;
        return newNumbers;
    }
}
