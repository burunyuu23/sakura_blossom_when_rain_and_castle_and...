package ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain;

import java.awt.*;
import java.awt.geom.Path2D;

public class Lightning extends Path2D.Float {
    Color lightning = new Color(252,255,0);
    int counter = 0;
    int maxCounter = (int) (Math.random()*85+200);
    Path2D mainPath = null;

    public static boolean light = false;

    private int side(){
        if (Math.random()*100 > 49){
            return -1;
        }
        return 1;
    }

    private Path2D light(){
        int x = (int) (Math.random()*130 + 40);
        int y = 0;

        moveTo(x, y);

        x += side() * Math.random()*20;
        y += Math.random()*35 + 10;
        lineTo(x, y);

        x += side() * Math.random()*20;
        y += Math.random()*35 + 10;
        lineTo(x, y);

        lineTo(x + side() * Math.random()*60 + 20, y + Math.random()*25 + 10);
        lineTo(x, y);

        x += side() * Math.random()*20;
        y += Math.random()*35 + 10;
        lineTo(x, y);

        lineTo(x + side() * Math.random()*30, y + Math.random()*35 + 15);

        x += side() * Math.random()*20;
        y += Math.random()*35 + 10;
        lineTo(x, y);

        x += side() * Math.random()*40;
        y += Math.random()*45 + 10;
        lineTo(x, y);

        x += side() * Math.random()*20;
        y += Math.random()*35 + 10;
        lineTo(x, y);

        lineTo(x + side() * Math.random()*30, y + Math.random()*35 + 15);

        x += side() * Math.random()*20;
        y += Math.random()*35 + 10;
        lineTo(x, y);

        x += side() * Math.random()*20;
        y += Math.random()*35 + 10;
        lineTo(x, y);

        x += side() * Math.random()*50;
        y += Math.random()*25 + 10;
        lineTo(x, y);

        return this;
    }

    public void draw(Graphics2D g){
        counter++;
        if (counter > maxCounter){
            counter = 0;
            maxCounter = (int) (Math.random()*85+200);
            mainPath = light();
            light = true;
        }
        else {
            if (counter > maxCounter / 12) {
                reset();
                light = false;
            } else if (mainPath != null){
                g.setStroke(new BasicStroke(3));
                g.setColor(lightning);
                g.draw(mainPath);
                g.setStroke(new BasicStroke(1));
            }
        }
    }
}
