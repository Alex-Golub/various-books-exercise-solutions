package utils.chapter_13;

import chapter11_Inheritance_and_Polymorphism.Rectangle;

public class ComparableRectangle extends Rectangle
        implements Comparable<ComparableRectangle> {
    /**
     * Construct a ComparableRectangle with specified properties
     */
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override // Implement the compareTo method defined in Comparable 
    public int compareTo(ComparableRectangle o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override // Implement the toString method in GeometricObject
    public String toString() {
        return "Width: %s Height: %s Area: %s".formatted(getWidth(), getHeight(), getArea());
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || other.getClass() != getClass()) {
            return false;
        }

        return getArea() == ((ComparableRectangle) other).getArea();
    }
}
