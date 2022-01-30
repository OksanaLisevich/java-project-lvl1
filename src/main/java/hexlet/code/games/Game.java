package hexlet.code.games;

public interface Game {

    int NEEDED_SUCCESS_COUNT = 3;

    String getGameInfo();
    void generateNewGameData();
    String getQuestion();
    String getExpectedAnswer();
}
