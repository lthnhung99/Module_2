import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập một kích thước vào:");
            size = scanner.nextInt();
            if(size>20) {
                System.out.println("Kích thước không vượt quá 20");
            }
        } while (size>20);
        array = new int[size];
        int i =0;
        while (i< array.length) {
            System.out.printf("Nhập phần tử " + (i+1) + ":");
            array[i]=scanner.nextInt();
            i++;
        }
        for (int j =0;j< array.length/2;j++) {
            int temp = array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.println("Đảo ngược mảng:");
        for(int j=0;j< array.length;j++) {
            System.out.print(array[j] + "\t");
        }
    }



}
