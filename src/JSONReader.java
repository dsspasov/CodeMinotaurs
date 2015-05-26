import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class JSONReader {

   private String path;
   private  List<Question> listOfQuestions;

   public List<Question> getListOfQuestions() {
    return listOfQuestions;
   }

   public JSONReader(String path){
        this.setPath(path);
        this.listOfQuestions = new ArrayList<Question>();
   }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
  
    public void read(){
        JSONParser parser = new JSONParser();        
        try {
            Object obj = parser.parse(new FileReader(this.getPath()));
            
            JSONArray listOfObjects = (JSONArray)obj;
            
            for(Object object: listOfObjects){
                JSONObject jsonObject = (JSONObject) object;
                
                String id = (String)jsonObject.get("id");
                String question = (String)jsonObject.get("question");
                String correctAnswer = (String)jsonObject.get("correctAnswer");
                
                JSONArray listOfAnswers = (JSONArray) jsonObject.get("listOfAnswers");
                List<String> answers = new ArrayList<String>();
                
                for(Object answer: listOfAnswers.toArray()){
                    answers.add((String) answer);                    
                }
                
                this.listOfQuestions.add(new Question(question, answers ,correctAnswer));
                              
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        String path = "C:/Users/user/Desktop/questions.json";
        JSONReader x =new JSONReader(path);
        x.read();
        System.out.println(x.getListOfQuestions().get(0).getCorrectAnswer().toString());
    }
}
