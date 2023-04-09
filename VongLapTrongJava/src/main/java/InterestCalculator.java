import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money = 1;
        int month = 1;
        double interestRate = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi:");
        money = scanner.nextDouble();
        System.out.println("Nhập sô tháng gửi:");
        month = scanner.nextInt();
        System.out.println("Nhập lãi xuất");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for(int i=0;i<month;i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Lãi xuất là: " +totalInterest);

    }
}
