import java.util.List;


public class Question {
    private String question;
    private List<String> answers;
    private String correctAnswer;
    
    public Question(){
        super();
    }
     
    public Question(String question,List<String> answers, String answer){
        this.setQuestion(question);
        this.setAnswers(answers);
        this.setCorrectAnswer(answer);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
    
}
