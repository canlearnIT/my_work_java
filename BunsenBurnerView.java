/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package burnerapp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Hashtable;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author CanlearnIT
 */
public class BunsenBurnerView extends JFrame {

    BurnerStand bStand = null;
    BunsenBurner BB = null;
    BunsenBurnerController Controller = new BunsenBurnerController();
    double t = 100;

    public BunsenBurnerView(final BunsenBurner BB) {
        this.BB = BB;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Copyright 2010 Cadiz Roche");
        setSize(500, 500);

        setVisible(true);
        bStand = new BurnerStand(BB);



        final JLabel JL1 = new JLabel();
        final JLabel JL2 = new JLabel();


        JPanel JP = new JPanel();

        JP.setLayout(new GridLayout(3, 10));
        final JSlider JS = new JSlider(JSlider.VERTICAL, 0, 30, 15);
        JP.add(JS);
        JP.add(JL1);
        JP.add(JL2);

        JL2.setText("Temperature");
        JL1.setText("GAS: ");
        getContentPane().add(JP, BorderLayout.LINE_START);
        getContentPane().add(bStand, BorderLayout.CENTER);


        JS.addChangeListener(Controller);
        JS.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                // System.out.println("Slider1: " + JS.getValue());

                if (t > 0) {
                    BB.setTemperature(JS.getValue());
                    bStand.setD(JS.getValue());
                    BB.setGas(t);
                    t--;
                    JL2.setText("Temperature " + BB.getS1());
                    JL1.setText("GAS " + BB.getS());
                } else {
                    System.out.println("OUT OF GAS");
                    JL2.setText("Temperature " + "0");
                    JL1.setText("GAS" + "0");
                }

            }
        });


        JS.setMajorTickSpacing(10);
        JS.setPaintTicks(true);

        Hashtable<Integer, JLabel> labelTable =
                new Hashtable<Integer, JLabel>();
        //PENDING: could use images, but we don't have any good ones.
        labelTable.put(new Integer(0),
                new JLabel("Stop"));
        //new JLabel(createImageIcon("images/stop.gif")) );
        labelTable.put(new Integer(30 / 10),
                new JLabel("Slow"));
        //new JLabel(createImageIcon("images/slow.gif")) );
        labelTable.put(new Integer(30),
                new JLabel("Fast"));


        JS.setLabelTable(labelTable);
        JS.setPaintLabels(true);
        JS.setBorder(
                BorderFactory.createEmptyBorder(0, 0, 0, 10));

    }

    public BurnerStand getStand() {
        return bStand;
    }

    /**
     * @return the Controller
     */
    public BunsenBurnerController getController() {
        return Controller;
    }

    /**
     * @param Controller the Controller to set
     */
    public void setController(BunsenBurnerController Controller) {
        this.Controller = Controller;
    }
}
