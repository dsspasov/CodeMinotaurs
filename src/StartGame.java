import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class StartGame {

    private JFrame startGame;
    private JTextField textField;

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
        startGame.setBounds(100, 100, 450, 300);
        startGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startGame.getContentPane().setLayout(null);
        
        JButton btnNewButton = new JButton("Play");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame.dispose();
                Game game = new Game();
                String toForm2 = text();
                Game.getLabelPlayer().setText(toForm2);
                game.setVisible(true);
                
                
            }
        });
        btnNewButton.setBounds(108, 126, 89, 23);
        startGame.getContentPane().add(btnNewButton);
        btnNewButton.setFont(new Font("Tahoma",Font.BOLD,20));
        
        textField = new JTextField();
        textField.setBounds(63, 30, 86, 20);
        startGame.getContentPane().add(textField);
        textField.setColumns(10);
        
        
      
        
        
    }
    
}
