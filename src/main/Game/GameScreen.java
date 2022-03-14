package Game;
import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel {
    private Dimension size;
    private Game game;

    public GameScreen(Game game){
        setPanelSize();
        this.game = game;
    }

    private void setPanelSize() {
        this.size = new Dimension(480,320);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        game.getRender().render(g);
    }
}
