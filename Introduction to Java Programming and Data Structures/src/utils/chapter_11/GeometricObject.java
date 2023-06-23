package utils.chapter_11;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@EqualsAndHashCode
@ToString
public abstract class GeometricObject implements Comparable<GeometricObject> {

    private final LocalDateTime dateCreated;
    private String color = "white";
    private boolean filled;

    /**
     * Construct a default geometric object
     */
    protected GeometricObject() {
        dateCreated = LocalDateTime.now();
    }

    /**
     * Construct a geometric object with color and filled value
     */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = LocalDateTime.now();
        this.color = color;
        this.filled = filled;
    }

    /**
     * Return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set a new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean,
     * the get method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set a new filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Get dateCreated
     */
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    /**
     * Abstract method getArea
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     */
    public abstract double getPerimeter();

    /**
     * Compares two GeometricObjects and returns the object that's considered larger based on its area.
     *
     * @param o1 the first GeometricObject to compare
     * @param o2 the second GeometricObject to compare
     * @return the GeometricObject that's larger based on its area
     */
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) > 0 ? o1 : o2;
    }

    /**
     * Compare this GeometricObject area to the other GeometricObject
     */
    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(getArea(), o.getArea());
    }
}
