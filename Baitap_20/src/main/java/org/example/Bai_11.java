package org.example;

import java.util.Arrays;

public class Bai_11 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9};
        arr = insertElement(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertElement(int[] arr, int x) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        int i;
        for (i = n - 1; i >= 0 && arr[i] > x; i--) {
            newArr[i + 1] = newArr[i];
        }
        newArr[i + 1] = x;
        return newArr;
    }


}
