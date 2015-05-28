import java.util.List;


public class Question {
    private String question;
    private List<String> answers;
    private String correctAnswer;
    private String category;
    private String id;
    
    public Question(){
        super();
    }
     
    public Question(String question,List<String> answers, String answer, String category, String id){
        this.setQuestion(question);
        this.setAnswers(answers);
        this.setCorrectAnswer(answer);
        this.setCategory(category);
        this.setId(id);
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}
