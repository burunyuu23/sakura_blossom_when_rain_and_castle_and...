package ru.vsu.edu.shlyikov_d_g.background;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Rain {

    List<Raindrop> rains;
    Color rainC;
    {
        rainC = new Color(75,182,184);
        rains = Raindrop.create(750);
    }

    private void rain(Graphics2D g, List<Raindrop> rs) {
        g.setColor(rainC);
        for (Raindrop r : rs) {
            g.drawLine(r.getX(), r.getY(), r.getNewX(), r.getNewY());
            r.move();
            if (r.isEmpty()){
                r.restart();
            }
        }
    }

    public void draw (Graphics2D g){
        rain(g, rains);
    }
}
