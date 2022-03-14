package Scenes;

import Game.Game;

import java.awt.*;

public class Menu extends GameScene implements SceneMethods {

    public Menu(Game game) {
        super(game);
    }

    @Override
    public void render(Graphics g) {
        for (int i = 0; i < 480; i+=32) {
            for (int j = 0; j < 320; j+=32) {
                g.drawImage(super.getGame().getSprites().get("grass1").getImg(), i, j,null);
            }
        }
    }
}
