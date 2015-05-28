import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONReader {

    private String path;
    public static List<Question> listOfQuestions;
    
    public JSONReader(String path) {
        this.setPath(path);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    public static List<Question> getListOfQuestions(){
        return JSONReader.listOfQuestions;
    }
    
    
    
    public List<Question> read() {
        JSONParser parser = new JSONParser();
        JSONReader.listOfQuestions = null; 
        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(this.getPath()), "UTF-8"));
            JSONReader.listOfQuestions = new ArrayList<Question>();
            
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
                
                JSONReader.listOfQuestions.add(new Question(question, answers, correctAnswer, category, id));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSONReader.listOfQuestions;

    }
/*
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\Documents\\GitHub\\CodeMinotaurs\\questions.json";
        JSONReader x = new JSONReader(path);
        System.out.println(x.read().get(0).getQuestion());
    }*/
}
