/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niftygame;

//import java.awt.EventQueue;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Random;
//import java.awt.Cursor;
import java.awt.*;

public class NiftyGame extends JFrame {
    public static ArrayList<Block> blocks = new ArrayList<Block>();
    public static Player play = new Player(10, 10);
    public NiftyGame() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            blocks.add(new Block(rand.nextInt(440) + 1, rand.nextInt(440) + 1, rand.nextInt(100) + 51, rand.nextInt(100) + 51));
        }
        initUI();
    }
    private void initUI() {
        add(new Window());
        addKeyListener(new KeyChecker());
        addMouseListener(new MouseChecker());
        // Transparent 16 x 16 pixel cursor image.
/*BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);

// Create a new blank cursor.
Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
    cursorImg, new Point(0, 0), "blank cursor");

// Set the blank cursor to the JFrame.
this.getContentPane().setCursor(blankCursor);*/
        setTitle("Test");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                NiftyGame ng = new NiftyGame(); //updates all graphics as well
                ng.setVisible(true);      
            }
        });
    }
}