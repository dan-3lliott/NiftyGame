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
public class Player {
    private int x;
    private int y;
    private int w;
    private int h;
    private boolean shooting;
    private int shootX;
    private int shootY;
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        w = 50;
        h = 50;
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
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public boolean isShooting() {
        return shooting;
    }
    public void toggleShoot() {
        shooting = !shooting;
    }
}
