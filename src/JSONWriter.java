import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;


public class JSONWriter {
    private static Player currentPlayer = new Player();

    public JSONWriter() {
        putPlayers();
    }

    private void putPlayers() {

    }

    public static void main(String[] args) throws IOException {
        Gson g = new Gson();
        JsonWriter gw = new JsonWriter(new FileWriter("test.json", true));
        gw.beginArray();
        
        for(int i = 0; i < 5; i++){
            gw.beginObject();
            gw.name("name").value(currentPlayer.getName());
            gw.name("highScore").value(i);
            gw.endObject();
            
        }
       
        gw.endArray();
        gw.close();
        
       // currentPlayer.setName("Ivan");
       // currentPlayer.setPoints(40);
        
        //FileWriter fw = new FileWriter("test.json", true);
        
        //gw.write(g.toJson(currentPlayer.getName())+":" + currentPlayer.getPoints() + "\n");
        //fw.close();
        
        


    }

}