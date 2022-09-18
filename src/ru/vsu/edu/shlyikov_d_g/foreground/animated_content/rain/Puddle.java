package ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain;

import java.awt.*;

public class Puddle {
    private final int x;
    private final int y;
    private final int w;
    private final int h;
    Color puddle = new Color(75,182,184);

    public Puddle(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public void draw(Graphics2D g){
        if (Lightning.light) {
            g.setColor(puddle.darker().darker());
        }
        else{
            g.setColor(puddle);
        }
        g.fillOval(x,y,w,h);
    }
}
