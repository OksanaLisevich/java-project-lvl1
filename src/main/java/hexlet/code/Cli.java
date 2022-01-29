package hexlet.code;

import java.util.Scanner;

class Cli {

    public static String greeting(Scanner scan) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scan.next();
        System.out.printf("Hello, %s!\n", name);

        return name;
    }
}
