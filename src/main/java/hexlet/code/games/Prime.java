package hexlet.code.games;

import java.util.Random;

public class Prime implements Game {
    private final int maxNumber = 50;
    private String question;
    private String result;

    private void generateData() {
        Random random = new Random();
        int number = random.nextInt(maxNumber);

        question = "" + number;
        result = isPrime(number) ? "yes" : "no";
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public final void showRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public final String getQuestion() {
        generateData();
        return question;
    }

    public final String getResult() {
        return result;
    }
}
