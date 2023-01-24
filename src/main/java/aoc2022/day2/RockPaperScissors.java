package aoc2022.day2;

import java.util.Scanner;

public class RockPaperScissors {
    private final Scanner scanner;
    private final GameParser parser;

    RockPaperScissors(Scanner scanner, GameParser parser) {
        this.scanner = scanner;
        this.parser = parser;
    }

    public int totalScore() {
        int totalScore = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Shape[] shapes = parser.parse(line);
            totalScore += new Game(shapes[0], shapes[1]).player2score();
        }
        return totalScore;
    }

}
