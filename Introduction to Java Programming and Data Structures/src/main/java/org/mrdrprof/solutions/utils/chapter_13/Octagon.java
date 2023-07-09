package org.mrdrprof.solutions.utils.chapter_13;

import lombok.*;
import org.mrdrprof.solutions.utils.chapter_11.GeometricObject;

/**
 * *13.11 (The Octagon class) Write a class named Octagon that extends
 * GeometricObject and implements the Comparable and Cloneable interfaces. Assume all eight sides of the octagon are of equal length. The area can be
 * computed using the following formula:
 * area = 12 + 4/222 * side * side
 * The Octagon class has a private double data field named side with its getter and
 * setter methods. The class has a no-arg constructor that creates an Octagon with
 * side 0, and a constructor to create an Octagon with a specified side.
 *
 * @author Alex Golub
 * @since June 26, 2023 6:57 PM
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Octagon extends GeometricObject {

    private double side;

    public Octagon(Octagon octagon) {
        this.side = octagon.side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / (Math.pow(2, 0.5))) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }
}
