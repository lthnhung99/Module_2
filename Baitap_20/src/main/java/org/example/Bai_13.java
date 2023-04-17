package org.example;

import java.util.Arrays;
//Bài 13: Xóa tất cả các số chẵn trong mảng
public class Bai_13 {
    public static void main(String[] args) {
        int[] a = {6, 4, -3, -2, 1, 2, 3};
        int count = countNegativeNumber(a);
        a = sortNumber(a);
        int i = 0;
        while (i < count) {
            a = removeNegativeNumber(a);
            i++;
        }
        System.out.println(Arrays.toString(a));

    }

    public static int countNegativeNumber(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] %2  == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] sortNumber(int[] a) {
        for (int i = 0, j = 0; i < a.length; i++) {
            if (a[i] %2== 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }
        return a;
    }
    public static int[] removeNegativeNumber(int[] a) {
        int[] b = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
