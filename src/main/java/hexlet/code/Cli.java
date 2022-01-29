package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.printf("Hello, %1$s!\n", name);
        scanner.close();
    }
}
