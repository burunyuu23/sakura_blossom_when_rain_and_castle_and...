package ru.vsu.edu.shlyikov_d_g;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public DrawPanel() {
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        Ground ground = new Ground();
        RedScarf redScarf = new RedScarf();
        Trees trees = new Trees();
        SakuraLeaf sakuraLeaf = new SakuraLeaf();
        Castle castle = new Castle();
        Sky sky = new Sky();

        sky.draw(g);
        castle.draw(g);
        ground.draw(g);
        redScarf.drawRedScarfBack(g);
        trees.draw(g);
        sakuraLeaf.drawLeafs(g);
        redScarf.draw(g);
    }
}
