package hexlet.code.games;

public class Even implements Game {
    private static final String GAME_INFO = "Answer 'yes' if number even otherwise answer 'no'.";

    public final GameKit generateGameKit() {
        GameKit gameKit = new GameKit();
        gameKit.setInfo(GAME_INFO);
        int questionNumber = Util.getRandomInt(Game.MAX_NUMBER);

        gameKit.setQuestion("" + questionNumber);
        gameKit.setExpectedAnswer(isEven(questionNumber) ? "yes" : "no");

        return gameKit;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
