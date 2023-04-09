import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        a = scanner.nextInt();
        System.out.println("Nhập sô b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 && b ==0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if(a > b) {
                a = a-b;
            }
            else {
                b = b-a;
            }
        }
        System.out.println("Ước chung lớn nhất là: " +a);

    }
}
