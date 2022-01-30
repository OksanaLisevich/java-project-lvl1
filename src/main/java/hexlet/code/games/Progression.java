package hexlet.code.games;

import java.util.Random;

public class Progression implements Game {
    private final int maxStart = 50;
    private final String rule = "What number is missing in the progression?";
    private final int minLen = 5;
    private final int maxLen = 10;
    private String result;

    public final void printRule() {
        System.out.println(rule);
    }

    public final String getQuestion() {
        Random random = new Random();
        int start = random.nextInt(maxStart);
        int counter = random.nextInt(maxStart);
        int len = random.nextInt(maxLen);
        len = len < minLen ? minLen : len;
        int hideIndex = random.nextInt(len);

        int[] progression = new int[len];
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < len; i++) {
            progression[i] = start;
            start += counter;
            question.append(i == hideIndex ? ".. " : progression[i] + " ");
        }

        result = "" + progression[hideIndex];
        return question.toString();
    }

    public final String getResult() {
        return result;
    }
}
