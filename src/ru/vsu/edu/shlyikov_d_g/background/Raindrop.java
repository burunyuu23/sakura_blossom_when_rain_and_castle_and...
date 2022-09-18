package ru.vsu.edu.shlyikov_d_g.background;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raindrop {
    private int x;
    private int y;
    private int w;

    public Raindrop(int x, int y, int w){
        this.x = x;
        this.y = y;
        this.w = w;
    }

    public static List<Raindrop> create(int size){
        List<Raindrop> l = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Raindrop r = new Raindrop((int) (Math.random() * 1925),
                    (int) (Math.random() * 786 - 5),
                    (int) (Math.random() * 15 + 5));
            l.add(r);
        }

        return l;
    }

    public void move(){
        x-=7;
        y+=10;
        w--;
    }

    public void restart(){
        x = (int) (Math.random() * 1925);
        y = (int) (Math.random() * 786 - 5);
        w = (int) (Math.random() * 9 + 2);
    }

    public boolean isEmpty(){
        return w == 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getNewX(){
        return x-w;
    }

    public int getNewY(){
        return y+2*w;
    }

    public int getW() {
        return w;
    }
}
