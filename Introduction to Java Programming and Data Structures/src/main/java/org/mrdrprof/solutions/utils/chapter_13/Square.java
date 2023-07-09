package org.mrdrprof.solutions.utils.chapter_13;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.mrdrprof.solutions.utils.chapter_11.GeometricObject;

/**
 * @author Alex Golub
 * @since June 23, 2023 8:55 PM
 */
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square() {
        this(0);
    }

    public Square(double side) {
        if (Double.compare(0, side) > 0) {
            throw new IllegalArgumentException("Square side can't be negative value, got: " + side);
        }

        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
