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
        return switch (figureIndex) {
            case 0 -> new Circle(random.nextInt(PARAMS_BOUND), colorSupplier.getRandomColor());
            case 1 -> new IsoscelesTrapezoid(random.nextInt(PARAMS_BOUND),
                    random.nextInt(PARAMS_BOUND), random.nextInt(PARAMS_BOUND),
                    colorSupplier.getRandomColor());
            case 2 -> new Rectangle(random.nextInt(PARAMS_BOUND), random.nextInt(PARAMS_BOUND),
                    colorSupplier.getRandomColor());
            case 3 -> new RightTriangle(random.nextInt(PARAMS_BOUND), random.nextInt(PARAMS_BOUND),
                    colorSupplier.getRandomColor());
            case 4 -> new Square(random.nextInt(PARAMS_BOUND), colorSupplier.getRandomColor());
            default -> throw new IllegalArgumentException("Unknown figure type: " + figureIndex);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }
}
