package colorable_interface;

public class Square extends Shape implements Colorable {
    private double side = 1;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }

    @Override
    public String toString() {
        return "Square có side=" + side;
    }
}
