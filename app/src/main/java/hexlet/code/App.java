package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static final int GREET_MENU_NUMBER = 1;
    public static final int EVEN_MENU_NUMBER = 2;
    public static final int CALC_MENU_NUMBER = 3;
    public static final int GCD_MENU_NUMBER =  4;
    public static final int PROGRESSION_MENU_NUMBER = 5;
    public static final int PRIME_MENU_NUMBER = 6;
    public static final int EXIT_MENU_NUMBER = 0;

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
            case GREET_MENU_NUMBER -> Cli.start();
            case EVEN_MENU_NUMBER -> {
                Even evenGame = new Even();
                evenGame.start();
            }
            case CALC_MENU_NUMBER -> {
                Calc calcGame = new Calc();
                calcGame.start();
            }
            case GCD_MENU_NUMBER -> {
                Gcd gcdGame = new Gcd();
                gcdGame.start();
            }
            case PROGRESSION_MENU_NUMBER -> {
                Progression progression = new Progression();
                progression.start();
            }
            case PRIME_MENU_NUMBER -> {
                Prime prime = new Prime();
                prime.start();
            }
            case EXIT_MENU_NUMBER -> System.out.println("Bye");
            default -> System.out.println("No such number is present");
        }
    }
}
