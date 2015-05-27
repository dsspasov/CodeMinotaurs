import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.event.FocusAdapter;

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

    public String text() {
        return textField.getText();
    }

    private void initialize() {
        startGame = new JFrame();
        startGame.setTitle("Start the game");
        startGame.setBounds(100, 100, 228, 237);
        startGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setBounds(46, 31, 128, 20);
        textField.addFocusListener(new FocusAdapter() {
        });
        startGame.getContentPane().setLayout(null);
        startGame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("Play");
        btnNewButton.setBounds(66, 56, 89, 23);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    String toForm2 = text();
                    if(!toForm2.isEmpty()){
                    startGame.dispose();
                    Game game = new Game();
                    Player player = new Player();
                    Game.getPlayer().setText(toForm2);
                    game.getNextQuestionButton().setVisible(false);
                    game.setVisible(true);
                    player.setName(toForm2);
                    player.setPoints(0);
                    player.setxCoordinate(0);
                    player.setyCoordinate(0);
                    }
                    else{
                        JOptionPane.showMessageDialog(startGame, "Please,don't leave the nickname field empty!");
                    }

            }
        });
        
        
        lblWriteYourNickname = new JLabel("Write your nickname here:");
        lblWriteYourNickname.setBounds(46, 11, 166, 14);
        lblWriteYourNickname.setForeground(new Color(102, 0, 0));
        startGame.getContentPane().add(lblWriteYourNickname);
        startGame.getContentPane().add(btnNewButton);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\cat.jpg"));
        lblNewLabel.setBounds(0, 0, 212, 199);
        startGame.getContentPane().add(lblNewLabel);
        
        

    }
}