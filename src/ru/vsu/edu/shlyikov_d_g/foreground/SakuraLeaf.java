package ru.vsu.edu.shlyikov_d_g.foreground;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SakuraLeaf {

    List<Leaf> leafs = new ArrayList<>();
    Double rotate = 0.0;
    List<Integer> leafsCount = new ArrayList<>();
    Color sakuraLeafColor = new Color(241, 91, 243);
    boolean start = false;
    double multiply = 0.01;
    int timer;
    boolean timerB = true;

    public void drawLeafs(Graphics2D g){
        int rnd = (int) (Math.random() * 37 + 5);

        for (int x = 312; x <= 1930; x += rnd) {
            if (x < 650) { // 0-376
                for (int y = -10; y < 376 - (650 - x); y += rnd) {
                    rnd = (int) (Math.random() * 37 + 5);
                    Leaf l = new Leaf(x, y, 2.2 + rnd/20);
                    leafs.add(l);
                }
            }
            else if (x < 782){ // 376-244
                leafsCount.add(leafs.size());
                for (int y = -10; y < 376 - (x - 650); y += rnd) {
                    rnd = (int) (Math.random() * 37 + 5);
                    Leaf l = new Leaf(x, y, 2.2 + rnd/20);
                    leafs.add(l);
                }
            }
            else if (x < 921){ // 244-383
                leafsCount.add(leafs.size());
                for (int y = -10; y < 244 - (782 - x); y += rnd) {
                    rnd = (int) (Math.random() * 37 + 5);
                    Leaf l = new Leaf(x, y, 2.2 + rnd/20);
                    leafs.add(l);
                }
            }
            else if (x < 1138){ //383-254
                leafsCount.add(leafs.size());
                for (int y = -10; y < 363 - ((x - 921) / 2); y += rnd) {
                    rnd = (int) (Math.random() * 37 + 5);
                    Leaf l = new Leaf(x, y, 2.2 + rnd/20);
                    leafs.add(l);
                }
            }
            else if (x < 1434){ //222-499
                leafsCount.add(leafs.size());
                for (int y = -10; y < 222 - ((1138 - x) / 1.1); y += rnd) {
                    rnd = (int) (Math.random() * 37 + 5);
                    Leaf l = new Leaf(x, y, 2.2 + rnd/20);
                    leafs.add(l);
                }
            }
            else if (x < 1746){ //499-222
                leafsCount.add(leafs.size());
                for (int y = -10; y < 499 - ((x - 1434) / 1.1); y += rnd) {
                    rnd = (int) (Math.random() * 37 + 5);
                    Leaf l = new Leaf(x, y, 2.2 + rnd/20);
                    leafs.add(l);
                }
            }
            else if (x < 1930){ //222-352
                leafsCount.add(leafs.size());
                for (int y = -10; y < 222 - ((1746 - x) / 1.2); y += rnd) {
                    rnd = (int) (Math.random() * 37 + 5);
                    Leaf l = new Leaf(x, y, 2.2 + rnd/20);
                    leafs.add(l);
                }
            }
        }
    }

    public void draw(Graphics2D g){
        g.setColor(sakuraLeafColor);

        if (!start){
            start = true;
            drawLeafs(g);
        }

        for (Leaf l:leafs) {
            g.rotate(rotate + l.getTheta(), l.getX(), l.getY());
            g.fillPolygon(l.getLeaf());
            g.rotate(-rotate - l.getTheta(), l.getX(), l.getY());
        }

        if (timerB) {
            if (rotate < 0.8) {
                multiply = 0.004;
                timer++;
            } else if (rotate > 0.4) {
                multiply = -0.004;
                timer++;
            }
            if (timer > 15){
                timer = 0;
                timerB = false;
            }
        }
        else {
            if (rotate < -1.5) {
                multiply = Math.random()/100+0.001;
                timer++;
            } else if (rotate > 0.3) {
                multiply = -(Math.random()/100+0.001);
                timer++;
            }
            if (timer > 25){
                timer = 0;
                timerB = true;
            }
        }

        rotate += multiply;
    }
}
