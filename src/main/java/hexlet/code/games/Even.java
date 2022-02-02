package hexlet.code.games;

public class Even implements Game {
    private static final String GAME_INFO = "Answer 'yes' if number even otherwise answer 'no'.";

    public final String getInfo() {
        return GAME_INFO;
    }

    public final GameKit generateGameKit() {
        int questionNumber = Util.getRandomInt(Game.MAX_NUMBER);

        String question = "" + questionNumber;
        String expectedAnswer = isEven(questionNumber) ? "yes" : "no";

        return new GameKit(question, expectedAnswer);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
