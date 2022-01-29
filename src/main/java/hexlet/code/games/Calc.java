package hexlet.code.games;

import java.util.Random;

public class Calc implements Game {
    private final int maxNumber = 50;
    private final char[] actions = {'+', '-', '*'};
    private String question;
    private String result;

    private void generateData() {
        Random random = new Random();
        int firstNumber = random.nextInt(maxNumber);
        int secondNumber = random.nextInt(maxNumber);

        int actionIndex = random.nextInt(actions.length);
        char action = actions[actionIndex];

        question = firstNumber + " " + action + " " + secondNumber;
        result = "" + calculate(firstNumber, secondNumber, action);
    }

    public static int calculate(int firstNumber, int secondNumber, char action) {
        int result = 0;
        switch (action) {
            case '+':
                result = (firstNumber + secondNumber);
                break;
            case '-':
                result = (firstNumber - secondNumber);
                break;
            case '*':
                result = (firstNumber * secondNumber);
                break;
            default:
                break;
        }
        return result;
    }

    public final void showRules() {
        System.out.println("What is the result of the expression?");
    }

    public final String getQuestion() {
        generateData();
        return question;
    }

    public final String getResult() {
        return result;
    }
}
