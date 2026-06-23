package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg1;
    private int leg2;

    public RightTriangle(int leg1, int leg2, Color color) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        setColor(color);
    }

    @Override
    double getArea() {
        return (double) (leg1 * leg2) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq. units, firstLeg: "
                + leg1 + " units, secondLeg: " + leg2 + " units, color: " + getColor().name());
    }
}
