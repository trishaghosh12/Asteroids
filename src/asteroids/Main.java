/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;
import processing.core.*;
import java.awt.event.*;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author zacstewart
 */
public class Main extends PApplet {
    public Game game;
    public Ship ship;
    public Asteroid[] asteroids;
    public List spaceThings;
    public ListIterator li;
    Object x;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PApplet.main(new String[] {"asteroids.Main"});
    }

    @Override
    public void setup() {
//        frameRate(60);
        smooth();
        game = new Game(this);
        size(800, 600);
        rectMode(CENTER);
    }

    @Override
    public void draw() {
        game.draw();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        game.control("keyDown", e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        game.control("keyUp", e);
    }

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mousePressed() {
        game.mouseControl();
    }

}
