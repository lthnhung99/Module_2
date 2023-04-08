import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("USD: ");
        double usd = scanner.nextDouble();
        final double rate = 23000;
        double vnd = usd * rate;
        System.out.printf(usd + " USD = " + vnd + " VND");
    }
}
