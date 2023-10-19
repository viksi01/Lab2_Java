package task2;

public class Sphere extends VolumetricFigures {
    private final double radius;

    public Sphere(double radius) {

        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return 4 * Math.PI * radius * radius * radius / 3;
    }
}
