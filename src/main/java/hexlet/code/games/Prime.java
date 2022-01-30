package hexlet.code.games;

import java.util.Random;

public class Prime implements Game {
    private final int maxNumber = 50;
    private final String gameInfo = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private String expectedAnswer;

    public final String getGameInfo() {
        return gameInfo;
    }

    public final String getQuestion() {
        Random random = new Random();
        int number = random.nextInt(maxNumber);

        expectedAnswer = isPrime(number) ? "yes" : "no";
        return "" + number;
    }

    public final String getExpectedAnswer() {
        return expectedAnswer;
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return number < 2 ? false : true;
    }

}
