package hexlet.code.games;

public class GameKit {
    private final String question;
    private final String expectedAnswer;

    public  GameKit(String gameQuestion, String gameExpectedAnswer) {
        question = gameQuestion;
        expectedAnswer = gameExpectedAnswer;
    }

    public final String getQuestion() {
        return question;
    }

    public final String getExpectedAnswer() {
        return expectedAnswer;
    }
}
