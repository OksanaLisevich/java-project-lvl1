package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");

        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        String choice = scanner.next();

        Engine engine = new Engine();

        switch (choice) {
            case "2":
                engine.setGame(new Even());
                break;
            case "3":
                engine.setGame(new Calc());
                break;
            case "4":
                engine.setGame(new GCD());
                break;
            case "5":
                engine.setGame(new Progression());
                break;
            case "6":
                engine.setGame(new Prime());
                break;
            default:
                Cli.greeting(scanner);
                return;
        }

        engine.startGame();
        scanner.close();
    }
}
