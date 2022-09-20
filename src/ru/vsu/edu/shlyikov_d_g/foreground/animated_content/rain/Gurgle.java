package ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain;

import java.awt.*;

public class Gurgle {
    private int x;
    private int y;
    private int h = 0;
    private int w = 28;
    int red = 103; // -28
    int blue = 210; // -28
    int green = 212; // -28

    public Gurgle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(){
        h++;
        w-=2;
        red--;
        blue--;
        green--;
    }

    public int getW(){
        return w;
    }

    public void draw(Graphics2D g){
        Color gurgleC = new Color(red,blue,green);

        g.setColor(Lightning.changeColor(gurgleC));
        g.drawLine(x, y, x, y-h);
        g.drawOval(x-(36-w)/2,y, 36-w,4);
        move();
    }
}
