package utils.chapter_13;

/**
 * @author Alex Golub
 * @since 20/06/2023 6:00 PM
 */
public abstract class Animal {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Return animal sound
     */
    public abstract String sound();
}
