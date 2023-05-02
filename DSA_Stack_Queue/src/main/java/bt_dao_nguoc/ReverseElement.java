package bt_dao_nguoc;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        /**Scanner sc = new Scanner(System.in);
        Stack<String> stackString = new Stack<String>();
        System.out.println("Nhập vào chuỗi: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stackString.push(str.charAt(i) + "");
        }
        System.out.println("Chuỗi đảo ngược");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stackString.pop());
        }*/
        Stack<Integer> stack = new Stack<>();
        int[] numbers = {2,4,6,8,10};
        for (int num: numbers){
            stack.push(num);
        }
        System.out.println("Mảng stack: " + stack);

        Stack<Integer> reverseStack = new Stack<>();
        while (!stack.isEmpty()){
            reverseStack.push(stack.pop());
        }
        System.out.println("Đảo ngược mảng stack: " + reverseStack);


        Stack<String> wStack = new Stack<>();
        String str = "Codegym Hue";
        for (int i = 0; i < str.length(); i++){
            wStack.push(String.valueOf(str.charAt(i)));
        }
        String newStr = "";
        while (!wStack.isEmpty()){
            String mWord = wStack.pop();
            newStr += mWord;
        }
        System.out.println("Đảo ngược chuỗi: " + newStr);

    }


}
