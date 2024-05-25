import javax.swing.*;

public class FrontPanel extends JPanel {
    private static FrontPanel instance = null;

    private FrontPanel() {

    }

    public static FrontPanel getInstance() {
        if (instance == null) instance = new FrontPanel();
        return instance;
    }

}
