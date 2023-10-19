package task2;

public class Pyramid extends VolumetricFigures {
    double baseArea;
    double sideArea;
    double height;

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
        return 1 / 3 * baseArea * height;
    }
}
