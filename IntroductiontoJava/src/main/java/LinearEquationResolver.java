import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double x;
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Cho phương trình a * x + b = 0 , nhập hằng số vào");
        System.out.println("Nhập hằng số a");
        a = scanner.nextDouble();
        System.out.println("Nhập hằng số b");
        b = scanner.nextDouble();
        if(a == 0 && b == 0) {
            System.out.println("Phương trình vô số nghiệm");
        }
        if(a == 0 && b != 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        if(a != 0) {
            x = -b/a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }



    }
}
