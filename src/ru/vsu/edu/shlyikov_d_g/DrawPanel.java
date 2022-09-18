package ru.vsu.edu.shlyikov_d_g;

import ru.vsu.edu.shlyikov_d_g.background.Castle;
import ru.vsu.edu.shlyikov_d_g.background.Ground;
import ru.vsu.edu.shlyikov_d_g.background.Rain;
import ru.vsu.edu.shlyikov_d_g.background.Sky;
import ru.vsu.edu.shlyikov_d_g.foreground.RedScarf;
import ru.vsu.edu.shlyikov_d_g.foreground.SakuraLeaf;
import ru.vsu.edu.shlyikov_d_g.foreground.Torii;
import ru.vsu.edu.shlyikov_d_g.foreground.Trees;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    public DrawPanel() {
        t.start();
    }

    Ground ground = new Ground();
    RedScarf redScarf = new RedScarf();
    Trees trees = new Trees();
    SakuraLeaf sakuraLeaf = new SakuraLeaf();
    Castle castle = new Castle();
    Sky sky = new Sky();
    Torii torii = new Torii();
    Rain rain = new Rain();
    Timer t = new Timer(15, this);

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        sky.draw(g);
        castle.draw(g);
        ground.draw(g);
        redScarf.drawRedScarfBack(g);
        trees.draw(g);
        torii.draw(g);
        redScarf.draw(g); //anim
        rain.draw(g); //anim
        sakuraLeaf.draw(g); //anim
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
