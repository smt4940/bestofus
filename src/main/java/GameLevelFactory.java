import javax.swing.*;

public interface GameLevelFactory {
    JPanel showPanel();

    JPanel getLevel(int level);
}
