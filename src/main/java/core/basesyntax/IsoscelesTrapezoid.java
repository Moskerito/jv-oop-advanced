package core.basesyntax;
public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int side;

    public IsoscelesTrapezoid(int base1, int base2, int side, String color) {
        this.base1 = base1;
        this.base2 = base2;
        this.side = side;
        setColor(Color.valueOf(color));
    }

    @Override
    public double getArea() {
        double x = (double) Math.abs(base2 - base1) / 2;
        double h = Math.sqrt(Math.pow(side, 2) - Math.pow(x, 2));
        return (base1 + base2) * h / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, first base: " + base1 + " units, second base: " + base2
                + " units, side: " + side + " units, color: " + getColor().name());
    }
}
