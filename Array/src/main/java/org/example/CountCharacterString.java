package org.example;

import java.util.Scanner;

public class CountCharacterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "codegymCodegym";
        System.out.println("Nhập ký tự");
        char character = 'd';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện ký tự " + character + " trong chuỗi " + str + " là " + count);
    }
}
/**
 * ----Nhập dữ liệu cho kiểu Char:
 * <p>
 * System.out.println("Nhập vào một chuỗi");
 * String str=scanner.next();
 * System.out.println("chuỗi " + str);
 * char character = str.charAt(3);
 * System.out.println("Ký tự" + character);
 */