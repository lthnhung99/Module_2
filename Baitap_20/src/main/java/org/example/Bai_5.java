package org.example;
//Bài 5: Kiểm tra mảng có giảm dần hay không
public class Bai_5 {
    public static void main(String[] args) {
        int[] arr = {10,7,5,3,2};
        boolean check = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
