package hexlet.code.games;

import java.util.HashMap;

public final class Prime extends Engine {
    @Override
    protected void printGameConditions() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    protected HashMap<String, String> getQuestionAndAnswer() {
        int number = getNextInt();
        String question = "Question: " + number;
        String answer = getAnswer(number);
        HashMap<String, String> result = new HashMap<>();
        result.put(questionKeyValue, question);
        result.put(answerKeyValue, answer);

        return result;
    }

    private boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private String getAnswer(int number) {
        return isPrime(number) ? "yes" : "no";
    }
}
