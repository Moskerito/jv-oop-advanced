package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int side;

    @Override
    double getArea() {
        double x = (double) Math.abs(base2 - base1) / 2;
        double h = Math.sqrt(Math.pow(side, 2) - Math.pow(x, 2));
        return (base1 + base2) * h / 2;
    }

    @Override
    public void draw() {
        System.out.println("This is an isosceles trapezoid with bases " + base1 + " and "
        + base2 + " and sides of " + side + " making an area of " + getArea());
    }
}
