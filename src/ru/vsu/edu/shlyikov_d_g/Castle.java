package ru.vsu.edu.shlyikov_d_g;

import java.awt.*;
import java.awt.geom.Path2D;

public class Castle extends Path2D.Float{

    Color ladderStep1 = new Color(125,127,130);
    Color ladderStep2 = new Color(189,182,182);

    private void ladderStep(Graphics2D g, int x, int y, int width){
        // 710, 448
        g.setColor(ladderStep1);
        g.fillRect(x,y,-width,-3);
        g.fillRect(x,y,width,-3);
        g.setColor(ladderStep2);
        g.fillRect(x,y-3,width,-1);
        g.fillRect(x,y-3,-width,-1);
    }

    private void flag(Graphics2D g, int x, int y, int w, int h, int x2, int y2, int size,
                      Color flagSign, Color flagBackSign) {
        g.setFont(new Font("Algerian", Font.PLAIN, size));

        g.setColor(flagBackSign);
        g.fillOval(x,y,w,h);
        // 562, 387, 35, 35

        g.setColor(flagSign);
        g.drawString("¤",x2, y2);
    }

    private void flag(Graphics2D g, int x, int y, int w, int h, int x2, int y2, int size){
        flag(g, x, y, w, h, x2, y2, size, new Color(173,172,119), new Color(166,93,93));
    }

    private void ladder(Graphics2D g){
        Color wallAroundLadder = new Color(123,126,133);
        Color floorAroundLadder = new Color(106,106,115);
        Color flagAroundLadder = new Color(101,103,121);

        g.setColor(wallAroundLadder);

        g.fillRect(554,468,57,-100);
        g.fillRect(809,468,57,-100);

        g.setColor(floorAroundLadder);

        g.fillRect(611,468,198,-100);

        g.setColor(flagAroundLadder);

        g.fillRect(558,445,45,-80);
        g.fillRect(815,445,45,-80);

        flag(g, 562, 387, 35, 35, 565,420,50);
        g.rotate(Math.PI,854,389);
        flag(g, 851,356,35,35,854,390, 50);
        g.rotate(-Math.PI,854,389);

        for (int i = 0; i < 25; i++) {
            ladderStep(g, 710,468 - i*4, 99-2*i);
        }
    }

    private Path2D roof(int x, int y, int midX, int midY, int h){
        moveTo(x, y);

            curveTo(x, y, x + midX / 1.5, y - midY / 2.5, x + midX, y - midY);

            curveTo(x + midX, y - midY, x + midX * 2 - midX / 1.5, y - midY / 2.5, x + midX * 2, y);
            lineTo(x + midX * 2, y - h);
            curveTo(x + midX * 2, y - h, x + midX * 2 - midX / 1.5, y - midY / 2.5 - h, x + midX, y - midY - h);
            curveTo(x + midX, y - midY - h, x + midX / 1.5, y - midY / 2.5 - h, x, y - h);


        closePath();

        return this;
    }

    private void washi(Graphics2D g, int mI, int mJ,
                       int startX, int startY, int rI, int rJ,
                       int mod, int space){
        Color washi = new Color(156, 146, 133); // washi - бумага в седзи
        g.setColor(washi);
        for (int i = 0; i < rI; i++) {
            for (int j = 0; j < rJ; j++) {
                if (i % mod == 0 && j == 0){
                    startX += space;
                }
                g.fillRect(startX+mI*i,startY-mJ*j,6,-3);
            }
        }
    }

    private void frontHouseWall(Graphics2D g){
        Color mainWall = new Color(131, 123, 119);
        Color framing = new Color(120, 111, 104);
        Color pillar = new Color(167, 152, 137);
        Color roof = new Color(105,107,123);


        g.setColor(mainWall);
        g.fillRect(300, 370, 781,-200);

        g.setColor(framing);
        g.fillRect(384,347,607,-24);
        washi(g,8,5,388,342, 30, 3, 2,3);
        washi(g,8,5,751,342, 25, 3, 2,3);

        g.setColor(framing);
        g.fillRect(384,265,607,-24);
        washi(g,8,5,388,260, 30, 3, 2,3);
        washi(g,8,5,751,260, 25, 3, 2,3);

        g.setColor(framing);
        g.fillRect(384,235,607,-24);
        washi(g,8,5,388,230, 30, 3, 2,3);
        washi(g,8,5,751,230, 25, 3, 2,3);

        g.setColor(framing);
        g.fillRect(682,370,59,-48);
        washi(g,8,5,681,364, 6, 8, 3, 5);

        g.setColor(pillar); // pillars

        g.fillRect(746, 372, 6, -58); // two right pillars
        g.fillRect(760, 372, 6, -50);

        g.fillRect(671, 372, 6, -58); // two left pillars
        g.fillRect(657, 372, 6, -50);

        // roof
        g.setColor(roof);
        g.fillRect(378, 345-24,280,-50);
        g.fillRect(557+154/2, 345-49,154/3,-75);
        g.fillRect(557+5*154/6, 345-49,154/3,-75);
        g.fillRect(557+7*154/6, 345-49,154/3,-75);
        g.fillRect(781, 345-24,300,-50);

        g.setColor(pillar);
        g.fillRect(557+2*154/3, 345-27, (int) (154/1.75),-20);
        g.fillRect(557+8*154/9, 345-37, 154/4,-20);

        g.setColor(roof);
        g.fill(roof(556, 316, 154,80,56));
        reset();
        g.fill(roof(220, 230, 491,60,76));
        reset();

        g.setColor(pillar);
        g.fill(roof(557, 366,154,78,15));
        reset();

        g.setColor(roof);
        g.fill(roof(557, 352,154,78,35));
        reset();

        flag(g, 697,287,28,28,700,314,40,
                pillar, framing);

        // left and right walls around castle
        wall(g, 220,150,161,35);
        wall(g, 992,150,161,35);
    }

    // программирование учит новым словам.
    // если бы я не рисовал замок, я бы никогда не узнал,
    // что существует слово 'балясина' лолл
    private void balusters(Graphics2D g, int x, int y){
        Color fence = new Color(98, 101,106);

        // 823, 467
        g.setColor(fence);
        g.fillRect(x,y,6,-21);
        g.setStroke(new BasicStroke(2));
        g.drawRect(x+6,y-14,72,13);

        g.drawRect(x+6,y-14,15,5);
        g.drawRect(x+6,y-6,6,5);
        g.drawRect(x+15,y-6,6,5);

        g.drawRect(x+25,y-14,34,5);
        g.drawRect(x+25,y-6,9,5);
        g.drawRect(x+37,y-6,9,5);
        g.drawRect(x+49,y-6,9,5);

        // 823, 467
        g.drawRect(x+62,y-14,15,5);
        g.drawRect(x+62,y-6,6,5);
        g.drawRect(x+71,y-6,6,5);

        g.fillRect(x+6,y-9,71,2);
        g.fillRect(x+22,y-15,2,15);
        g.fillRect(x+59,y-15,2,15);

        g.fillRect(x+13,y-7,1,6);
        g.fillRect(x+35,y-7,1,6);
        g.fillRect(x+47,y-7,1,6);
        g.fillRect(x+69,y-7,1,6);
    }

    private void fence(Graphics2D g, int x, int y, int repeats, int multiply){
        for (int i = 0; i < repeats; i++) {
            balusters(g,x+multiply*i, y);
        }
        // diff = 76
    }

    private void wall(Graphics2D g, int x, int y, int w, int h){
        Color wall1 = new Color(105,107,123);
        Color wall2 = new Color(98,101,110);
        Color wall3 = new Color(106,106,115);

        g.setColor(wall1);
        g.fillRect(x, y, w,h);
        g.setColor(wall2);
        g.fillRect(x,y+h-1,w, (int) (h*2.5));
        g.setColor(wall1);
        g.fillRect(x,y+h+h/4+1,w, h/6);
        g.setColor(wall3);
        g.fillRect(x,y+h+h/4+h/6+h*2,w,h*15);
    }

    public void draw(Graphics2D g){
//        wall(g,293,469,450,388);
        frontHouseWall(g);

        fence(g, -56, 360,8,76);
        wall(g,0,360,555,23);

        fence(g, 860, 360,25,76);
        wall(g,860,360,1222,23);

        g.rotate(-0.35,0,658);
        wall(g,0,656,555,19);
        fence(g, -16, 658,8,71);
        g.rotate(0.35,0,658);

        wall(g,877,460,1222,20);
        fence(g, 877, 460,25,76);

        ladder(g);

        wall(g,519,467,380,20);
        fence(g, 519, 467,2,76);
        fence(g, 747, 467,2,76);

        for (int i = 0; i < 45; i++) {
            ladderStep(g, 709, 472 + i*4, 38+i);
        }

        Color fence = new Color(98, 101,106);
        g.setColor(fence);
        g.fillPolygon(new int[]{676, 671, 607, 627, 676},
                new int[]{446, 446, 634, 634, 468}, 5);
        g.fillPolygon(new int[]{747, 752, 806, 786, 747},
                new int[]{446, 446, 634, 634, 468}, 5);
    }
}
