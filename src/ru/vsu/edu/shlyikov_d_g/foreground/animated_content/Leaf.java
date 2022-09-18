package ru.vsu.edu.shlyikov_d_g.foreground.animated_content;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Leaf {
    private Polygon leaf;
    private final int startX;
    private final int startY;
    private final double theta;

    public Leaf(int startX, int startY, double theta){
        this.startX = startX;
        this.startY = startY;
        this.theta = theta;

        int[] xSakuraLeaf = {startX, startX+4,
                startX+32, startX+34, startX+39,
                startX+41, startX+39, startX+36, startX+12,
                startX-12, startX-13, startX};
        int[] ySakuraLeaf = {startY, startY+13,
                startY+13, startY+11, startY-9, startY-18,
                startY-27, startY-30, startY-31, startY-28,
                startY-18, startY-15};

        leaf = new Polygon(xSakuraLeaf, ySakuraLeaf, xSakuraLeaf.length);
    }

    public Polygon getLeaf(){
        return leaf;
    }

    public double getTheta(){
        return theta;
    }

    public int getX(){
        return startX;
    }

    public int getY(){
        return startY;
    }
}
