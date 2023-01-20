package aoc2022.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calories {

    public long maxCalories(String text) {
        return maxCalories(new Scanner(text));
    }

    public long maxCalories(File file) throws FileNotFoundException {
        return maxCalories(new Scanner(file));
    }

    public long topThree(String text) {
        return topThree(new Scanner(text));
    }

    public long topThree(File file) throws FileNotFoundException {
        return topThree(new Scanner(file));
    }

    private long maxCalories(Scanner scanner) {
        List<Long> calories = parseCalories(scanner);
        return calories.get(calories.size() - 1);
    }

    private long topThree(Scanner scanner) {
        List<Long> calories = parseCalories(scanner);
        return calories.get(calories.size() - 1) + calories.get(calories.size() - 2) + calories.get(calories.size() - 3);
    }

    private static List<Long> parseCalories(Scanner scanner) {
        long maxCalories = 0;
        long elfCalories = 0;
        List<Long> elvesCalories = new ArrayList<>();

        do {
            String line = scanner.nextLine();
            if (line.trim().length() == 0) {
                elvesCalories.add(elfCalories);
                elfCalories = 0;
                continue;
            }

            elfCalories += Long.parseLong(line);
        } while (scanner.hasNextLine());

        if (elfCalories != 0) {
            elvesCalories.add(elfCalories);
        }

        return elvesCalories.stream().sorted().toList();
    }
}
