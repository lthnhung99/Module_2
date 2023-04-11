import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
       /** int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập một kích thước :");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước không được vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;

        }
        System.out.println("Danh mục tài sản:");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất là :" + max + "tại vị trí:" + index);
    */
       Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*15);
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
        int max = a[0];
        int index = -1;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        System.out.printf("a[%d] = %d là max", index, max);
    }
}
