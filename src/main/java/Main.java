import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello There!");
        JFrame jFrame = new JFrame("Welcome to Best OF US");
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("New Game");
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jPanel.setBounds(0,0,800,600);
        jPanel.setBackground(Color.lightGray);
        jFrame.setBounds(0,0,800,600);
        jFrame.revalidate();
        jFrame.setVisible(true);
        var interim = 1l;
        System.out.println(interim);
        jButton.addActionListener(e->{
            System.out.println("New Game Pressed!");
            FrontPanel frontPanel = FrontPanel.getInstance(GamePanel.GameLevel);
        });
    }
}
