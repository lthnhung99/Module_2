package thuc_hanh_1;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("Stack chuỗi");
        stackOfIString();
        System.out.println("Stack số nguyên");
        stackOfIntefer();
    }

    private static void stackOfIString() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("Kích thước sau khi thêm: " + stack.size());
        System.out.print("Các phần tử được xóa: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n Kích thước sau khi xóa: " + stack.size());
    }


    private static void stackOfIntefer() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Kích thước sau khi thêm: " + stack.size());
        System.out.print("Các phần tử được xóa: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n Kích thước sau khi được xóa: "+ stack.size());
    }
}
