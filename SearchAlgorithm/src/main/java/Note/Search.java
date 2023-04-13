package Note;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 10, 8};
       // selectionSort(arr);
        interchangeSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static int linearSearch(int[] numbers, int value) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }
    }

    public static void interchangeSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

}
