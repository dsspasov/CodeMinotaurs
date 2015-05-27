import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
        setBounds(100, 100, 575, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        
        JLabel labelA = new JLabel("");
        labelA.setBounds(10, 203, 16, 23);
        labelA.setVisible(false);
        contentPane.setLayout(null);
        labelA.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\kk.png"));
        contentPane.add(labelA);
        
        JLabel labelC = new JLabel("");
        labelC.setBounds(10, 237, 16, 14);
        labelC.setVisible(false);
        labelC.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\cross.png"));
        contentPane.add(labelC);
        
        JLabel labelB = new JLabel("");
        labelB.setBounds(390, 212, 16, 14);
        labelB.setVisible(false);
        labelB.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\cross.png"));
        contentPane.add(labelB);
        
        JLabel labelD = new JLabel("");
        labelD.setBounds(390, 237, 16, 14);
        labelD.setVisible(false);
        labelD.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\cross.png"));
        contentPane.add(labelD);
        
        JLabel labelScore = new JLabel("0");
        labelScore.setBounds(388, 178, 46, 14);
        contentPane.add(labelScore);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("A");
        rdbtnNewRadioButton.setBounds(32, 203, 109, 23);
        rdbtnNewRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdbtnNewRadioButton.isSelected() == true){
                    labelA.setVisible(true);
                    labelScore.setText(String.valueOf(Integer.parseInt(labelScore.getText()) + 300));
                }
            }
        });
        contentPane.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("C");
        rdbtnNewRadioButton_1.setBounds(32, 232, 109, 23);
        rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdbtnNewRadioButton_1.isSelected() == true){
                    labelA.setVisible(true);
                    labelC.setVisible(true);
                    
                }
            }
        });
        contentPane.add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("B");
        rdbtnNewRadioButton_2.setBounds(412, 203, 141, 23);
        rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdbtnNewRadioButton_2.isSelected() == true){
                    labelA.setVisible(true);
                    labelB.setVisible(true);
                }
            }
        });
        contentPane.add(rdbtnNewRadioButton_2);
        
        JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("D");
        rdbtnNewRadioButton_3.setBounds(412, 232, 141, 23);
        rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdbtnNewRadioButton_3.isSelected() == true){
                    labelA.setVisible(true);
                    labelD.setVisible(true);
                }
            }
        });
        contentPane.add(rdbtnNewRadioButton_3);
        
        JLabel labelLabirinth = new JLabel("");
        labelLabirinth.setBounds(0, 11, 434, 126);
        labelLabirinth.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\1282889440_46813_1.jpg"));
        contentPane.add(labelLabirinth);
        
        JLabel labelQuestion = new JLabel("Question?");
        labelQuestion.setBounds(10, 178, 60, 14);
        contentPane.add(labelQuestion);
        
        setPlayer(new JLabel("LameGuest"));
        getPlayer().setBounds(252, 178, 60, 14);
        contentPane.add(getPlayer());
        
        
        
    }
        
        

    public static JLabel getPlayer() {
        return labelPlayer;
    }

    public void setPlayer(JLabel labelPlayer) {
        Game.labelPlayer = labelPlayer;
    }

}