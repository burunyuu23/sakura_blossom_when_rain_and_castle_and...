package ru.vsu.edu.shlyikov_d_g;

import ru.vsu.edu.shlyikov_d_g.background.Castle;
import ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain.Lightning;
import ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain.Puddle;
import ru.vsu.edu.shlyikov_d_g.foreground.static_content.Ground;
import ru.vsu.edu.shlyikov_d_g.foreground.animated_content.rain.Rain;
import ru.vsu.edu.shlyikov_d_g.background.Sky;
import ru.vsu.edu.shlyikov_d_g.foreground.animated_content.RedScarf;
import ru.vsu.edu.shlyikov_d_g.foreground.animated_content.SakuraLeaf;
import ru.vsu.edu.shlyikov_d_g.foreground.static_content.Torii;
import ru.vsu.edu.shlyikov_d_g.foreground.static_content.Trees;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
    Lightning lightning = new Lightning();
    java.util.List<Puddle> p = new ArrayList<>();
    {
        p.add(new Puddle(589,764,88,22));
        p.add(new Puddle(693,766,136,34));
        p.add(new Puddle(270,756,64,16));
    }

    Rain rain = new Rain(p);

    Timer t = new Timer(15, this); //15

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        sky.draw(g);
        lightning.draw(g);
        castle.draw(g);
        ground.draw(g);
        trees.draw(g);

        for (Puddle pi:p) {
            pi.draw(g);
        }

        torii.draw(g);
        redScarf.draw(g); //anim
        sakuraLeaf.draw(g); //anim
        rain.draw(g); //anim
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
