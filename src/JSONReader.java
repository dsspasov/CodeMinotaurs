import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONReader {

    private String path;
    private List<Question> listOfQuestions;

    public JSONReader(String path) {
        this.setPath(path);
        this.listOfQuestions = new ArrayList<Question>();
    }

    public List<Question> getListOfQuestions() {
        return listOfQuestions;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void read() {
        JSONParser parser = new JSONParser();
        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(this.getPath()), "UTF-8"));

            Object obj = parser.parse(in);

            JSONArray listOfObjects = (JSONArray) obj;

            for (Object object : listOfObjects) {
                JSONObject jsonObject = (JSONObject) object;

                String id = (String) jsonObject.get("id");
                String question = (String) jsonObject.get("question");
                String correctAnswer = (String) jsonObject.get("correctAnswer");
                String category = (String) jsonObject.get("category");
                JSONArray listOfAnswers = (JSONArray) jsonObject.get("listOfAnswers");
                List<String> answers = new ArrayList<String>();
                for (Object answer : listOfAnswers.toArray()) {
                    answers.add((String) answer);
                }

                this.listOfQuestions.add(new Question(question, answers, correctAnswer, category, id));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
/*
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\Documents\\GitHub\\CodeMinotaurs\\questions.json";
        JSONReader x = new JSONReader(path);
        x.read();
        System.out.println(x.getListOfQuestions().get(0).getCorrectAnswer().toString());
    }
*/
}
