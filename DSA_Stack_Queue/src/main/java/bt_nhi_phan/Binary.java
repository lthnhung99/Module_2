package bt_nhi_phan;

import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        int num =30;
        Stack<Integer> stack = new Stack<>();
        while (num>0) {
            stack.push(num%2);
            num/=2;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
