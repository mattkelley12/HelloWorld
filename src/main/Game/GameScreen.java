package Game;

import DAO.SpriteDAO;
import Sprites.Sprite;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class GameScreen extends JPanel {
    private BufferedImage img;
    private HashMap<String, Sprite> sprites;

    public GameScreen(BufferedImage img){
        this.img = img;
        this.sprites = new SpriteDAO().getTileSet();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (int i = 0; i < 480; i+=32) {
            for (int j = 0; j < 320; j+=32) {
                g.drawImage(sprites.get("grass1").getImg(), i, j,null);
            }
        }
        for (int i = 64; i < 480-64; i+=32) {
            for (int j = 0; j < 64; j+=32) {
                g.drawImage(sprites.get("wildGrass").getImg(), i, j,null);
            }
        }
       callFPS();
    }

    private void callFPS() {



    }
}
