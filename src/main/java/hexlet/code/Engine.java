package hexlet.code;

import hexlet.code.games.GameKit;
import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {

    private static Scanner scanner = new Scanner(System.in);

    public static void startGame(Game game) {
        GameKit[] gameKits = new GameKit[Game.NEEDED_SUCCESS_COUNT];
        for (int i = 0; i < gameKits.length; i++) {
            gameKits[i] = game.generateGameKit();
        }
        runGame(gameKits);
    }

    private static void runGame(GameKit[] gameKits) {
        final String name = Cli.greeting(scanner);
        System.out.println(gameKits[0].getInfo());
        for (int answerCount = 0; answerCount < Game.NEEDED_SUCCESS_COUNT; answerCount++) {
            GameKit gameKit = gameKits[answerCount];
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
