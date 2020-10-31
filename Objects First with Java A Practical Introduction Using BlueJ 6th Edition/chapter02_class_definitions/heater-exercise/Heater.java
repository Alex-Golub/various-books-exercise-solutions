/**
 * Exercise 2.93 Challenge exercise
 *
 * @author Mr.Dr.Prof.AG
 * @version 31-10-2020
 */
public class Heater {
    private double temperature;
    private double min;
    private double max;
    private double increment;

    public Heater(double min, double max) {
        temperature = (max + min) / 2.0;
        this.min = min;
        this.max = max;
        increment = 5.0;
    }

    public void warmer() {
        if (temperature + increment <= max) {
            temperature += increment;
        }
    }

    public void cooler() {
        if (temperature - increment >= min) {
            temperature -= increment;
        }
    }

    /**
     * Setting new increment value
     *
     * @param incrementBy - positive value otherwise ignored
     */
    public void setIncrement(double newValue) {
        increment = newValue > 0 ? newValue: increment;
    }

    public double getTemperature() {
        return temperature;
    }

}