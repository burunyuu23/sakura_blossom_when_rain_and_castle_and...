package ru.vsu.edu.shlyikov_d_g.background;

import java.awt.*;

public class Sky {
    public void draw(Graphics2D g){
        Color sky = new Color(100, 128,147);

        g.setColor(sky);
        g.fillRect(0,0,1920,858);
    }
}
