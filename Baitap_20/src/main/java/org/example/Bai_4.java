package org.example;
//Bài 4: Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0
public class Bai_4 {
    public static void main(String[] args) {
        int [] arr = {1,0,2,5,10,6};
        int value = 0;
        for(int i=0;i< arr.length;i++) {
            if(arr[i]==0) {
               value= 1;
               break;
            }
        }
        System.out.println(value);
    }
}
