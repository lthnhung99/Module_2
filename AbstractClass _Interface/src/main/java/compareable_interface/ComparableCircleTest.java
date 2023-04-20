package compareable_interface;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        CompareableCircle[] circles = new CompareableCircle[3];
        circles[0]=new CompareableCircle(3.5);
        circles[1]=new CompareableCircle();
        circles[2]=new CompareableCircle(3.6,"indigo",false);
        System.out.println("Sắp xếp trước: ");
        for (CompareableCircle circle:circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("Sau khi sắp xếp: ");
        for (CompareableCircle circle:circles) {
            System.out.println(circle);
        }

    }
}
