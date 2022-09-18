package ru.vsu.edu.shlyikov_d_g.foreground.animated_content;

import ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain.Lightning;

import java.awt.*;

public class RedScarf {

    private final Color redScarf = new Color(149, 36, 36);
    private int mult = 0;;

    private Polygon drawRedScarf(int startX, int startY,
                                        double multiplyX)
    {
        return drawRedScarf(startX,startY,multiplyX,1);
    }

    private Polygon drawRedScarf(int startX, int startY)
    {
        return drawRedScarf(startX,startY,1,1);
    }

    private Polygon drawRedScarf(int startX, int startY,
                                        double multiplyX, double multiplyY){
        int[] xRedScarf1 = {startX, (int) (startX+4*multiplyX),
                (int) (startX+8*multiplyX), (int) (startX+16*multiplyX),
                (int) (startX+22*multiplyX), (int) (startX+19*multiplyX),
                (int) (startX+18*multiplyX), (int) (startX+19*multiplyX),
                (int) (startX+14*multiplyX), (int) (startX+10*multiplyX),
                (int) (startX+2*multiplyX), (int) (startX-2*multiplyX),
                (int) (startX-5*multiplyX), (int) (startX-9*multiplyX),
                (int) (startX-9*multiplyX)};
        int[] yRedScarf1 = {startY, startY,
                (int) (startY-3*multiplyY), (int) (startY-4*multiplyY),
                (int) (startY-9*multiplyY), (int) (startY-20*multiplyY),
                (int) (startY-35*multiplyY), (int) (startY-51*multiplyY),
                (int) (startY-52*multiplyY), (int) (startY-53*multiplyY),
                (int) (startY-45*multiplyY), (int) (startY-47*multiplyY),
                (int) (startY-47*multiplyY), (int) (startY-41*multiplyY),
                (int) (startY-20*multiplyY)};

        return new Polygon(xRedScarf1, yRedScarf1, xRedScarf1.length);
    }

    private Polygon drawAnimation(int size, int startX,
                                  int startY, int h,
                                  double amp, double amp2, int deg){
        int[] x = new int[size*2+1];
        int[] y = new int[size*2+1];
        for (int i = 0; i < size; i++) {
            x[i]= startX - i;
            y[i]= (int) (startY + (int)(amp*Math.sin((i+mult/2)*0.1)) + i/amp2);
            x[size*2-i]= startX - i - deg;
            y[size*2-i]= (int) (startY - h + (int)(amp*Math.sin((i+mult/2)*0.1)) + i/amp2);
        }
        x[size] = startX - size - 1;
        y[size] = (int) (startY - h + (int)(amp*Math.sin((size+mult/2)*0.1)) + size/amp2);
        return new Polygon(x, y, size*2+1);
    }


    public void draw(Graphics2D g){
        Polygon p1 = drawRedScarf(1721,510);
        Polygon p2 = drawRedScarf(1769,490);
        Polygon p3 = drawRedScarf(1797,469);
        Polygon p4 = drawRedScarf(1800,495,1.3,2.77);

        if (Lightning.light) {
            g.setColor(redScarf.darker().darker());
        }
        else{
            g.setColor(redScarf);
        }

        g.fillPolygon(p1);
        g.rotate(0.2, 1766, 490);
        g.fillPolygon(p2);
        g.rotate(0.7, 1797, 469);
        g.fillPolygon(p3);
        g.rotate(-0.2, 1766, 490);
        g.rotate(-0.7, 1797, 469);
        g.rotate(2.52, 1800, 495);
        g.fillPolygon(p4);
        g.rotate(-2.52, 1800, 495);

        g.fillPolygon(drawAnimation(110, 1715,
                505, 35, 3,1.3,0)); // сам шарф
        g.fillPolygon(drawAnimation(10, 1607,
                557, 2, 3,1.3,0));
        g.fillPolygon(drawAnimation(10, 1607,
                560, 2, 3,1.3,0));
        g.fillPolygon(drawAnimation(10, 1607,
                563, 2, 3,1.3,0));
        g.fillPolygon(drawAnimation(10, 1607,
                566, 2, 3,1.3,0));
        g.fillPolygon(drawAnimation(10, 1607,
                569, 2, 3,1.3,0));
        g.fillPolygon(drawAnimation(10, 1607,
                572, 2, 3,1.3,0));
        g.fillPolygon(drawAnimation(10, 1607,
                575, 2, 3,1.3,0));
        g.fillPolygon(drawAnimation(10, 1607,
                578, 2, 3,1.3,0));
        g.fillPolygon(drawAnimation(10, 1607,
                581, 2, 3,1.3,0));
        g.fillPolygon(drawAnimation(10, 1607,
                584, 2, 3,1.3,0));

        g.fillPolygon(drawAnimation(30, 1807,
                665, 35,5,1.62,14)); // сам шарф

        if (mult >= -7200) {
            mult--;
        }
        else{
            mult = 0;
        }
    }

}
