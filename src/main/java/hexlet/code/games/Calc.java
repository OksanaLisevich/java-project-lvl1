package hexlet.code.games;

import java.util.Random;

public class Calc implements Game {
    private final int maxNumber = 50;
    private final String gameInfo = "What is the result of the expression?";
    private final char[] actions = {'+', '-', '*'};
    private String result;

    public final String getGameInfo() {
        return gameInfo;
    }

    public final String getQuestion() {
        Random random = new Random();
        int firstNumber = random.nextInt(maxNumber);
        int secondNumber = random.nextInt(maxNumber);

        char action = actions[random.nextInt(actions.length)];

        result = "" + calculate(firstNumber, secondNumber, action);
        return firstNumber + " " + action + " " + secondNumber;
    }

    public final String getResult() {
        return result;
    }

    public static int calculate(int firstNumber, int secondNumber, char action) {
        int result = 0;
        switch (action) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                break;
        }
        return result;
    }
}
