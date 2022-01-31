package hexlet.code.games;

public class GameKit {
    private String info;
    private String question;
    private String expectedAnswer;

    public final void setInfo(String gameInfo) {
        info = gameInfo;
    }

    public final void setQuestion(String gameQuestion) {
        question = gameQuestion;
    }

    public final void setExpectedAnswer(String gameExpectedAnswer) {
        expectedAnswer = gameExpectedAnswer;
    }

    public final String getInfo() {
        return info;
    }

    public final String getQuestion() {
        return question;
    }

    public final String getExpectedAnswer() {
        return expectedAnswer;
    }
}
