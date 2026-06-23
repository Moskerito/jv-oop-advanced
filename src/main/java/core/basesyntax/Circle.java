package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("This is a circle with the radius " + radius + " and area " + getArea());
    }
}
