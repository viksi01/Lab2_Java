package task2;

public class Pyramid extends VolumetricFigures {
    private final double baseArea;
    private final double sideArea;
    private final double height;

    public Pyramid(double baseArea, double sideArea, double height) {
        this.baseArea = baseArea;
        this.sideArea = sideArea;
        this.height = height;
    }

    @Override
    public double area() {

        return baseArea + sideArea;
    }

    @Override
    public double volume() {
        return (double) 1 / 3 * baseArea * height;
    }
}
