package hexlet.code.games;

import java.util.Random;

public class GCD implements Game {
    private final int maxNumber = 100;
    private final String gameInfo = "Find the greatest common divisor of given numbers.";
    private String expectedAnswer;

    public final String getGameInfo() {
        return gameInfo;
    }

    public final String getQuestion() {
        Random random = new Random();
        int firstNumber = random.nextInt(maxNumber);
        int secondNumber = random.nextInt(maxNumber);

        expectedAnswer = "" + calculateGCD(firstNumber, secondNumber);
        return firstNumber + " " + secondNumber;
    }

    public final String getExpectedAnswer() {
        return expectedAnswer;
    }

    public static int calculateGCD(int firstNumber, int secondNumber) {
        int a = firstNumber > secondNumber ? firstNumber : secondNumber;
        int b = firstNumber > secondNumber ? secondNumber : firstNumber;
        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }
}
