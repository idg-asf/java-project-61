package hexlet.code.games;


import java.util.HashMap;

public final class Even extends Engine {

    @Override
    protected void printGameConditions() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    @Override
    protected HashMap<String, String> getQuestionAndAnswer() {
        int numberForQuestion = getNextInt();
        String question = "Question: " + numberForQuestion;
        String answer = getAnswer(numberForQuestion);
        HashMap<String, String> result = new HashMap<>();
        result.put(getQuestionKeyValue(), question);
        result.put(getAnswerKeyValue(), answer);

        return result;
    }

    private String getAnswer(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
