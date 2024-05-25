import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static Logger logger= LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Hello There!\nWelcome to Best OF US");
        JFrame jFrame = new JFrame("Best OF US v0.01");
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("New Game");
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jPanel.setBounds(0, 0, 800, 600);
        jPanel.setBackground(Color.lightGray);
        jFrame.setBounds(0, 0, 800, 600);
        jFrame.revalidate();
        jFrame.setVisible(true);

        jButton.addActionListener(e -> {
            System.out.println("New Game Pressed!");
            FrontPanel frontPanel = FrontPanel.getInstance(100,100,800,600);
            jFrame.add(frontPanel);
            jFrame.remove(jPanel);
            frontPanel.setVisible(true);
            jFrame.revalidate();
        });
    }
}
