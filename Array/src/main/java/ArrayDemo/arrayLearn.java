package ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class arrayLearn {
    public static void main(String[] args) {
        int[] myList = {2, 5, 6, 8, 10};
        //myList=addElements(2,myList);
        //myList = deleteElement(4, myList);
        myList = addValue(2, 15, myList);
        System.out.println(Arrays.toString(myList));
    }


    public static int[] addElements(int value, int[] number) {
        int[] newList = new int[number.length + 1];
        for (int i = 0; i < number.length; i++) {
            newList[i] = number[i];
        }
        newList[newList.length - 1] = value;
        return newList;
    }

    public static int[] deleteElement(int index, int[] number) {
        int[] newList = new int[number.length - 1];
        for (int i = 0; i < number.length - 1; i++) {
            newList[i] = number[i];
        }
        for (int i = index + 1; i < number.length; i++) {
            newList[i - 1] = number[i];
        }
        return newList;
    }

    public static int[] addValue(int index, int value, int[] numbers) {

        int[] newList = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newList[i] = numbers[i];
        }

        newList[index] = value;
        for (int i = index; i < newList.length-1; i++) {
            newList[i + 1] = numbers[i];
        }
        return newList;
    }



}
