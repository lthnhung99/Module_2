import java.util.Scanner;

public class SmallPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n =");
        int n = scanner.nextInt();
        System.out.println("Tất cả số nguyên tố nhỏ hơn 100 là:");
        if(n >= 2) {
            System.out.println(2);
        }
        for(int i =3;i<n;i+=2) {
            if (isPrimeNumber(i)) {
                System.out.println(" " +i);
            }
        }

    }
    public static boolean isPrimeNumber(int n) {
        if(n<2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i =2;i<=squareRoot;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
