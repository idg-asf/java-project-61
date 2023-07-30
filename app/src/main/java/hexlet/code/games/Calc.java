package hexlet.code.games;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public final class Calc extends Engine {

    @Override
    protected void printGameConditions() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    protected HashMap<String, String> getQuestionAndAnswer() {
        int firstNumber = getNextInt();
        int secondNumber = getNextInt();
        char operation = getOperation();

        String expression = String.format("%d %s %d", firstNumber, operation, secondNumber);

        int answer = getAnswer(firstNumber, secondNumber, operation);
        String question = "Question: " + expression;

        HashMap<String, String> result = new HashMap<>();
        result.put(questionKeyValue, question);
        result.put(answerKeyValue, String.valueOf(answer));

        return result;
    }

    private int getAnswer(int firstNumber, int secondNumber, char operation) {

        switch (operation) {
            case '+' -> {
                return firstNumber + secondNumber;
            }
            case '-' -> {
                return firstNumber - secondNumber;
            }
            case '*' -> {
                return firstNumber * secondNumber;
            }
            default -> System.out.println("Unexpected operation");
        }
        return firstNumber;
    }

    private char getOperation() {
        Set<Character> operations = Set.of('+', '-', '*');
        Random random = new Random();
        int randomIndex = random.nextInt(operations.size());
        int currentIndex = 0;

        for (char operation : operations) {
            if (currentIndex == randomIndex) {
                return operation;
            }
            currentIndex++;
        }

        return 0;
    }
}
