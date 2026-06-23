package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    @Override
    double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("This is a rectangle with the height " + height + ", width "
        + width + " and area " + getArea());
    }
}
