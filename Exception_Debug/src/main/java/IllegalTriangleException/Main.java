package IllegalTriangleException;

public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(2,1,4);
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }

    }
}
