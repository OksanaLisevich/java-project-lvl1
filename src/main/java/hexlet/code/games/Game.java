package hexlet.code.games;

public interface Game {

    int NEEDED_SUCCESS_COUNT = 3;

    String getGameInfo();
    String getQuestion();
    String getExpectedAnswer();
}
