package org.example;
//Bài 6: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
public class Bai_6 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 7,8};
        int[] arr1 = {1, 3, 5, 7,8};
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            check = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                break;
            }
        }
        System.out.println(check);

    }
}
