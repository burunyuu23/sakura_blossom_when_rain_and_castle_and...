package ru.vsu.edu.shlyikov_d_g;

import java.awt.*;
import java.util.Random;

public class SakuraLeaf {

    private Polygon drawLeaf(int startX, int startY){
        int[] xSakuraLeaf = {startX, startX+4,
                startX+32, startX+34, startX+39,
                startX+41, startX+39, startX+36, startX+12,
                startX-12, startX-13, startX};
        int[] ySakuraLeaf = {startY, startY+13,
                startY+13, startY+11, startY-9, startY-18,
                startY-27, startY-30, startY-31, startY-28,
                startY-18, startY-15};

        return new Polygon(xSakuraLeaf, ySakuraLeaf, xSakuraLeaf.length);

    }

    public void drawLeafs(Graphics2D g){
        Color sakuraLeafColor = new Color(241, 91, 243);

        g.setColor(sakuraLeafColor);

        int rnd = (int) (Math.random() * 33 + 5);

        for (int x = 312; x <= 1930; x += rnd) {
            if (x < 650) { // 0-376
                for (int y = -10; y < 376 - (650 - x); y += rnd) {
                    rnd = (int) (Math.random() * 33 + 5);
                    g.rotate(2.5 + rnd/20, x, y);
                    g.fillPolygon(drawLeaf(x, y));
                    g.rotate(-2.5 - rnd/20, x, y);
                }
            }
            else if (x < 782){ // 376-244
                for (int y = -10; y < 376 - (x - 650); y += rnd) {
                    rnd = (int) (Math.random() * 33 + 5);
                    g.rotate(2.5 + rnd/20, x, y);
                    g.fillPolygon(drawLeaf(x, y));
                    g.rotate(-2.5 - rnd/20, x, y);
                }
            }
            else if (x < 921){ // 244-383
                for (int y = -10; y < 244 - (782 - x); y += rnd) {
                    rnd = (int) (Math.random() * 33 + 5);
                    g.rotate(2.5 + rnd/20, x, y);
                    g.fillPolygon(drawLeaf(x, y));
                    g.rotate(-2.5 - rnd/20, x, y);
                }
            }
            else if (x < 1138){ //383-254
                for (int y = -10; y < 363 - ((x - 921) / 2); y += rnd) {
                    rnd = (int) (Math.random() * 33 + 5);
                    g.rotate(2.5 + rnd/20, x, y);
                    g.fillPolygon(drawLeaf(x, y));
                    g.rotate(-2.5 - rnd/20, x, y);
                }
            }
            else if (x < 1434){ //222-499
                for (int y = -10; y < 222 - ((1138 - x) / 1.1); y += rnd) {
                    rnd = (int) (Math.random() * 33 + 5);
                    g.rotate(2.5 + rnd/20, x, y);
                    g.fillPolygon(drawLeaf(x, y));
                    g.rotate(-2.5 - rnd/20, x, y);
                }
            }
            else if (x < 1746){ //499-222
                for (int y = -10; y < 499 - ((x - 1434) / 1.1); y += rnd) {
                    rnd = (int) (Math.random() * 33 + 5);
                    g.rotate(2.5 + rnd/20, x, y);
                    g.fillPolygon(drawLeaf(x, y));
                    g.rotate(-2.5 - rnd/20, x, y);
                }
            }
            else if (x < 1930){ //222-352
                for (int y = -10; y < 222 - ((1746 - x) / 1.2); y += rnd) {
                    rnd = (int) (Math.random() * 33 + 5);
                    g.rotate(2.5 + rnd/20, x, y);
                    g.fillPolygon(drawLeaf(x, y));
                    g.rotate(-2.5 - rnd/20, x, y);
                }
            }
        }
    }
}
