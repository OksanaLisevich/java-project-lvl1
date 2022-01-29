package hexlet.code.games;

import java.util.Random;

public class Even implements Game {

    private final int maxNumber = 100;
    private String question;
    private String result;

    private void generateData() {
        Random random = new Random();
        int questionNumber = random.nextInt(maxNumber);
        question = "" + questionNumber;
        result = isEven(questionNumber) ? "yes" : "no";
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public final String getQuestion() {
        generateData();
        return question;
    }

    public final String getResult() {
        return result;
    }

}
