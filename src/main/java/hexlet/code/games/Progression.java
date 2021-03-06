package hexlet.code.games;

public class Progression implements Game {
    private static final String GAME_INFO = "What number is missing in the progression?";
    private static final int MIN_LEN = 5;
    private static final int MAX_LEN = 10;

    public final String getInfo() {
        return GAME_INFO;
    }

    public final GameKit generateGameKit() {
        int start = Util.getRandomInt(Game.MAX_NUMBER);
        int counter = Util.getRandomInt(Game.MAX_NUMBER);
        int len = Util.getRandomInt(MIN_LEN, MAX_LEN);
        int hideIndex = Util.getRandomInt(len);
        int[] progression = new int[len];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            progression[i] = start;
            start += counter;
            stringBuilder.append(i == hideIndex ? ".. " : progression[i] + " ");
        }
        String question = stringBuilder.toString();
        String expectedAnswer = "" + progression[hideIndex];

        return new GameKit(question, expectedAnswer);
    }

}
