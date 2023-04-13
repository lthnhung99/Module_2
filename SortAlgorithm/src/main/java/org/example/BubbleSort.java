package org.example;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {15, 5, -8, 3, 2};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }

    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
