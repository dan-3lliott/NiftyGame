/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niftygame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

/**
 *
 * @author ElliottRL
 */
public class MouseChecker extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) {
        NiftyGame.play.toggleShoot();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        NiftyGame.play.toggleShoot();
    }

}
