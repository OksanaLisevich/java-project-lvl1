package hexlet.code.games;

import java.util.Random;

public class Progression implements Game {
    private final int maxStart = 50;
    private final int minLen = 5;
    private final int maxLen = 10;
    private String question;
    private String result;

    private void generateData() {
        Random random = new Random();
        int start = random.nextInt(maxStart);
        int counter = random.nextInt(maxStart);
        int len = random.nextInt(maxLen);
        len = len < minLen ? minLen : len;
        int hideIndex = random.nextInt(len);

        int[] progression = new int[len];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < len; i++) {
            progression[i] = start + counter;
            start += counter;
            str.append(i == hideIndex ? ".." : "" + progression[i]);
            str.append(" ");
        }

        question = str.toString();
        result = "" + progression[hideIndex];
    }

    public final String getQuestion() {
        generateData();
        return question;
    }

    public final String getResult() {
        return result;
    }
}
