package hexlet.code.games;

public class Calc implements Game {
    private static final String GAME_INFO = "What is the result of the expression?";
    private static final char[] ACTIONS = {'+', '-', '*'};

    public final GameKit generateGameKit() {
        GameKit gameKit = new GameKit();
        gameKit.setInfo(GAME_INFO);

        int firstNumber = Util.getRandomInt(Game.MAX_NUMBER);
        int secondNumber = Util.getRandomInt(Game.MAX_NUMBER);
        char action = ACTIONS[Util.getRandomInt(ACTIONS.length)];

        gameKit.setQuestion(firstNumber + " " + action + " " + secondNumber);
        gameKit.setExpectedAnswer("" + calculate(firstNumber, secondNumber, action));

        return gameKit;
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
