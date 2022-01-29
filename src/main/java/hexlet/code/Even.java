package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {

    private static final int NEEDED_SUCCESS_COUNT = 3;

    public static void startGame(Scanner scanner) {
        final String name = Cli.greeting(scanner);
        int successAnswerCount = 0;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (successAnswerCount < NEEDED_SUCCESS_COUNT) {
            if (getAnswer(scanner)) {
                successAnswerCount++;
            } else {
                System.out.printf("Let's try again, %s\n", name);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", name);

    }

    public static boolean getAnswer(Scanner scanner) {
        String result = getQuestionResult();

        System.out.print("Your answer: ");
        String answer = scanner.next();

        if (answer.equals(result)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.printf("'%s' is wrong answer ;(. ", answer);
        System.out.printf("Correct answer was '%s'.\n", result);
        return false;

    }

    public static String getQuestionResult() {
        Random random = new Random();
        int questionNumber = random.nextInt();
        System.out.println("Question: " + questionNumber);
        if (questionNumber % 2 == 0) {
            return "yes";
        }
        return "no";
    }

}
