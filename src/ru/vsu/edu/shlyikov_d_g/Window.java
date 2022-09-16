package ru.vsu.edu.shlyikov_d_g;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private final DrawPanel dp;

    public Window() throws HeadlessException {
        dp = new DrawPanel();
        setResizable(false);
        this.add(dp);
    }
}
