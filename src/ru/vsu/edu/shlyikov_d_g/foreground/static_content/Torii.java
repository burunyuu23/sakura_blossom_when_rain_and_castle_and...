package ru.vsu.edu.shlyikov_d_g.foreground.static_content;

import ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain.Lightning;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Torii {
    Color torii = new Color(149,36,36);

    private void torii(Graphics2D g, int x1, int y1,
                       int x2, int y2, int h, Color torii){

        g.setColor(Lightning.changeColor(torii));
        g.fillPolygon(new int[]{x1, x1+15, x1+15, x1},
                new int[]{y1-h,y1-h,y1-h/10, y1},4);
        g.fillPolygon(new int[]{x2, x2+15, x2+15, x2},
                new int[]{y2-h,y2-h,y2-h/10, y2},4);

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

        g.fillPolygon(new int[]{(int) (x1+Math.abs(x2-x1)/2.1), (int) (x1+Math.abs(x2-x1)/2.1),
                        (int) (x2-Math.abs(x2-x1)/7.5), (int) (x2-Math.abs(x2-x1)/7.5)},
                new int[]{(int) (y1-Math.abs(y2-y1)-h/1.6), (int) (y1-Math.abs(y1-y2)-h/1.9),
                        (int) (y2-Math.abs(y2-y1)-h/4.25), (int) (y2-Math.abs(y1-y2)-h/2.95)},4);
    }

//
//        private void torii(Graphics2D g, int x1, int y1,
//                       int x2, int y2, int h) {
//            Color torii = new Color(149, 36, 36);
//            g.setColor(torii);
//
//        }

    private void torii3D(Graphics2D g, int x1,int y1,int x2,int y2,int h){
        Color c = torii.darker();
        for (int i = 0; i < 7; i++) {
            if (i == 6) c = torii;
            torii(g, x1-6+2*i-10,y1+10,x2-6+2*i+15,y2,h, c);
        }
    }

    public void draw(Graphics2D g){
        torii3D(g, -18,809,30,733,185);
        torii3D(g, 68,808,110,738,180);
        torii3D(g, 148,802,190,738,175);
        torii3D(g, 218,802,260,738,170);

        torii3D(g, 360,805,397,743,165);
        torii3D(g, 423,803,460,745,160);
        torii3D(g, 500,798,530,744,155);
        torii3D(g, 580,802,610,748,150); // diff x=30 ; diff y=-54
    }
}
