package ru.vsu.edu.shlyikov_d_g;

import java.awt.*;
import java.awt.geom.Path2D;

public class Ground extends Path2D.Float {

    private Path2D ground(){
        moveTo(0, 633);
        curveTo(223,634,333,608,444,627);
        curveTo(444,627,555,613,777,650);
        curveTo(644,650,888,611,966,622);
        curveTo(1099,602,1212,589,1337,599);
        curveTo(1337,599,1499,621,1666,666);
        curveTo(1666,666,1789,702,1920,618);
        lineTo(1920,858);
        lineTo(0, 858);
        closePath();

        return this;
    }

    private Path2D road(){
        moveTo(0, 752);
        curveTo(0,752,397,703,1200,808);
        lineTo(1386,858);
        lineTo(1000,858);
        curveTo(1000,808,397,763,41,818);
        lineTo(0,858);

        closePath();

        return this;
    }

    public void draw(Graphics2D g){
        Color ground = new Color(77,30,91);
        Color road = new Color(138,138,138);

        g.setColor(ground);
        g.fill(ground());
        reset();

        g.setColor(road);
        g.fill(road());
    }


}
