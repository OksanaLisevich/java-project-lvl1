package hexlet.code.games;

public class Prime implements Game {
    private static final String GAME_INFO = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public final GameKit generateGameKit() {
        GameKit gameKit = new GameKit();
        gameKit.setInfo(GAME_INFO);
        int number = Util.getRandomInt(Game.MAX_NUMBER);
        gameKit.setQuestion("" + number);
        gameKit.setExpectedAnswer(isPrime(number) ? "yes" : "no");

        return gameKit;
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
