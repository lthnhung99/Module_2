package comparator_interface;
import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.5);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);
        System.out.println("Sắp xếp trước: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("Sau khi săp xếp:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

    }

}
