package task2;

public class Triangle extends FlatFigures {
    private final double side;
    private final double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double area() {
        return 1 / 2 * side * height;
    }
}
