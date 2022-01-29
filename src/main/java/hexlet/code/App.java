package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");

        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        String choice = scanner.next();

        Game game;

        switch (choice) {
            case "2":
                game = new Even(scanner);
                break;
            case "3":
                game = new Calc(scanner);
                break;
            default:
                Cli.greeting(scanner);
                return;
        }
        Engine engine = new Engine(game);
        engine.startGame();
        scanner.close();
    }
}
