/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niftygame;

/**
 *
 * @author ElliottRL
 */
public class Block {
    private int x;
    private int y;
    private int w;
    private int h;
    public Block(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getW() {
        return w;
    }
    public int getH() {
        return h;
    }
}
