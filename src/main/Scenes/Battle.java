package Scenes;

import Game.Game;

import java.awt.*;

public class Battle extends GameScene implements SceneMethods {

    public Battle(Game game) {
        super(game);
    }

    @Override
    public void render(Graphics g) {
        for (int i = 0; i < 480; i+=32) {
            for (int j = 0; j < 320; j+=32) {
                g.drawImage(super.getGame().getSprites().get("grass1").getImg(), i, j,null);
            }
        }
        for (int i = 64; i < 480-64; i+=32) {
            for (int j = 0; j < 128; j+=32) {
                g.drawImage(super.getGame().getSprites().get("wildGrass").getImg(), i, j,null);
            }
        }
    }
}
