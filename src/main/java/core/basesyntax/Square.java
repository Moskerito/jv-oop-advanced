package core.basesyntax;

public class Square extends Figure {
    private int side;

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("This is a square with sides " + side + " and area " + getArea());
    }

}
