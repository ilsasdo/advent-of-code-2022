package aoc2022.day2;

public class FirstPartParser implements GameParser {
    @Override
    public Shape[] parse(String line) {
        return new Shape[]{Shape.valueFrom(line.substring(0, 1)),
                Shape.valueFrom(line.substring(2, 3))};
    }
}
