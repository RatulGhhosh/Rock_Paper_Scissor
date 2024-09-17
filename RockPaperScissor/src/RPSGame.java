import javax.swing.*;
import java.awt.*;

public class RPSGame extends JFrame {

    String[] choice = {"Rock", "Paper", "Scissor"};
    JButton RockBtn, PaperBtn, ScissorBtn;
    JTextArea outputField, compOut;

    RPSGame() {
        super("Rock - Paper - Scissor");
        // 0-Rock //1-Paper //2-Scissor

        RockBtn = new JButton("Rock");
        RockBtn.setBounds(60, 80, 80, 36);
        RockBtn.setFont(new Font("Kodchasan", Font.BOLD, 18));
        RockBtn.addActionListener(e -> output1());
        add(RockBtn);

        ImageIcon rockIcon = new ImageIcon(ClassLoader.getSystemResource("images/rock_b.png"));
        Image rockIconImage = rockIcon.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        ImageIcon rockIconL = new ImageIcon(rockIconImage);
        JLabel rockIconLable = new JLabel(rockIconL);
        rockIconLable.setBounds(70, 12, 60, 60);
        add(rockIconLable);

        PaperBtn = new JButton("Paper");
        PaperBtn.setBounds(180, 80, 80, 36);
        PaperBtn.setFont(new Font("Kodchasan", Font.BOLD, 18));
        PaperBtn.addActionListener(e -> output2());
        add(PaperBtn);

        ImageIcon PaperIcon = new ImageIcon(ClassLoader.getSystemResource("images/paper_b.png"));
        Image PaperIconImage = PaperIcon.getImage().getScaledInstance(38, 38, Image.SCALE_DEFAULT);
        ImageIcon PaperIconL = new ImageIcon(PaperIconImage);
        JLabel PaperIconLable = new JLabel(PaperIconL);
        PaperIconLable.setBounds(196, 16, 50, 50);
        add(PaperIconLable);

        ScissorBtn = new JButton("Scissor");
        ScissorBtn.setBounds(290, 80, 100, 36);
        ScissorBtn.setFont(new Font("Kodchasan", Font.BOLD, 18));
        ScissorBtn.addActionListener(e -> output3());
        add(ScissorBtn);

        ImageIcon scissorIcon = new ImageIcon(ClassLoader.getSystemResource("images/scissor_b.png"));
        Image scissorIconImage = scissorIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon scissorIconL = new ImageIcon(scissorIconImage);
        JLabel scissorIconLable = new JLabel(scissorIconL);
        scissorIconLable.setBounds(310, 10, 60, 60);
        add(scissorIconLable);

        outputField = new JTextArea();
        outputField.setBounds(0, 200, 450, 60);
        outputField.setFont(new Font("Kodchasan", Font.BOLD, 30));
        outputField.setEditable(false);
        add(outputField);

        compOut = new JTextArea();
        compOut.setBounds(0, 280, 450, 40);
        compOut.setFont(new Font("Kodchasan", Font.BOLD, 24));
        compOut.setEditable(false);
        add(compOut);

        setLayout( null);
        setResizable(false);
        setSize(450,400);
        getContentPane().setBackground(new Color(98, 188, 248));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void output1() {
        String type = choice[generateRandom()];
        try{
            if (type.equals("Rock")){
                getContentPane().setBackground(new Color(242, 242, 242));
                outputField.setText("                  Its a Draw !!");
                compOut.setText("    Computer Input >> "+type);
            }
            else if (type.equals("Scissor")){
                getContentPane().setBackground(new Color(22, 142, 48));
                outputField.setText("             YAY !!  You Won ");
                compOut.setText("    Computer Input >> "+type);
            }
            else {
                getContentPane().setBackground(new Color(197, 31, 31));
                outputField.setText("            Oops !! You Loose");
                compOut.setText("    Computer Input >> "+type);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void output2() {
        String type = choice[generateRandom()];
        try {
            if (type.equals("Paper")){
                getContentPane().setBackground(new Color(242, 242, 242));
                outputField.setText("                  Its a Draw !!");
                compOut.setText("    Computer Input >> "+type);
            }
            else if (type.equals("Rock")){
                getContentPane().setBackground(new Color(22, 142, 48));
                outputField.setText("             YAY !!  You Won ");
                compOut.setText("    Computer Input >> "+type);
            }
            else {
                getContentPane().setBackground(new Color(197, 31, 31));
                outputField.setText("            Oops !! You Loose");
                compOut.setText("    Computer Input >> "+type);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void output3() {
        String type = choice[generateRandom()];
        try {
            if (type.equals("Scissor")){
                getContentPane().setBackground(new Color(242, 242, 242));
                outputField.setText("                  Its a Draw !!");
                compOut.setText("    Computer Input >> "+type);
            }
            else if (type.equals("Paper")){
                getContentPane().setBackground(new Color(22, 142, 48));
                outputField.setText("             YAY !!  You Won ");
                compOut.setText("    Computer Input >> "+type);
            }
            else {
                getContentPane().setBackground(new Color(197, 31, 31));
                outputField.setText("            Oops !! You Loose");
                compOut.setText("    Computer Input >> "+type);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    private static int generateRandom() {
        return (int) ((Math.random() * (3)) + 0);
    }

    public static void main(String[] args) {
        new RPSGame();
    }
}
