import java.util.Scanner;

public class FirstPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n = ");
        int n = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrimeNumbers(i)) {
                System.out.println(i + " ");
                count ++;
            }
            i++;
        }

    }
    public static boolean isPrimeNumbers(int n) {
        if(n<2) {
            return false;
        }
        int squareaRoot = (int) Math.sqrt(n);
        for(int i=2;i<=squareaRoot;i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
