/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package burnerapp;

/**
 *
 * @author CanlearnIT
 */
public class BunsenBurner {

    private double temperature;
    private double gas;
    private String s = String.valueOf(gas);
    private String s1 = String.valueOf(temperature);

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the gas
     */
    public double getGas() {
        return gas;
    }

    /**
     * @param gas the gas to set
     */
    public void setGas(double gas) {
        this.gas = gas;
    }

    /**
     * @return the s
     */
    public String getS() {
        return String.valueOf(gas);
    }

    /**
     * @param s the s to set
     */
    public void setS(String s) {
        this.s = s;
    }

    /**
     * @return the s1
     */
    public String getS1() {
        return String.valueOf(temperature);
    }

    /**
     * @param s1 the s1 to set
     */
    public void setS1(String s1) {
        this.s1 = s1;
    }
}
