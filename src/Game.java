import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;


public class Game extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 4503868451640434191L;
    private JPanel contentPane;
    private static JLabel labelPlayer;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Game frame = new Game();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    
    public Game() {
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel labelA = new JLabel("");
        labelA.setBounds(10, 203, 16, 23);
        labelA.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\kk.png"));
        contentPane.add(labelA);
        
        JLabel labelC = new JLabel("");
        labelC.setBounds(10, 237, 16, 14);
        labelC.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\cross.png"));
        contentPane.add(labelC);
        
        JLabel labelB = new JLabel("");
        labelB.setBounds(252, 212, 16, 14);
        labelB.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\cross.png"));
        contentPane.add(labelB);
        
        JLabel labelD = new JLabel("");
        labelD.setBounds(252, 237, 16, 14);
        labelD.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\cross.png"));
        contentPane.add(labelD);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("A");
        rdbtnNewRadioButton.setBounds(32, 203, 109, 23);
        contentPane.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("C");
        rdbtnNewRadioButton_1.setBounds(32, 232, 109, 23);
        contentPane.add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("B");
        rdbtnNewRadioButton_2.setBounds(274, 203, 109, 23);
        contentPane.add(rdbtnNewRadioButton_2);
        
        JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("D");
        rdbtnNewRadioButton_3.setBounds(274, 232, 109, 23);
        contentPane.add(rdbtnNewRadioButton_3);
        
        JLabel labelLabirinth = new JLabel("");
        labelLabirinth.setBounds(0, 11, 434, 156);
        labelLabirinth.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\1282889440_46813_1.jpg"));
        contentPane.add(labelLabirinth);
        
        JLabel labelQuestion = new JLabel("Question?");
        labelQuestion.setBounds(10, 178, 60, 14);
        contentPane.add(labelQuestion);
        
        setLabelPlayer(new JLabel("LameGuest"));
        getLabelPlayer().setBounds(252, 178, 60, 14);
        contentPane.add(getLabelPlayer());
    }

    public static JLabel getLabelPlayer() {
        return labelPlayer;
    }

    public void setLabelPlayer(JLabel labelPlayer) {
        Game.labelPlayer = labelPlayer;
    }

}
