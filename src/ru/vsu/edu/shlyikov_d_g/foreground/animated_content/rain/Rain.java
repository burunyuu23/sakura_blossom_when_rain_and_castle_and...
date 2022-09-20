package ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Rain {
    List<Gurgle> listGurgle = new ArrayList<>();
    private List<Puddle> p;

    List<Raindrop> rains;
    Color rainC;
    {
        rainC = new Color(75,182,184);
        rains = Raindrop.create(750);
    }

    public Rain(List<Puddle> p) {
        this.p = p;
    }

    private void rain(Graphics2D g, List<Raindrop> rs) {

        g.setColor(Lightning.changeColor(rainC));

        for (Raindrop r : rs) {
            g.drawLine(r.getX(), r.getY(), r.getNewX(), r.getNewY());
            r.move();
            if (r.isEmpty()){
                r.restart();
            }
            for (Puddle pi:p) {
                if (r.isCollide(pi)){
                    if (Math.random()*100 < 9) {
                        listGurgle.add(new Gurgle(r.getX(), r.getY()));
                    }
                }
            }
        }
        for (int i = 0; i < listGurgle.size(); i++) {
            if (listGurgle.get(i).getW() > 0) {
                listGurgle.get(i).draw(g);
            }
            else{
                listGurgle.remove(i);
                i--;
            }
        }
    }

    public void draw (Graphics2D g){
        rain(g, rains);
    }
}
