import javax.swing.*;

public class GameLevel extends JPanel {
    private static int level;
    private GameLevelFactory levelFactory;
    private JPanel levelPanel = new JPanel();
    private static final GameLevel instance = new GameLevel(level);

    private GameLevel(int l) {
        this.level = l;
        this.levelFactory.getLevel(l);
    }

    public static GameLevel getInstance(int i) {
        if(instance == null)return new GameLevel(i);
        return instance;
    }
}
