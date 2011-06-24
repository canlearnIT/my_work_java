/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package burnerapp;

/**
 *
 * @author CanlearnIT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BunsenBurner bb1 = new BunsenBurner();
        bb1.setGas(1000);
        bb1.setTemperature(50);
        BunsenBurnerView bb = new BunsenBurnerView(bb1);
    }

}
