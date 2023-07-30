package hexlet.code.games;

import hexlet.code.Cli;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public abstract class Engine {

    protected final String questionKeyValue = "Question";
    protected final String answerKeyValue = "Answer";

    public void start() {
        String userName = Cli.start();
        printGameConditions();
        Scanner scanner = new Scanner(System.in);

        int questionsCount = 3;
        while (questionsCount > 0) {
            HashMap<String, String> questionAndAnswer = getQuestionAndAnswer();
            System.out.println(questionAndAnswer.get(questionKeyValue));
            String userAnswer = scanner.next();
            String correctAnswer = questionAndAnswer.get(answerKeyValue);
            System.out.println("Your answer: " + userAnswer);
            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
                questionsCount--;
            } else {
                System.out.printf("""
                        '%s' is wrong answer ;(. Correct answer was '%s'.\s
                        Let's try again, %s!
                        %n""", userAnswer, correctAnswer, userName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!", userName);

    }

    protected int getNextInt() {
        Random rand = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        return rand.nextInt(lowerBound, upperBound);
    }

    protected abstract void printGameConditions();

    protected abstract HashMap<String, String> getQuestionAndAnswer();

}
