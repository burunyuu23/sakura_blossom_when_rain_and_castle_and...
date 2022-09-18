package ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Rain {
    List<Puddle> p = new ArrayList<>();
    List<Gurgle> listGurgle = new ArrayList<>();

    {
        p.add(new Puddle(579,764,88,22));
        p.add(new Puddle(683,766,136,34));
        p.add(new Puddle(282,756,64,16));
    }

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
        for (Puddle pi:p) {
            pi.draw(g);
        }
        rain(g, rains);
    }
}
