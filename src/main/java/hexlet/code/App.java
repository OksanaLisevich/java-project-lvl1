package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");

        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case "1":
                Cli.greeting(scanner);
                break;
            case "2":
                Even.startGame(scanner);
                break;
            default:
                System.out.println("Good by!");
        }
        scanner.close();
    }
}
