package hexlet.code.games;

public interface Game {
    int NEEDED_SUCCESS_COUNT = 3;

    void printRule();
    String getQuestion();
    String getResult();
}
