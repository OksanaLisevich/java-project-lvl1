package hexlet.code.games;

import java.util.Random;

public class Even implements Game {

    private final int maxNumber = 100;
    private String question;
    private String result = "no";

    private void generateData() {
        Random random = new Random();
        int questionNumber = random.nextInt(maxNumber);
        question = "" + questionNumber;
        if (questionNumber % 2 == 0) {
            result = "yes";
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
