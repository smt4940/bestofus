import javax.swing.*;

public class GamePane {
    private static int level;
    private GameLevelFactory levelFactory;
    private JPanel levelPanel;
    private static final GamePane instance = new GamePane(level);

    private GamePane(int l) {
        this.level = l;
        this.levelPanel = this.levelFactory.getLevel(level);

    }

    public static GamePane getInstance(int i) {
        if(instance == null)return new GamePane(i);
        return instance;
    }
}
