package hexlet.code.games;

import java.util.Random;

public class Even implements Game {

    private final int maxNumber = 100;
    private final String gameInfo = "Answer 'yes' if number even otherwise answer 'no'.";
    private String result;

    public final String getGameInfo() {
        return gameInfo;
    }

    public final String getQuestion() {
        Random random = new Random();
        int questionNumber = random.nextInt(maxNumber);
        result = isEven(questionNumber) ? "yes" : "no";
        return "" + questionNumber;
    }

    public final String getResult() {
        return result;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
