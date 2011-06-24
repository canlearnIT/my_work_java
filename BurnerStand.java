/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package burnerapp;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author CanlearnIT
 */
public class BurnerStand extends JPanel {

    BunsenBurner BB = null;

    public BurnerStand(BunsenBurner BB) {
        this.BB = BB;

        setSize(500, 500);
        setPreferredSize(new Dimension(500, 500));

    }

    private int d = 10;

	public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.fillOval(240, 240, d, d);
        g.draw3DRect(200, 350, 100, 10, true);
        g.fill3DRect(240, 260, 10, 100, true);

	}

	public void setD(int newD){
		d = (newD >= 0 ? newD:10);
		repaint();

	}

	public Dimension getPreferredSize(){

		return new Dimension(200,200);
	}

	public Dimension getMinimumSize(){
	return getPreferredSize();
	}

}
