package aoc2022.day2;

enum Shape {
    ROCK(1), PAPER(2), SHISSORS(3);

    private final int value;

    Shape(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Shape valueFrom(String s) {
        if ("A".equals(s) || "X".equals(s)) {
            return ROCK;
        }
        if ("B".equals(s) || "Y".equals(s)) {
            return PAPER;
        }
        if ("C".equals(s) || "Z".equals(s)) {
            return SHISSORS;
        }
        throw new IllegalArgumentException("Unknown value: "+s);
    }

    public boolean beats(Shape opponent) {
        if (this == ROCK && opponent == SHISSORS) {
            return true;
        } else if (this == PAPER && opponent == ROCK) {
            return true;
        } else if (this == SHISSORS && opponent == PAPER) {
            return true;
        }

        return false;
    }

    public Shape opponent() {
        if (this == ROCK) {
            return PAPER;
        }

        if (this == PAPER) {
            return SHISSORS;
        }

        return ROCK;
    }
}
