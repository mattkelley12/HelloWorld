package Sprites;

import java.awt.image.BufferedImage;

public class Sprite {
    private String name;
    private int width;
    private int height;
    private boolean canMove;
    private BufferedImage img;

    public Sprite(String name, int width, int height, boolean canMove, BufferedImage img) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.canMove = canMove;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isCanMove() {
        return canMove;
    }
    public BufferedImage getImg(){
        return img;
    }
}
