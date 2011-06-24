/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package burnerapp;

import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author CanlearnIT
 */
public class BunsenBurnerController implements ChangeListener {

    BunsenBurner b = null;
    BunsenBurnerView v = null;
    int size;

    public BunsenBurnerController() {
    }

    public BunsenBurnerController(BunsenBurner b, BunsenBurnerView v) {
        this.b = b;
        this.v = v;
    }

    public void stateChanged(ChangeEvent e) {

        
        //v.getStand().repaint();
    }
}
