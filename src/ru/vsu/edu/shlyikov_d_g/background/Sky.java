package ru.vsu.edu.shlyikov_d_g.background;

import ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain.Lightning;

import java.awt.*;

public class Sky {
    public void draw(Graphics2D g){
        Color sky = new Color(100, 128,147);

        g.setColor(Lightning.changeColor(sky));
        g.fillRect(0,0,1920,858);
    }
}
