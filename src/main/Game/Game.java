package Game;

import javax.swing.*;

public class Game extends JFrame implements Runnable {
    // Instance Variables
    private GameScreen gameScreen;

    // Threading
    private Thread gameThread;
    private final double FPS_SET = 120.0;
    private final double UPS_SET = 60.0;

    public Game(){
        setSize(480,320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Setup Screen
        gameScreen = new GameScreen();
        add(gameScreen);
        setVisible(true);
    }

    private void updateGame() {
        // Nothing for now
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    private void start() {
        gameThread = new Thread(this);
        gameThread.start();
    }


    @Override
    public void run() {
        long lastFrame  = System.nanoTime();
        long lastUpdate = System.nanoTime();
        long lastTimeCheck = System.currentTimeMillis();
        double timePerFrame = 1000000000.0 /FPS_SET;
        double timePerUpdate = 1000000000.0 / UPS_SET;
        int frames = 0;
        int updates = 0;

        while (true){
            // Render
            if (System.nanoTime() - lastFrame >= timePerFrame) {
                repaint();
                lastFrame = System.nanoTime();
                frames++;
            }
            // Update
            if (System.nanoTime() - lastUpdate >= timePerUpdate){
                updateGame();
                lastUpdate = System.nanoTime();
                updates++;
            }
            // Frames and Update updates
            if (System.currentTimeMillis() - lastTimeCheck >= 1000){
                System.out.println("FPS: " + frames + " | UPS: " + updates);
                frames = 0;
                updates = 0;
                lastTimeCheck = System.currentTimeMillis();
            }
        }
    }
}
