package hexlet.code.games;

public class GCD implements Game {
    private static final String GAME_INFO = "Find the greatest common divisor of given numbers.";

    public final GameKit generateGameKit() {
        GameKit gameKit = new GameKit();
        gameKit.setInfo(GAME_INFO);
        int firstNumber = Util.getRandomInt(Game.MAX_NUMBER);
        int secondNumber = Util.getRandomInt(Game.MAX_NUMBER);

        gameKit.setQuestion(firstNumber + " " + secondNumber);
        gameKit.setExpectedAnswer("" + calculateGCD(firstNumber, secondNumber));

        return gameKit;
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
