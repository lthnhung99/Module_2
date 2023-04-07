import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        float weight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        weight = scanner.nextFloat();
        System.out.println("Nhập chiều dài:");
        height = scanner.nextFloat();
        float S = weight * height;
        System.out.println("Diện tích hình chữ nhật S = " + S);
    }
}
