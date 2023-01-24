package aoc2022.day2;

public class SecondPartParser implements GameParser {
    private final FirstPartParser parser = new FirstPartParser();

    @Override
    public Shape[] parse(String line) {
        Shape player1 = Shape.valueFrom(line.substring(0, 1));
        String result = line.substring(2, 3);

        return new Shape[]{player1, getPlayer2(player1, result)};
    }

    private Shape getPlayer2(Shape player1, String result) {
        // lose
        if ("X".equals(result)) {
            return player1.opponent().opponent();
        }

        // draw
        if ("Y".equals(result)) {
            return player1;
        }

        // win
        if ("Z".equals(result)) {
            return player1.opponent();
        }

        throw new IllegalArgumentException("unexpected value: " + result);
    }
}
