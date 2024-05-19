package org.mrdrprof.solutions.utils.chapter_13;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.mrdrprof.solutions.utils.chapter_11.Rectangle;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ComparableRectangle
        extends Rectangle
        /*implements Comparable<ComparableRectangle>*/ {
    /**
     * Construct a ComparableRectangle with specified properties
     */
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

//    @Override // Implement the compareTo method defined in Comparable 
//    public int compareTo(ComparableRectangle o) {
//        return Double.compare(getArea(), o.getArea());
//    }
}