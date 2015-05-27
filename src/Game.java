import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;

public class Game extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 4503868451640434191L;
    private JPanel contentPane;
    private JSONReader x;
    private String path = "C:/Users/Simo/Desktop/questions.json";
    private static JLabel labelPlayer;
    private JRadioButton rdbtnA, rdbtnB, rdbtnC, rdbtnD;
    private JButton btnNextQuestion;
    private Icon checkIcon = new ImageIcon("C:/Users/Simo/Desktop/pics/kk.png");
    private Icon crossIcon = new ImageIcon("C:/Users/Simo/Desktop/pics/cross.png");

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
    int numberOfQuestions;
    public int getLength() {
        x=new JSONReader(path);
        x.read();
        numberOfQuestions = x.getListOfQuestions().size();
        return numberOfQuestions;
    }
    
    Random rand = new Random();
    int questionIndex = (int) rand.nextInt(getLength());

    public JButton getNextQuestionButton() {
        return btnNextQuestion;
    }

    public Game() {
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        /*x = new JSONReader(path);
        x.read();*/

        JLabel labelA = new JLabel("");
        labelA.setBounds(10, 277, 16, 23);
        contentPane.setLayout(null);
        contentPane.add(labelA);

        JLabel labelC = new JLabel("");
        labelC.setBounds(10, 327, 16, 14);
        contentPane.add(labelC);

        JLabel labelB = new JLabel("");
        labelB.setBounds(10, 297, 16, 14);
        contentPane.add(labelB);

        JLabel labelD = new JLabel("");
        labelD.setBounds(10, 352, 16, 14);
        contentPane.add(labelD);

        JLabel labelScore = new JLabel("0");
        labelScore.setBounds(374, 243, 91, 14);
        contentPane.add(labelScore);

        JLabel labelQuestion = new JLabel(x.getListOfQuestions().get(questionIndex).getQuestion().toString());
        labelQuestion.setBounds(10, 178, 587, 54);
        contentPane.add(labelQuestion);
        rdbtnA = new JRadioButton(x.getListOfQuestions().get(questionIndex).getAnswers().get(0));
        rdbtnA.setBounds(32, 268, 565, 23);
        rdbtnA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnA.isSelected() == true) {
                    if (rdbtnA.getText().equals(
                            x.getListOfQuestions().get(questionIndex).getCorrectAnswer().toString())) {
                        rdbtnB.setEnabled(false);
                        rdbtnC.setEnabled(false);
                        rdbtnD.setEnabled(false);
                        labelA.setIcon(checkIcon);
                        labelScore.setText(String.valueOf(Integer.parseInt(labelScore.getText()) + 300));
                        btnNextQuestion.setVisible(true);

                    } else {
                        rdbtnB.setEnabled(false);
                        rdbtnC.setEnabled(false);
                        rdbtnD.setEnabled(false);
                        labelA.setIcon(crossIcon);
                        btnNextQuestion.setVisible(true);
                    }

                }
            }
        });
        contentPane.add(rdbtnA);

        rdbtnB = new JRadioButton(x.getListOfQuestions().get(questionIndex).getAnswers().get(1));
        rdbtnB.setBounds(32, 297, 565, 23);
        rdbtnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnB.isSelected() == true) {
                    if (rdbtnB.getText().equals(
                            x.getListOfQuestions().get(questionIndex).getCorrectAnswer().toString())) {
                        rdbtnA.setEnabled(false);
                        rdbtnC.setEnabled(false);
                        rdbtnD.setEnabled(false);
                        labelB.setIcon(checkIcon);
                        labelScore.setText(String.valueOf(Integer.parseInt(labelScore.getText()) + 300));
                        btnNextQuestion.setVisible(true);

                    } else {
                        rdbtnA.setEnabled(false);
                        rdbtnC.setEnabled(false);
                        rdbtnD.setEnabled(false);
                        labelB.setIcon(crossIcon);
                        btnNextQuestion.setVisible(true);
                    }
                }
            }
        });
        contentPane.add(rdbtnB);

        rdbtnC = new JRadioButton(x.getListOfQuestions().get(questionIndex).getAnswers().get(2));
        rdbtnC.setBounds(32, 323, 565, 23);
        labelC.setIcon(null);
        rdbtnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnC.isSelected() == true) {
                    if (rdbtnC.getText().equals(x.getListOfQuestions().get(questionIndex).getCorrectAnswer().toString())) {
                        rdbtnB.setEnabled(false);
                        rdbtnA.setEnabled(false);
                        rdbtnD.setEnabled(false);
                        labelC.setIcon(checkIcon);
                        labelScore.setText(String.valueOf(Integer.parseInt(labelScore.getText()) + 300));
                        btnNextQuestion.setVisible(true);

                    } else {
                        rdbtnB.setEnabled(false);
                        rdbtnA.setEnabled(false);
                        rdbtnD.setEnabled(false);
                        labelC.setIcon(crossIcon);
                        btnNextQuestion.setVisible(true);
                    }
                }
            }
        });
        contentPane.add(rdbtnC);

        rdbtnD = new JRadioButton(x.getListOfQuestions().get(questionIndex).getAnswers().get(3));
        rdbtnD.setBounds(32, 349, 565, 23);
        rdbtnD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnD.isSelected() == true) {
                    if (rdbtnD.getText().equals(x.getListOfQuestions().get(questionIndex).getCorrectAnswer().toString())) {
                        rdbtnB.setEnabled(false);
                        rdbtnC.setEnabled(false);
                        rdbtnA.setEnabled(false);
                        labelD.setIcon(checkIcon);
                        labelScore.setText(String.valueOf(Integer.parseInt(labelScore.getText()) + 300));
                        btnNextQuestion.setVisible(true);

                    } else {
                        rdbtnB.setEnabled(false);
                        rdbtnC.setEnabled(false);
                        rdbtnA.setEnabled(false);
                        labelD.setIcon(crossIcon);
                        btnNextQuestion.setVisible(true);
                    }
                }
            }
        });
        contentPane.add(rdbtnD);

        JLabel labelLabirinth = new JLabel("");
        labelLabirinth.setBounds(0, 11, 434, 126);
        labelLabirinth.setIcon(new ImageIcon("C:\\Users\\Simo\\Desktop\\pics\\1282889440_46813_1.jpg"));
        contentPane.add(labelLabirinth);

        labelPlayer = new JLabel("New label");
        labelPlayer.setBounds(10, 243, 230, 14);
        contentPane.add(labelPlayer);

        btnNextQuestion = new JButton("Next question");
        btnNextQuestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                questionIndex = rand.nextInt(getLength());
                labelQuestion.setText(x.getListOfQuestions().get(questionIndex).getQuestion().toString());
                rdbtnA.setText(x.getListOfQuestions().get(questionIndex).getAnswers().get(0).toString());
                rdbtnB.setText(x.getListOfQuestions().get(questionIndex).getAnswers().get(1).toString());
                rdbtnC.setText(x.getListOfQuestions().get(questionIndex).getAnswers().get(2).toString());
                rdbtnD.setText(x.getListOfQuestions().get(questionIndex).getAnswers().get(3).toString());
                labelA.setIcon(null);
                labelB.setIcon(null);
                labelC.setIcon(null);
                labelD.setIcon(null);
                rdbtnA.setEnabled(true);
                rdbtnA.setSelected(false);
                rdbtnB.setEnabled(true);
                rdbtnB.setSelected(false);
                rdbtnC.setEnabled(true);
                rdbtnC.setSelected(false);
                rdbtnD.setEnabled(true);
                rdbtnD.setSelected(false);
                btnNextQuestion.setVisible(false);

            }
        });
        btnNextQuestion.setBounds(475, 402, 125, 23);
        contentPane.add(btnNextQuestion);

    }

    public static JLabel getPlayer() {
        return labelPlayer;
    }
}