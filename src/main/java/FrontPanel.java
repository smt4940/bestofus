import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;

public class FrontPanel extends JPanel {
    private static FrontPanel instance = null;
    private static Logger logger= LogManager.getLogger(FrontPanel.class);

    private FrontPanel(int x, int y, int width, int height) {
        this.setBounds(x,y,width,height);
        Rectangle rectangle = this.getBounds();
        logger.info("The x coordinate is: "+rectangle.x + "\nThe y coordinate is: " + rectangle.y + "\nThe height is: " + rectangle.height + "\nThe width is: " + rectangle.width);
        this.setVisible(true);
        this.setBackground(Color.CYAN);
        this.revalidate();
    }

    public static FrontPanel getInstance(int x,int y,int width,int height) {
        if (instance == null){
            instance = new FrontPanel(x,y,width,height);
            logger.info("A new instance of FrontPanel has been created!");
        }else{
            logger.info("An instance of FrontPanel already exists, so we use that");
        }
        return instance;
    }

}
