package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {

    private Game game;
    private Scanner scanner;

    public Engine() {
        scanner = new Scanner(System.in);
    }

    public final void setGame(Game selectedGame) {
        game = selectedGame;
    }

    public final void startGame() {
        final String name = Cli.greeting(scanner);
        int successAnswerCount = 0;
        game.printRule();
        while (successAnswerCount < Game.NEEDED_SUCCESS_COUNT) {
            makeQuestion();
            if (isCorrectAnswer()) {
                successAnswerCount++;
            } else {
                System.out.printf("Let's try again, %s!\n", name);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", name);
    }

    private void makeQuestion() {
        System.out.println("Question: " + game.getQuestion());
    }

    private boolean isCorrectAnswer() {
        String result = game.getResult();
        String answer = getAnswer();

        if (answer.equals(result)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.printf("'%s' is wrong answer ;(. ", answer);
        System.out.printf("Correct answer was '%s'.\n", result);
        return false;

    }

    private String getAnswer() {
        System.out.print("Your answer: ");
        return scanner.next();
    }
}
