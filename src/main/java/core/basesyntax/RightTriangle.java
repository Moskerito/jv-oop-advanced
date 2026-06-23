package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg1;
    private int leg2;

    @Override
    double getArea() {
        return (double) (leg1 * leg2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("This is a right triangle with legs " + leg1 + " and " + leg2
        + " and area " + getArea());
    }
}
