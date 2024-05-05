import javax.swing.*;

public class FrontPanel<GameLevelFactory> extends JPanel {
    private static Integer level = 0;
    private GameLevelFactory levelFactory;
    private JPanel levelPanel = new JPanel();
    private static final FrontPanel instance = null;

    private FrontPanel(GamePanel gamePanel, int level) {
        this.level = level;
    }

    private FrontPanel(GamePanel gamePanel) {

    }

    public static FrontPanel getInstance(GamePanel gamePanel) {
        if (instance == null)
            return new FrontPanel(gamePanel);
        return instance;
    }
}
