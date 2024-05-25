import javax.swing.*;
import java.awt.*;

public class FrontPanel extends JPanel {
    private static FrontPanel instance = null;

    private FrontPanel(int x, int y, int width, int height) {
        this.setBounds(x,y,width,height);
        Rectangle rectangle = this.getBounds();
        System.out.println("The x cordinate is: "+rectangle.x + "\nThe y cordinate is: " + rectangle.y + "\nThe height is: " + rectangle.height + "\nThe width is: " + rectangle.width);
        this.setVisible(true);
        this.setBackground(Color.CYAN);
        this.revalidate();
    }

    public static FrontPanel getInstance(int x,int y,int width,int height) {
        if (instance == null) instance = new FrontPanel(x,y,width,height);
        return instance;
    }

}
