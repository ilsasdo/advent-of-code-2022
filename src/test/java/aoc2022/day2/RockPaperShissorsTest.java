package aoc2022.day2;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RockPaperShissorsTest {

    @Test
    public void second_part() throws FileNotFoundException {
        Assert.assertEquals(12526, new RockPaperScissors(new Scanner(new File("src/main/resources/aoc2022/day2/input.txt")), new SecondPartParser()).totalScore());
    }

    @Test
    public void game_parse_all() throws FileNotFoundException {
        Assert.assertEquals(10994, new RockPaperScissors(new Scanner(new File("src/main/resources/aoc2022/day2/input.txt")), new FirstPartParser()).totalScore());
    }

    @Test
    public void game_parse_second_part() {
        Assert.assertEquals(12, new RockPaperScissors(new Scanner("""
A Y
B X
C Z"""), new SecondPartParser()).totalScore());
    }

    @Test
    public void game_parse() {
        Assert.assertEquals(15, new RockPaperScissors(new Scanner("""
A Y
B X
C Z"""), new FirstPartParser()).totalScore());
    }

    @Test
    public void game_scores() {
        Assert.assertEquals(8, new Game(Shape.ROCK, Shape.PAPER).player2score());
        Assert.assertEquals(1, new Game(Shape.PAPER, Shape.ROCK).player2score());
        Assert.assertEquals(6, new Game(Shape.SHISSORS, Shape.SHISSORS).player2score());
    }
}
