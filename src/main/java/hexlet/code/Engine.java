package hexlet.code;

import hexlet.code.games.GameKit;
import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {

    private static Scanner scanner = new Scanner(System.in);

    public static void startGame(Game game) {
        final String name = Cli.greeting(scanner);
        GameKit gameKit;
        System.out.println(game.getInfo());
        for (int answerCount = 0; answerCount < Game.NEEDED_SUCCESS_COUNT; answerCount++) {
            gameKit = game.generateGameKit();
            makeQuestion(gameKit.getQuestion());
            String answer = getAnswer();
            if (!checkAnswer(gameKit.getExpectedAnswer(), answer)) {
                System.out.printf("Let's try again, %s!\n", name);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", name);
    }

    private static void makeQuestion(String question) {
        System.out.println("Question: " + question);
    }

    private static String getAnswer() {
        System.out.print("Your answer: ");
        return scanner.next();
    }

    private static boolean checkAnswer(String expectedAnswer, String answer) {
        if (answer.equals(expectedAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.printf("'%s' is wrong answer ;(. ", answer);
        System.out.printf("Correct answer was '%s'.\n", expectedAnswer);
        return false;
    }

}
