package Game;

import DAO.SpriteDAO;
import Sprites.Sprite;

import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class Game extends JFrame {

    private GameScreen gameScreen;
    private BufferedImage img;
    private double timePerFrame;
    private double timePerUpdate;
    private long lastUpdate;
    private long lastFrame;
    private int frames;
    private long lastTime;

    private int updates;
    private long lastTimeUPS;

    public Game(){
        setSize(480,320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // FrameRate 60 FPS
        this.timePerFrame = 1000000000.0 /120.0;
        this.timePerUpdate = 1000000000.0 / 60.0;

        // Setup Screen
        gameScreen = new GameScreen(img);
        add(gameScreen);
        setVisible(true);

    }


    // Render Loop
    private void loopGame(){
        while(true) {

            if (System.nanoTime() - lastUpdate >= timePerUpdate){
                updateGame();
                callUPS();
            }

            if (System.nanoTime() - lastFrame >= timePerFrame) {
                lastFrame = System.nanoTime();
                repaint();
                callFPS();
            } else {
                // Nothing for now
            }
        }
    }

    private void callUPS() {
        if (System.currentTimeMillis() - lastTimeUPS >= 1000){
            System.out.println("UPS is " + updates);
            updates = 0;
            lastTimeUPS = System.currentTimeMillis();
        }
    }

    private void callFPS() {
        frames++;
        if (System.currentTimeMillis() - lastTime >= 1000){
            System.out.println("FPS is " + frames);
            frames = 0;
            lastTime = System.currentTimeMillis();
        }
    }

    private void updateGame() {
        updates++;
        lastUpdate = System.nanoTime();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.loopGame();
    }


}
