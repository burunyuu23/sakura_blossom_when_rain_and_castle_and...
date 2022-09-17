package ru.vsu.edu.shlyikov_d_g;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame {
    private final DrawPanel dp;

    public Window() throws HeadlessException {
        dp = new DrawPanel();
        setResizable(false);
        dp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getX() + "," + e.getY());
            }
        });
        this.add(dp);
    }
}
