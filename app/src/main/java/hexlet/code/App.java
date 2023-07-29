package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice: " + userChoice);
        switch (userChoice) {
            case 1 -> Cli.start();
            case 2 -> {
                Even evenGame = new Even();
                evenGame.start();
            }
            case 3 -> {
                Calc calcGame = new Calc();
                calcGame.start();
            }
            case 0 -> System.out.println("Bye");
            default -> System.out.println("No such number is present");
        }
    }
}
