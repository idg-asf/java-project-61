package hexlet.code;


import java.util.HashMap;

public class Even extends Engine {

    @Override
    protected void printGameConditions() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
    }

    @Override
    protected HashMap<String, String> getQuestionAndAnswer() {
        int numberForQuestion = getNextInt();
        String question = "Question: " + numberForQuestion;
        String answer = getCorrectAnswer(numberForQuestion);
        HashMap<String, String> result = new HashMap<>();
        result.put(questionKeyValue, question);
        result.put(answerKeyValue, answer);

        return result;
    }

    private String getCorrectAnswer(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
