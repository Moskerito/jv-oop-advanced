package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        setColor(Color.valueOf(color));
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, height: "
                + height + " units, width: " + width + " units, color: " + getColor().name());
    }
}
