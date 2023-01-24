package aoc2022.day2;

class Game {
    private final Shape player1;
    private final Shape player2;

    Game(Shape player1, Shape player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    int player2score() {
        return player2.getValue() + gameScore();
    }

    private int gameScore() {
        // draw
        if (player2 == player1) {
            return 3;
        }

        // win
        if (player2.beats(player1)) {
            return 6;
        }

        // lose
        return 0;
    }
}
