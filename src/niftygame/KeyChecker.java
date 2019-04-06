/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niftygame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.util.*;

/**
 *
 * @author ElliottRL
 */

public class KeyChecker extends KeyAdapter {
    private Set<Character> pressed = new HashSet<>();
    @Override
    public void keyPressed(KeyEvent e) {
        pressed.add(e.getKeyChar());
        if (pressed.size() > 1) {
            System.out.println("two");
        }
        else {
            if (pressed.contains('w') && NiftyGame.play.getY() > 10) {
                NiftyGame.play.setY(NiftyGame.play.getY() - 10);
            }
            if (pressed.contains('s') && (NiftyGame.play.getY() + NiftyGame.play.getH()) < 540) {
                NiftyGame.play.setY(NiftyGame.play.getY() + 10);
            }
            if (pressed.contains('a') && NiftyGame.play.getX() > 10) {
                NiftyGame.play.setX(NiftyGame.play.getX() - 10);
            }
            if (pressed.contains('d') && (NiftyGame.play.getX() + NiftyGame.play.getW()) < 570) {
                NiftyGame.play.setX(NiftyGame.play.getX() + 10);
            }
        }    
    }
    public void keyReleased(KeyEvent e) {
        pressed.clear();
    }
}