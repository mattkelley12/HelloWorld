package Game;

import DAO.SpriteDAO;
import Sprites.Sprite;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class Game extends JFrame {

    private GameScreen gameScreen;
    private BufferedImage img;

    public Game(){
        setSize(480,320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gameScreen = new GameScreen(img);
        add(gameScreen);
        setVisible(true);

    }


}
