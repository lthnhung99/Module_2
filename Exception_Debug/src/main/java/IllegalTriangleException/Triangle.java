package IllegalTriangleException;

public class Triangle {
    private double a, b, c;

    public Triangle() {

    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh phải lớn hơn 0");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Không phải cạnh của tam giác");
        }
            this.a = a;
        this.b = b;
        this.c = c;
    }
}
