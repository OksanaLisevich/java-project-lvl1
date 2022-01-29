package hexlet.code.games;

import java.util.Random;

public class GCD implements Game {
    private final int maxNumber = 100;
    private String question;
    private String result;

    private void generateData() {
        Random random = new Random();
        int firstNumber = random.nextInt(maxNumber);
        int secondNumber = random.nextInt(maxNumber);

        question = firstNumber + " " + secondNumber;
        result = "" + calculateGCD(firstNumber, secondNumber);
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

    public final void showRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public final String getQuestion() {
        generateData();
        return question;
    }

    public final String getResult() {
        return result;
    }
}
