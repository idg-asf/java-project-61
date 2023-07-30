package hexlet.code.games;

import java.util.HashMap;

public final class Gcd extends Engine {
    @Override
    protected void printGameConditions() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    protected HashMap<String, String> getQuestionAndAnswer() {
        int firstNumber = getNextInt();
        int secondNumber = getNextInt();
        String expression = String.format("%d %d", firstNumber, secondNumber);
        String question = "Question: " + expression;

        int answer = getGcd(firstNumber, secondNumber);

        HashMap<String, String> result = new HashMap<>();
        result.put(questionKeyValue, question);
        result.put(answerKeyValue, String.valueOf(answer));

        return result;
    }

    private int getGcd(int a, int b) {
        if (a == b) {
            return a;
        }

        if (a > b) {
            return getGcd(a - b, b);
        }

        return getGcd(a, b - a);
    }
}
