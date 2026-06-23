package core.basesyntax;
import java.util.Random;
public class FigureSupplier {
    public static final int PARAMS_BOUND = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final int INDEX_BOUND = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(INDEX_BOUND);
        switch (figureIndex) {
            case 0: {
                int radius = random.nextInt(PARAMS_BOUND);
                return new Circle(radius, colorSupplier.getRandomColor());
            }
            case 1: {
                int base1 = random.nextInt(PARAMS_BOUND);
                int base2 = random.nextInt(PARAMS_BOUND);
                int side = random.nextInt(PARAMS_BOUND);
                return new IsoscelesTrapezoid(base1, base2, side, colorSupplier.getRandomColor());
            }
            case 2: {
                int heigth = random.nextInt(PARAMS_BOUND);
                int width = random.nextInt(PARAMS_BOUND);
                return new Rectangle(heigth, width, colorSupplier.getRandomColor());
            }
            case 3: {
                int leg1 = random.nextInt(PARAMS_BOUND);
                int leg2 = random.nextInt(PARAMS_BOUND);
                return new RightTriangle(leg1, leg2, colorSupplier.getRandomColor());
            }
            case 4: {
                int side = random.nextInt(PARAMS_BOUND);
                return new Square(side, colorSupplier.getRandomColor());
            }
            default: throw new IllegalArgumentException("Unknown figure type: " + figureIndex);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, "WHITE");
    }
}
