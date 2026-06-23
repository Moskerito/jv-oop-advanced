package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width, Color color) {
        this.height = height;
        this.width = width;
        setColor(color);;
    }

    @Override
    double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, height: "
                + height + " units, width: " + width + " units, color: " + getColor().name());
    }
}
