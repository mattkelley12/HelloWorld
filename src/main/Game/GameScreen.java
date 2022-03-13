package Game;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel {

    public GameScreen(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(50,50,100,100);
    }

    public static void main(String[] args) {
        Game game = new Game();

    }

}
