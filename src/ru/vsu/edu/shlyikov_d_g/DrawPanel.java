package ru.vsu.edu.shlyikov_d_g;

import ru.vsu.edu.shlyikov_d_g.background.Castle;
import ru.vsu.edu.shlyikov_d_g.background.Ground;
import ru.vsu.edu.shlyikov_d_g.background.Sky;
import ru.vsu.edu.shlyikov_d_g.foreground.RedScarf;
import ru.vsu.edu.shlyikov_d_g.foreground.SakuraLeaf;
import ru.vsu.edu.shlyikov_d_g.foreground.Torii;
import ru.vsu.edu.shlyikov_d_g.foreground.Trees;

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
        Torii torii = new Torii();

        sky.draw(g);
        castle.draw(g);
        ground.draw(g);
        redScarf.drawRedScarfBack(g);
        trees.draw(g);
        sakuraLeaf.drawLeafs(g);
        redScarf.draw(g);
        torii.draw(g);
    }
}
