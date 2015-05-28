import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DrawingLogic {
    static JFrame frame;
    public static void drawInitialLabirinth() {
        ImageIcon sky = new ImageIcon("C:/Users/Simo/Desktop/pics/kk.png");
        ImageIcon redsky = new ImageIcon("C:/Users/Simo/Desktop/pics/cross.png");
        ImageIcon playerIcon = new ImageIcon("C:/Users/Simo/Desktop/pics/player.png");

        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(25, 25));
        for (int i = 0; i < 25; i++) {
            for (int n = 0; n < 25; n++) {
                if (i == 0 && n == 0) {
                    grid.add(new JLabel(playerIcon));
                } else {
                    if (i % 2 == 0 && n % 2 == 0) {

                        grid.add(new JLabel(redsky));

                    } else {
                        grid.add(new JLabel(sky));
                    }
                }
            }
        }
        frame = new JFrame("Map");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // frame.setPreferredSize(new Dimension(640, 400));
        frame.add(grid);
        frame.pack();
        frame.setVisible(true);
    }
    public static void closeLabirinthFrame(){
        frame.dispose();
    }
}
