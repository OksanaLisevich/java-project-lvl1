package hexlet.code.games;

import java.util.Random;

public class Calc implements Game {
    private final int maxNumber = 50;
    private final char[] actions = {'+', '-', '*'};
    private String question;
    private String result = "";

    private void generateData() {
        Random random = new Random();
        int firstNumber = random.nextInt(maxNumber);
        int secondNumber = random.nextInt(maxNumber);

        int actionIndex = random.nextInt(actions.length);
        char action = actions[actionIndex];

        question = firstNumber + " " + action + " " + secondNumber;
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
    }

    public final String getQuestion() {
        generateData();
        return question;
    }

    public final String getResult() {
        return result;
    }
}
