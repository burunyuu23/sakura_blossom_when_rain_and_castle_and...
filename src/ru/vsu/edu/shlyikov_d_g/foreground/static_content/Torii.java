package ru.vsu.edu.shlyikov_d_g.foreground.static_content;

import ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain.Lightning;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Torii {

    private void torii(Graphics2D g, int x1, int y1,
                       int x2, int y2, int h){
        Color torii = new Color(149,36,36);

        g.setColor(Lightning.changeColor(torii));
        g.fillRect(x1,y1-h,15,h);
        g.fillRect(x2,y2-h,15,h);

        g.fillPolygon(new int[]{x1-Math.abs(x2-x1)/2, x1-Math.abs(x2-x1)/2,
                        (int) (x2+Math.abs(x2-x1)/1.35), (int) (x2+Math.abs(x2-x1)/1.35)},
                new int[]{(int) (y1-Math.abs(y2-y1)-h/15.5), (int) (y1-Math.abs(y1-y2)-h/6.3),
                        (int) (y2-Math.abs(y2-y1)-h/1.75), (int) (y2-Math.abs(y1-y2)-h/2.4)},4);


        g.fillPolygon(new int[]{x1-Math.abs(x2-x1)/2, x1-Math.abs(x2-x1)/2,
                        (int) (x2+Math.abs(x2-x1)/1.35), (int) (x2+Math.abs(x2-x1)/1.35)},
                new int[]{(int) (y1-Math.abs(y2-y1)-h/3.7), (int) (y1-Math.abs(y1-y2)-h/2.2),
                        (int) (y2-Math.abs(y2-y1)-h/1.1), (int) (y2-Math.abs(y1-y2)-h/1.4)},4);

        g.setColor(Color.BLACK);
        g.fillPolygon(new int[]{x1-Math.abs(x2-x1)/2, x1-Math.abs(x2-x1)/2,
                        (int) (x2+Math.abs(x2-x1)/1.35), (int) (x2+Math.abs(x2-x1)/1.35)},
                new int[]{(int) (y1-Math.abs(y2-y1)-h/2.2), (int) (y1-Math.abs(y1-y2)-h/1.8),
                        (int) (y2-Math.abs(y2-y1)-h/1.1), (int) (y2-Math.abs(y1-y2)-h/1.2)},4);

        g.fillPolygon(new int[]{(int) (x1+Math.abs(x2-x1)/1.7), (int) (x1+Math.abs(x2-x1)/1.7),
                        (int) (x2-Math.abs(x2-x1)/7.5), (int) (x2-Math.abs(x2-x1)/7.5)},
                new int[]{(int) (y1-Math.abs(y2-y1)-h/1.45), (int) (y1-Math.abs(y1-y2)-h/2.15),
                        (int) (y2-Math.abs(y2-y1)-h/5.05), (int) (y2-Math.abs(y1-y2)-h/2.45)},4);
    }

//
//        private void torii(Graphics2D g, int x1, int y1,
//                       int x2, int y2, int h) {
//            Color torii = new Color(149, 36, 36);
//            g.setColor(torii);
//
//        }

    public void draw(Graphics2D g){
        torii(g, -18,819,30,748,185);
        torii(g, 58,813,100,748,180);
        torii(g, 128,812,170,743,175);
        torii(g, 188,807,230,743,170);
        torii(g, 270,805,307,743,165);
        torii(g, 353,803,390,745,160);
        torii(g, 435,798,465,744,155);
        torii(g, 520,802,550,748,150); // diff x=30 ; diff y=-54
    }
}
