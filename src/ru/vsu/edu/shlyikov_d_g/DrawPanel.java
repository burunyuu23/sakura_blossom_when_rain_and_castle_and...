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

        RedScarf.drawRedScarfBack(g);
        Trees.draw(g);
        SakuraLeaf.drawLeafs(g);
        RedScarf.draw(g);
    }
}
