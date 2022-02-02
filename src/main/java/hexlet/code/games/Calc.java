package hexlet.code.games;

public class Calc implements Game {
    private static final String GAME_INFO = "What is the result of the expression?";
    private static final char[] ACTIONS = {'+', '-', '*'};

    public final String getInfo() {
        return GAME_INFO;
    }

    public final GameKit generateGameKit() {

        int firstNumber = Util.getRandomInt(Game.MAX_NUMBER);
        int secondNumber = Util.getRandomInt(Game.MAX_NUMBER);
        char action = ACTIONS[Util.getRandomInt(ACTIONS.length)];

        String question = firstNumber + " " + action + " " + secondNumber;
        String expectedAnswer = "" + calculate(firstNumber, secondNumber, action);

        return new GameKit(question, expectedAnswer);
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
