package org.example;

import java.util.Arrays;
import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        /**
        int[] Numbers = {1,3,5,9,7,12,10,14,17};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mảng hiện tại là: "+ Arrays.toString(Numbers));
        System.out.println("Nhập vào số xóa khỏi mảng:");
        int number = scanner.nextInt();
        boolean flag = false;
        for (int i =0; i < Numbers.length ; i++){
            if(number == Numbers[i]){
                for(int j = i; j < Numbers.length-1; j++){
                    Numbers[j]=Numbers[j+1];
                }
                Numbers[Numbers.length-1] = 0;
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Số vừa nhập không có trong mảng");
        }else {
            System.out.println("Mảng sau khi xóa là: " + Arrays.toString(Numbers));
        }
        */
        Scanner scanner = new Scanner(System.in);
        int[] Numbers = {2, 4, 6, 8, 10};
        System.out.println("Mảng hiện tại: " + Arrays.toString(Numbers));
        System.out.println("Nhập vào giá trị cần xóa trong mảng");
        int delete = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == delete) {
                count++;
            }
        }
        int[] arrNew = new int[Numbers.length - count];
        int index = 0;
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == delete) {
                continue;
            } else {
                arrNew[index] = Numbers[i];
                index++;
            }
        }
        System.out.println("Giá trị các phần tử sau khi xóa:");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.printf("%d\t", arrNew[i]);
        }



    }
}
