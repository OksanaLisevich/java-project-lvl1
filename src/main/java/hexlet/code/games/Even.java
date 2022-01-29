package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Even implements Game {

    private Scanner scanner;
    private int questionNumber;
    private final int maxNumber = 100;

    public Even(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getQuestion() {
        Random random = new Random();
        questionNumber = random.nextInt(maxNumber);
        return "" + questionNumber;
    }

    public String getQuestionResult() {
        if (questionNumber % 2 == 0) {
            return "yes";
        }
        return "no";
    }

}
