package hexlet.code.games;

import java.util.Random;

public class Even implements Game {

    private final int maxNumber = 100;
    private final String gameInfo = "Answer 'yes' if number even otherwise answer 'no'.";
    private String expectedAnswer;

    public final String getGameInfo() {
        return gameInfo;
    }

    public final String getQuestion() {
        Random random = new Random();
        int questionNumber = random.nextInt(maxNumber);
        expectedAnswer = isEven(questionNumber) ? "yes" : "no";
        return "" + questionNumber;
    }

    public final String getExpectedAnswer() {
        return expectedAnswer;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
