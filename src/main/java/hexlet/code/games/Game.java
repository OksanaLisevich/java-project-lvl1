package hexlet.code.games;

public interface Game {

    int NEEDED_SUCCESS_COUNT = 3;
    int MAX_NUMBER = 100;

    GameKit generateGameKit();

}
