package DAO;

import Sprites.Sprite;

import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class SpriteDAO {

    // Get tileSet
    public HashMap<String, Sprite> getTileSet(){
        // Get img
        String spriteMaster = "/Sprites/tilesets.png";
        String spriteCSV = "/Sprites/tileSetData.csv";
        BufferedImage img = importImg(spriteMaster);
        // Return Value
        HashMap<String,Sprite> sprites = new HashMap<>();
        // Get CSV Data
        List<List<String>> spriteStringArray = new csvDAO(spriteCSV).readFile();

        // Parse tileSet
        for (List<String> spriteData:
        spriteStringArray){
            String name = spriteData.get(0);
            int x = Integer.parseInt(spriteData.get(1));
            int y = Integer.parseInt(spriteData.get(2));
            int width = Integer.parseInt(spriteData.get(3));
            int height = Integer.parseInt(spriteData.get(4));
            BufferedImage currentImg = reScaleImage(img.getSubimage(x,y,width,height));
            boolean canMove = Boolean.parseBoolean(spriteData.get(5));
            Sprite currentSprite = new Sprite(name,width,height,canMove,currentImg);
            sprites.put(name,currentSprite);
        }
        return sprites;
    }

    // Read Sprites from CSV
    private BufferedImage importImg(String fileName) {
        InputStream is = getClass().getResourceAsStream(fileName);
        BufferedImage img = null;
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    // Rescales image x2
    private BufferedImage reScaleImage(BufferedImage before){
        int w = before.getWidth();
        int h = before.getHeight();
        BufferedImage after = new BufferedImage(w*2, h*2, BufferedImage.TYPE_INT_ARGB);
        AffineTransform at = new AffineTransform();
        at.scale(2.0, 2.0);
        AffineTransformOp scaleOp =
                new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
        after = scaleOp.filter(before, after);
        return after;
    }



}
