package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Calc implements Game {
    private Scanner scanner;
    private final int maxNumber = 100;
    private final char[] actions = {'+', '-', '*'};
    private int firstNumber;
    private int secondNumber;
    private char action;

    public Calc(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getQuestion() {
        Random random = new Random();
        firstNumber = random.nextInt(maxNumber);
        secondNumber = random.nextInt(maxNumber);

        int actionIndex = random.nextInt(actions.length);
        action = actions[actionIndex];

        return firstNumber + " " + action + " " + secondNumber;
    }

    public String getQuestionResult() {
        String result = "";
        switch (action) {
            case '+':
                result += (firstNumber + secondNumber);
                break;
            case '-':
                result += (firstNumber - secondNumber);
                break;
            case '*':
                result += (firstNumber * secondNumber);
                break;
            default:
                break;
        }
        return result;
    }
}
