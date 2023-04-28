package trien_khai_stack_array;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Kích thước sau khi thêm: " + stack.size());
        System.out.print("Các phần xóa:");
        while (!stack.isEmpty()) {
            System.out.printf(" %d" , stack.pop());
        }
        System.out.println("\n Kích thước sau khi xóa: " + stack.size());
    }
}
