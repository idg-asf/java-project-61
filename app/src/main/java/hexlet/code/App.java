package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static final int greetMenuNumber = 1;
    public static final int evenMenuNumber = 2;
    public static final int calcMenuNumber = 3;
    public static final int gcdMenuNumber =  4;
    public static final int progressionMenuNumber = 5;
    public static final int primeMenuNumber = 6;
    public static final int exitMenuNumber = 0;

    public static void main(String[] args) {

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice: " + userChoice + "\n");
        switch (userChoice) {
            case greetMenuNumber -> Cli.start();
            case evenMenuNumber -> {
                Even evenGame = new Even();
                evenGame.start();
            }
            case calcMenuNumber -> {
                Calc calcGame = new Calc();
                calcGame.start();
            }
            case gcdMenuNumber -> {
                Gcd gcdGame = new Gcd();
                gcdGame.start();
            }
            case progressionMenuNumber -> {
                Progression progression = new Progression();
                progression.start();
            }
            case primeMenuNumber -> {
                Prime prime = new Prime();
                prime.start();
            }
            case exitMenuNumber -> System.out.println("Bye");
            default -> System.out.println("No such number is present");
        }
    }
}
