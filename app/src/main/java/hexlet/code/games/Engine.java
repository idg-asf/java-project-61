package hexlet.code.games;

import hexlet.code.Cli;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public abstract class Engine {

    private final String questionKeyValue = "Question";
    private final String answerKeyValue = "Answer";

    private final int questionsToAsk = 3;

    private final int lowerBound = 1;

    private final int upperBound = 100;

    /**
     * Explains the game process. All the games should share the same logic - 3 questions,
     * continues if an answer is correct, otherwise stops the game.
     */
    public final void start() {
        String userName = Cli.start();
        printGameConditions();
        Scanner scanner = new Scanner(System.in);

        int questionsCount = questionsToAsk;
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


    /**
     * @return Returns key value for a question.
     */
    public String getQuestionKeyValue() {
        return questionKeyValue;
    }

    /**
     * @return Returns key value for an answer.
     */
    public String getAnswerKeyValue() {
        return answerKeyValue;
    }

    /**
     * @return Returns a random int value in the range from 1 to 100.
     */
    protected int getNextInt() {
        Random rand = new Random();
        return rand.nextInt(lowerBound, upperBound);
    }

    /**
     * Prints a game conditions specific for each game.
     */
    protected abstract void printGameConditions();

    /**
     * @return Returns a Map that consists of two pairs - questions and its value, and answer and its value.
     */
    protected abstract HashMap<String, String> getQuestionAndAnswer();

}
