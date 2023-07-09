package org.mrdrprof.solutions.utils.chapter_11;

import java.time.LocalDateTime;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private LocalDateTime dateCreated;

    /**
     * Construct a default geometric object
     */
    public SimpleGeometricObject() {
        dateCreated = LocalDateTime.now();
    }

    /**
     * Construct a geometric object with the specified color
     * and filled value
     */
    public SimpleGeometricObject(String color, boolean filled) {
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
     * its get method is named isFilled
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
     * Return a string representation of this object
     */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
               " and filled: " + filled;
    }
}
