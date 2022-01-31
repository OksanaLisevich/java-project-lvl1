package hexlet.code.games;

import java.util.Random;

public class Util {
    public static int getRandomInt(int maxNumber) {
        Random random = new Random();
        return random.nextInt(maxNumber);
    }

    public static int getRandomInt(int minNumber, int maxNumber) {
        Random random = new Random();
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }
}
