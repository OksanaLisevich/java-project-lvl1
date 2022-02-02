package hexlet.code.games;

public class GCD implements Game {
    private static final String GAME_INFO = "Find the greatest common divisor of given numbers.";

    public final String getInfo() {
        return GAME_INFO;
    }

    public final GameKit generateGameKit() {
        int firstNumber = Util.getRandomInt(Game.MAX_NUMBER);
        int secondNumber = Util.getRandomInt(Game.MAX_NUMBER);

        String question = firstNumber + " " + secondNumber;
        String expectedAnswer = "" + calculateGCD(firstNumber, secondNumber);

        return new GameKit(question, expectedAnswer);
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
