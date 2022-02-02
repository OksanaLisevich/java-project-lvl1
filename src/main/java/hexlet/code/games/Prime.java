package hexlet.code.games;

public class Prime implements Game {
    private static final String GAME_INFO = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public final String getInfo() {
        return GAME_INFO;
    }

    public final GameKit generateGameKit() {
        int number = Util.getRandomInt(Game.MAX_NUMBER);

        String question = "" + number;
        String expectedAnswer = isPrime(number) ? "yes" : "no";

        return new GameKit(question, expectedAnswer);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return number < 2 ? false : true;
    }

}
