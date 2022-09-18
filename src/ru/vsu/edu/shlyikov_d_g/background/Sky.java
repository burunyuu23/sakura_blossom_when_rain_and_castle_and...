package ru.vsu.edu.shlyikov_d_g.background;

import ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain.Lightning;

import java.awt.*;

public class Sky {
    public void draw(Graphics2D g){
        Color sky = new Color(100, 128,147);

        if (Lightning.light) {
            g.setColor(sky.darker().darker());
        }
        else {
            g.setColor(sky);
        }
        g.fillRect(0,0,1920,858);
    }
}
