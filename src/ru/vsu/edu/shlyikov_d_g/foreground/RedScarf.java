package ru.vsu.edu.shlyikov_d_g.foreground;

import java.awt.*;

public class RedScarf {

    private final Color redScarf = new Color(149, 36, 36);

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

    public void drawRedScarfBack(Graphics2D g){
        g.setColor(redScarf);

        g.setStroke(new BasicStroke(1));
        g.drawLine(1785,645, 1762, 654);
        g.drawLine(1785,648, 1762, 656);
        g.drawLine(1785,650, 1762, 658);
        g.drawLine(1785,652, 1762, 659);
        g.drawLine(1785,654, 1762, 662);
        g.drawLine(1785,656, 1762, 664);
        g.drawLine(1785,658, 1765, 667);
        g.drawLine(1785,660, 1765, 668);
        g.drawLine(1785,662, 1765, 670);
        g.drawLine(1785,664, 1765, 672);
        g.drawLine(1785,666, 1768, 675);
        g.drawLine(1785,668, 1768, 676);
        g.drawLine(1785,670, 1768, 688);
        g.drawLine(1785,672, 1770, 680);
        g.drawLine(1785,674, 1770, 682);
        g.drawLine(1785,675, 1770, 685);
        g.drawLine(1785,677, 1770, 686);
        g.drawLine(1785,679, 1770, 688);


        g.setStroke(new BasicStroke(1));
        g.fillPolygon(drawRedScarfBack(1830, 600));
    }

    private Polygon drawRedScarfBack(int startX, int startY){
        int[] xRedScarf1 = {startX, startX+11, startX-31, startX-38,
                startX-47, startX-54, startX-57, startX-63, startX-56,
                startX-46};
        int[] yRedScarf1 = {startY, startY+21, startY+69, startY+77,
                startY+86, startY+80, startY+70, startY+48, startY+42,
                startY+36};

        return new Polygon(xRedScarf1, yRedScarf1, xRedScarf1.length);
    }


    public void draw(Graphics2D g){
        Polygon p1 = drawRedScarf(1721,510);
        Polygon p2 = drawRedScarf(1769,490);
        Polygon p3 = drawRedScarf(1797,469);
        Polygon p4 = drawRedScarf(1800,495,1.3,2.77);

        g.setColor(redScarf);

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
    }

}
