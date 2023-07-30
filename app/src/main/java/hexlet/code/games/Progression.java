package hexlet.code.games;

import java.util.HashMap;
import java.util.Random;

public class Progression extends Engine {

    private final int progressionLength = 10;
    @Override
    protected void printGameConditions() {
        System.out.println("What number is missing in the progression?");
    }

    @Override
    protected HashMap<String, String> getQuestionAndAnswer() {
        int step = getNextInt();
        int value = getNextInt();
        int hiddenPosition = getHiddenPosition();

        StringBuilder question = new StringBuilder("Question:");
        HashMap<String, String> result = new HashMap<>();

        for (int i = 0; i < progressionLength; i++) {
            value += step;
            if (i == hiddenPosition) {
                question.append(" ..");
                result.put(answerKeyValue, String.valueOf(value));
            } else {
                question.append(" ").append(value);
            }
        }

        result.put(questionKeyValue, String.valueOf(question));
        return result;
    }

    private int getHiddenPosition() {
        Random random = new Random();
        return random.nextInt(progressionLength);
    }
}
