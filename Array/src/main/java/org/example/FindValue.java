package org.example;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[] students = {"A","B","C","D"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0;i < students.length;i++) {
            if(students[i].equals(name)) {
                System.out.println("Vị trí của học sinh  "+ name + " trong danh sách là:" + i);
           check = true;
           break;
            }
        }
        if(check==false) {
            System.out.println("Không tìm thấy "+name+" trong danh sách");
        }
    }
}
