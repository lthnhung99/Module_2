package th_bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void bubbleSort(int[] list){
        boolean check = true;
        for (int j = 1; j < list.length && check; j++){
            check = false;
            for (int i = 0; i < list.length - j; i++){
                if (list[i] > list[i + 1]){
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    check = true;
                }
            }
        }
    }
}
