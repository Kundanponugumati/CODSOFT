package quizApplication;

public class Questions {
    private String QNo;
    private String QTitile;
    private String Option1;
    private String Option2;
    private String Option3;
    private String Option4;
    private String Answer;
    private String AnswerOption;

    public Questions(String QNo, String QTitile, String option1, String option2, String option3, String option4, String answer, String answerOption) {
        this.QNo = QNo;
        this.QTitile = QTitile;
        Option1 = option1;
        Option2 = option2;
        Option3 = option3;
        Option4 = option4;
        Answer = answer;
        AnswerOption = answerOption;
    }

    public Questions() {
    }

    public String getQNo() {
        return QNo;
    }

    public String getQTitile() {
        return QTitile;
    }

    public String getOption1() {
        return Option1;
    }

    public String getOption2() {
        return Option2;
    }

    public String getOption3() {
        return Option3;
    }

    public String getOption4() {
        return Option4;
    }

    public String getAnswer() {
        return Answer;
    }
    public String getAnswerOption() {
        return AnswerOption;
    }
}
