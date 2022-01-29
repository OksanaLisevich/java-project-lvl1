package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {

    private Game game;
    private Scanner scanner;

    public Engine(Game game) {
        this.game = game;
        scanner = game.getScanner();
    }

    public void startGame() {
        final String name = Cli.greeting(scanner);
        int successAnswerCount = 0;

        while (successAnswerCount < Game.NEEDED_SUCCESS_COUNT) {
            makeQuestion();
            if (isCorrectAnswer()) {
                successAnswerCount++;
            } else {
                System.out.printf("Let's try again, %s\n", name);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", name);
    }

    public boolean isCorrectAnswer() {
        String result = game.getQuestionResult();
        String answer = getAnswer();

        if (answer.equals(result)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.printf("'%s' is wrong answer ;(. ", answer);
        System.out.printf("Correct answer was '%s'.\n", result);
        return false;

    }

    public void makeQuestion() {
        String question = game.getQuestion();
        System.out.println("Question: " + question);
    }

    public String getAnswer() {
        System.out.print("Your answer: ");
        return scanner.next();
    }
}
