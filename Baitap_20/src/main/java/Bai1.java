
import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        int[] arr = {11, 456, 9, 135, 246, 579};
        System.out.println("Các giá trị có toàn chữ số lẻ là: ");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean checkOdd = true;
            while (num > 0) {
                int number = num % 10;
                if (number % 2 == 0) {
                    checkOdd = false;
                    break;
                }
                num /= 10;
            }
            if (checkOdd) {
                System.out.println(arr[i]+ " ");
            }
        }
    }

}












//    public static void main(String[] args) {
//        int x = 10;
//        int[] numbers = new int[x];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int) (Math.random() * 1000);
//        }
//        System.out.println(Arrays.toString(numbers));
//        for (int value : numbers) {
//            String num = Integer.toString(value);
//            boolean flag = true;
//            for (int j = 0; j < num.length(); j++) {
//                if (Integer.parseInt(String.valueOf(num.charAt(j))) % 2 == 0) {
//                    flag = false;
//                }
//            }
//            if (flag) {
//                System.out.printf("%4d", value);
//            }
//        }
//    }

