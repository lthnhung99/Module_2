import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " là năm nhuận");
                } else {
                    System.out.println(year + " không phải là năm nhuận");
            }
            } else {
                System.out.println(year + " là năm nhuận");
            }
        } else {
            System.out.println(year + " không phải là năm nhuận");
    }
    }
}
