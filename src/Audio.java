import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class Audio {
    public static void playThatTrack() throws FileNotFoundException {
        File file = new File("C:/Users/Simo/Desktop/ohbaby.mp3");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        try {
            Player player = new Player(bis);
            player.play();
        } catch (JavaLayerException e) {

        }
    }
}
