import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,heigth,bmi;
        System.out.println("Nhập chiều cao");
        heigth = scanner.nextDouble();
        System.out.println("Nhập cân nặng");
        weight = scanner.nextDouble();
        bmi = weight / Math.pow(heigth, 2);
        System.out.println(bmi);
        if(bmi<18.5) {
            System.out.println(bmi+ " Underweight");
        } else if(bmi<25) {
            System.out.println(bmi+ " Normal");
        } else if(bmi<30) {
            System.out.println(bmi+ " Overweight");
        } else {
            System.out.println(bmi+ " Obese");
        }
    }
}
