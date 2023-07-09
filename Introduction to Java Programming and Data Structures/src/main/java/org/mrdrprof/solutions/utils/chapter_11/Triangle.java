package org.mrdrprof.solutions.utils.chapter_11;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.mrdrprof.solutions.utils.exceptions.IllegalTriangleException;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Triangle extends GeometricObject {

    private final double a;
    private final double b;
    private final double c;

    public Triangle() {
        a = 1.0;
        b = 1.0;
        c = 1.0;
    }

    public Triangle(double a, double b, double c) {
        this("None", false, a, b, c);
    }

    public Triangle(String color, boolean filled, double a, double b, double c) {
        super(color, filled);
        isValidTriangle(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void isValidTriangle(double a, double b, double c) {
        boolean isValid = true;
        String errorMessage = "Invalid triangle: %.2f + %.2f <= %.2f";
        
        if (a + b <= c) {
            errorMessage = errorMessage.formatted(a, b, c);
            isValid = false;
        } else if (a + c <= b) {
            errorMessage = errorMessage.formatted(a, c, b);
            isValid = false;
        } else if (b + c <= a) {
            errorMessage = errorMessage.formatted(b, c, a);
            isValid = false;
        }

        if (!isValid) {
            throw new IllegalTriangleException(errorMessage);
        }
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + getC();
    }
}
