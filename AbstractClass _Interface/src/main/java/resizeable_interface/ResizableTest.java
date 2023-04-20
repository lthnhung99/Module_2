package resizeable_interface;

public class ResizableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(8);

        System.out.println("Trước khi thay đổi kích thước: ");
        for (Shape shape : shapes) {
            System.out.printf("Diện tích: %.1f of %s %n", shape.getArea(), shape);
        }

        for (Shape shape : shapes) {
            double percent = (int)(Math.random()*100+1);
            percent = percent / 100;
            if (shape instanceof Circle)
                ((Circle) shape).resize(percent);
            if (shape instanceof Rectangle)
                ((Rectangle) shape).resize(percent);
            if (shape instanceof Square)
                ((Square) shape).resize(percent);
        }

        System.out.println("Sau khi thay đổi kích thước: ");
        for (Shape shape : shapes) {
            System.out.printf("Diện tích: %.1f of %s %n", shape.getArea(), shape);
        }
    }
}
