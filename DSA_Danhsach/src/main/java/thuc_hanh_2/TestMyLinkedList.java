package thuc_hanh_2;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("TESTING");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(15);
        ll.addFirst(16);
        ll.addFirst(17);
        ll.add(2,12);
        ll.printList();




    }
}
