package bai_tap_1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);

        System.out.println(myList.size());
        System.out.println(myList.get(0));
        myList.add(1, 7);
        System.out.println(myList.get(1));
        myList.remove(0);
        System.out.println(myList.get(0));
    }
}
