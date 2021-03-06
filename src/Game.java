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
import java.io.FileNotFoundException;
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
        x = new JSONReader(path);
        x.read();
        numberOfQuestions = x.read().size();
        return numberOfQuestions;
    }

    public void disableAll() {
        rdbtnA.setEnabled(false);
        rdbtnB.setEnabled(false);
        rdbtnC.setEnabled(false);
        rdbtnD.setEnabled(false);

    }

    Random rand = new Random();
    int questionIndex = (int) rand.nextInt(getLength());
    int killingSpree = 0;

    public JButton getNextQuestionButton() {
        return btnNextQuestion;
    }

    public Game() {
        DrawingLogic.drawInitialLabirinth();
        setTitle("Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel labelA = new JLabel("");
        labelA.setBounds(49, 382, 16, 14);
        contentPane.add(labelA);

        JLabel labelC = new JLabel("");
        labelC.setBounds(49, 437, 16, 14);
        contentPane.add(labelC);

        JLabel labelB = new JLabel("");
        labelB.setBounds(49, 407, 16, 14);
        contentPane.add(labelB);

        JLabel labelD = new JLabel("");
        labelD.setBounds(49, 462, 16, 14);
        contentPane.add(labelD);

        JLabel labelScore = new JLabel("0");
        labelScore.setBounds(413, 348, 91, 14);
        contentPane.add(labelScore);

        JLabel labelQuestion = new JLabel(x.read().get(questionIndex).getQuestion().toString());
        labelQuestion.setBounds(10, 178, 730, 107);
        contentPane.add(labelQuestion);
        rdbtnA = new JRadioButton(x.read().get(questionIndex).getAnswers().get(0));
        rdbtnA.setBounds(71, 376, 565, 23);
        rdbtnA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnA.isSelected() == true) {
                    if (rdbtnA.getText()
                            .equals(x.read().get(questionIndex).getCorrectAnswer().toString())) {
                        disableAll();
                        labelA.setIcon(checkIcon);
                        DrawingLogic.closeLabirinthFrame();
                        DrawingLogic.drawInitialLabirinth();
                        killingSpree++;
                        if (killingSpree == 3) {
                            try {
                                Audio.playThatTrack();
                            } catch (FileNotFoundException e1) {
                                e1.printStackTrace();
                            }
                        }

                        labelScore.setText(String.valueOf(Integer.parseInt(labelScore.getText()) + 300));
                        btnNextQuestion.setVisible(true);
                    } else {
                        killingSpree = 0;
                        disableAll();
                        DrawingLogic.closeLabirinthFrame();
                        DrawingLogic.drawInitialLabirinth();
                        labelA.setIcon(crossIcon);
                        btnNextQuestion.setVisible(true);
                    }
                }

            }

        });
        contentPane.add(rdbtnA);

        rdbtnB = new JRadioButton(x.read().get(questionIndex).getAnswers().get(1));
        rdbtnB.setBounds(71, 402, 565, 23);
        rdbtnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnB.isSelected() == true) {
                    if (rdbtnB.getText()
                            .equals(x.read().get(questionIndex).getCorrectAnswer().toString())) {
                        disableAll();
                        labelB.setIcon(checkIcon);
                        DrawingLogic.closeLabirinthFrame();
                        DrawingLogic.drawInitialLabirinth();
                        killingSpree++;
                        if (killingSpree == 3) {
                            try {
                                Audio.playThatTrack();
                            } catch (FileNotFoundException e1) {
                                e1.printStackTrace();
                            }
                        }

                        labelScore.setText(String.valueOf(Integer.parseInt(labelScore.getText()) + 300));
                        btnNextQuestion.setVisible(true);

                    } else {
                        killingSpree = 0;
                        disableAll();
                        DrawingLogic.closeLabirinthFrame();
                        DrawingLogic.drawInitialLabirinth();
                        labelB.setIcon(crossIcon);
                        btnNextQuestion.setVisible(true);
                    }
                }
            }
        });
        contentPane.add(rdbtnB);

        rdbtnC = new JRadioButton(x.read().get(questionIndex).getAnswers().get(2));
        rdbtnC.setBounds(71, 428, 565, 23);
        labelC.setIcon(null);
        rdbtnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnC.isSelected() == true) {
                    if (rdbtnC.getText()
                            .equals(x.read().get(questionIndex).getCorrectAnswer().toString())) {
                        disableAll();
                        labelC.setIcon(checkIcon);
                        DrawingLogic.closeLabirinthFrame();
                        DrawingLogic.drawInitialLabirinth();
                        killingSpree++;
                        if (killingSpree == 3) {
                            try {
                                Audio.playThatTrack();
                            } catch (FileNotFoundException e1) {
                                e1.printStackTrace();
                            }
                        }

                        labelScore.setText(String.valueOf(Integer.parseInt(labelScore.getText()) + 300));
                        btnNextQuestion.setVisible(true);

                    } else {
                        killingSpree = 0;
                        disableAll();
                        DrawingLogic.closeLabirinthFrame();
                        DrawingLogic.drawInitialLabirinth();
                        labelC.setIcon(crossIcon);
                        btnNextQuestion.setVisible(true);
                    }
                }
            }

        });
        contentPane.add(rdbtnC);

        rdbtnD = new JRadioButton(x.read().get(questionIndex).getAnswers().get(3));
        rdbtnD.setBounds(71, 454, 565, 23);
        rdbtnD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rdbtnD.isSelected() == true) {
                    if (rdbtnD.getText()
                            .equals(x.read().get(questionIndex).getCorrectAnswer().toString())) {
                        disableAll();
                        labelD.setIcon(checkIcon);
                        DrawingLogic.closeLabirinthFrame();
                        DrawingLogic.drawInitialLabirinth();
                        killingSpree++;
                        if (killingSpree == 3) {
                            try {
                                Audio.playThatTrack();
                            } catch (FileNotFoundException e1) {
                                e1.printStackTrace();
                            }
                        }
                            labelScore.setText(String.valueOf(Integer.parseInt(labelScore.getText()) + 300));
                            btnNextQuestion.setVisible(true);
                        

                        } else {
                            killingSpree = 0;
                            disableAll();
                            DrawingLogic.closeLabirinthFrame();
                            DrawingLogic.drawInitialLabirinth();
                            labelD.setIcon(crossIcon);
                            btnNextQuestion.setVisible(true);
                        }
                }

            }

        });
        contentPane.add(rdbtnD);

        labelPlayer = new JLabel("New label");
        labelPlayer.setBounds(71, 348, 230, 14);
        contentPane.add(labelPlayer);

        btnNextQuestion = new JButton("Next question");
        btnNextQuestion.setBounds(514, 507, 125, 23);
        btnNextQuestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                questionIndex = rand.nextInt(getLength());
                labelQuestion.setText(x.read().get(questionIndex).getQuestion().toString());
                rdbtnA.setText(x.read().get(questionIndex).getAnswers().get(0).toString());
                rdbtnB.setText(x.read().get(questionIndex).getAnswers().get(1).toString());
                rdbtnC.setText(x.read().get(questionIndex).getAnswers().get(2).toString());
                rdbtnD.setText(x.read().get(questionIndex).getAnswers().get(3).toString());
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
                DrawingLogic.closeLabirinthFrame();
                btnNextQuestion.setVisible(false);

            }
        });
        contentPane.add(btnNextQuestion);
        

    }

    public static JLabel getPlayer() {
        return labelPlayer;
    }
}