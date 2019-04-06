/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niftygame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.MouseInfo;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ElliottRL
 */
public class Window extends JPanel {
    private final Timer timer;
    public static int mouseX;
    public static int mouseY;
    public Window() {
        setBackground(Color.BLACK); 
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 10);    
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (Block b : NiftyGame.blocks) {
            g2d.setColor(Color.YELLOW);
            g2d.drawRect(b.getX(), b.getY(), b.getW(), b.getH());
        }
        g2d.setColor(Color.GREEN);
        g2d.drawOval(NiftyGame.play.getX(), NiftyGame.play.getY(), NiftyGame.play.getW(), NiftyGame.play.getH());   
        g2d.setColor(Color.WHITE);
        g2d.drawLine(this.getMousePosition().x - 5, this.getMousePosition().y, this.getMousePosition().x + 5, this.getMousePosition().y);
        g2d.drawLine(this.getMousePosition().x, this.getMousePosition().y - 5, this.getMousePosition().x, this.getMousePosition().y + 5);
        if (NiftyGame.play.isShooting()) {
            g2d.setColor(Color.RED);
            g2d.drawLine(NiftyGame.play.getX() + (NiftyGame.play.getW() / 2), NiftyGame.play.getY() + (NiftyGame.play.getH() / 2), this.getMousePosition().x, this.getMousePosition().y);
        }
    }
    private class ScheduleTask extends TimerTask {
        @Override
        public void run() {
            repaint();
        }
    }
}
