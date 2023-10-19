package task2;

public class Cube extends VolumetricFigures {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
