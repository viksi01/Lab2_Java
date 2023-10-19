package task2;

public class Circle extends FlatFigures {
    private double radius;

    public Circle(double radius) {

        this.radius = radius;

    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
