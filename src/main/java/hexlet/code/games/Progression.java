package hexlet.code.games;

import java.util.Random;

public class Progression implements Game {
    private final int maxStart = 50;
    private final String gameInfo = "What number is missing in the progression?";
    private final int minLen = 5;
    private final int maxLen = 10;
    private String expectedAnswer;
    private String question;

    public final String getGameInfo() {
        return gameInfo;
    }

    public final void generateNewGameData() {
        Random random = new Random();
        int start = random.nextInt(maxStart);
        int counter = random.nextInt(maxStart);
        int len = random.nextInt(maxLen);
        len = len < minLen ? minLen : len;
        int hideIndex = random.nextInt(len);

        int[] progression = new int[len];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            progression[i] = start;
            start += counter;
            stringBuilder.append(i == hideIndex ? ".. " : progression[i] + " ");
        }

        expectedAnswer = "" + progression[hideIndex];
        question = stringBuilder.toString();
    }

    public final String getQuestion() {
        return question;
    }

    public final String getExpectedAnswer() {
        return expectedAnswer;
    }
}
