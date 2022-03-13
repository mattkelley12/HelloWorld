package Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Game extends JFrame {

    private GameScreen gameScreen;
    private BufferedImage img;


    public Game(){
        importImg("tilesets.png");

        setSize(640,640);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gameScreen = new GameScreen();
        add(gameScreen);

    }

    private void importImg(String fileName) {
        InputStream is = this.getFileAsIOStream(fileName);
        try {
            this.img = ImageIO.read(is);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private InputStream getFileAsIOStream(final String fileName)
    {
        InputStream ioStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (ioStream == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return ioStream;
    }


}
