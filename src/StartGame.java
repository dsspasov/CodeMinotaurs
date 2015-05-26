import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;


public class StartGame {

    private JFrame startGame;
    private JTextField textField;
    private JLabel lblWriteYourNickname;
    private JLabel lblNewLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StartGame window = new StartGame();
                    window.startGame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public StartGame() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    
    public String text(){
        return textField.getText();
    }

    private void initialize() {
        startGame = new JFrame();
        startGame.setTitle("Start the game");
        startGame.setBounds(100, 100, 228, 237);
        startGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btnNewButton = new JButton("Play");
        btnNewButton.setBounds(66, 56, 89, 23);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame.dispose();
                Game game = new Game();
                String toForm2 = text();
                Game.getPlayer().setText(toForm2);
                game.setVisible(true);
                
                
            }
        });
        startGame.getContentPane().setLayout(null);
        startGame.getContentPane().add(btnNewButton);
        btnNewButton.setFont(new Font("Tahoma",Font.BOLD,20));
        
        textField = new JTextField();
        textField.setBounds(46, 31, 128, 20);
        startGame.getContentPane().add(textField);
        textField.setColumns(10);
        
        lblWriteYourNickname = new JLabel("Write your nickname here:");
        lblWriteYourNickname.setForeground(new Color(102, 0, 0));
        lblWriteYourNickname.setBounds(46, 11, 166, 14);
        startGame.getContentPane().add(lblWriteYourNickname);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\cat.jpg"));
        lblNewLabel.setBounds(0, 0, 196, 192);
        startGame.getContentPane().add(lblNewLabel);
        
        
      
        
        
    }
    
}