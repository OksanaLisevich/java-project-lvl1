package hexlet.code.games;

import java.util.Random;

public class Util {
    private static Random random = new Random();

    public static int getRandomInt(int maxNumber) {
        return random.nextInt(maxNumber);
    }

    public static int getRandomInt(int minNumber, int maxNumber) {
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }
}
