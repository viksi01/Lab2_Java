package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FlatFigures> flatFigures = new ArrayList<>();

        flatFigures.add(new Circle(5));
        flatFigures.add(new Rectangle(5, 10));
        flatFigures.add(new Square(5));
        flatFigures.add(new Triangle(5, 10));

        for (FlatFigures figure : flatFigures) {
            System.out.println("Area :" + figure.area());
        }

        List<VolumetricFigures> volumetricFigures = new ArrayList<>();

        volumetricFigures.add(new Cube(5));
        volumetricFigures.add(new Sphere(5));
        volumetricFigures.add(new Pyramid(5, 10, 2));

        for (VolumetricFigures figure : volumetricFigures) {
            System.out.println("Area :" + figure.area());
            System.out.println("Volume :" + figure.volume());
        }

    }
}
