package hexlet.code.games;

import java.util.Scanner;

public interface Game {
    int NEEDED_SUCCESS_COUNT = 3;

    Scanner getScanner();

    String getQuestion();
    String getQuestionResult();
}
