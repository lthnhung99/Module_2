package bt_palindrome_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "able was i ere i saw elba";
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(String.valueOf(str.charAt(i)));
            queue.offer(String.valueOf(str.charAt(i)));
        }
        boolean check = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                check = false;
            }
        }
        if (check) System.out.println("Chuỗi đối xứng");
        else System.out.println("Chuỗi không đối xứng");
    }
}
