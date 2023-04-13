package org.example;
import java.util.Scanner;
public class CountStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            System.out.println("Nhập số lượng sinh viên:");
            length = scanner.nextInt();
        } while (length <= 0 || length > 30);
        int[] marks = new int[length];
        for (int i =0; i < marks.length; i++){
            System.out.println("Nhập vào số điểm của sinh viên:"+i);
            marks[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < marks.length; i++){
            if (marks[i]>=5){
                count++;
            }
        }
        System.out.println("Số sinh viên thi đổ là: "+count);
    }
}
