package aoc2022.day1;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class CaloriesTest {

    @Test
    public void partOne() throws FileNotFoundException {
        Assert.assertEquals(67016, new Calories().maxCalories(new File("src/main/resources/aoc2022/day1/input.txt")));
    }

    @Test
    public void partTwo() throws FileNotFoundException {
        Assert.assertEquals(200116, new Calories().topThree(new File("src/main/resources/aoc2022/day1/input.txt")));
    }

    @Test
    public void top_three() {
        long calories = new Calories().topThree("""
                1000
                2000
                3000

                4000

                5000
                6000

                7000
                8000
                9000

                10000""");

        Assert.assertEquals(45000, calories);
    }

    @Test
    public void parse_calories() {

        long calories = new Calories().maxCalories("""
                1000
                2000
                3000

                4000

                5000
                6000

                7000
                8000
                9000

                10000""");

        Assert.assertEquals(24000, calories);
    }

    @Test
    public void parse_calories_edge_case() {

        long calories = new Calories().maxCalories("""
                1000
                2000
                3000

                4000

                5000
                6000

                7000
                8000
                9000

                100000""");

        Assert.assertEquals(100000, calories);
    }
}
