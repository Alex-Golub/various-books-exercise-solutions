package chapter9_Objects_Classes._9_9_Geometry;

import java.math.BigDecimal;

/**
 * Created by ag on 21-May-20 3:48 PM
 */
class RegularPolygon {

    private static final int MIN_POLY_SIDES = 3;

    private int n; // number of sides in the polygon
    private double side; // length of the side
    private double x; // x-coordinate of the polygon’s center
    private double y; // y-coordinate of the polygon’s center

    RegularPolygon() { // regular polygon with default values
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int n, double side) {
        validateSide(n);
        validateSideLength(side);

        this.n = n;
        this.side = side;

        // x and y are zero by default
    }

    RegularPolygon(int n, double side, double x, double y) {
        this(n, side); // delegate sides and length to other constructor
        this.x = x;
        this.y = y;
    }

    private void validateSide(int n) {
        if (n < RegularPolygon.MIN_POLY_SIDES)
            throw new IllegalArgumentException("Polygon must have at least 3 sides");
    }

    private void validateSideLength(double sideLength) {
        if (BigDecimal.valueOf(sideLength).compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Polygon side lengths can't be zero or negative");
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        validateSide(n);
        this.n = n;
    }

    public void setSide(double side) {
        validateSideLength(side);
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return getSide() * getN();
    }

    public double getArea() {
        double nominator = getN() * getSide() * getSide();
        double denominator = 4 * Math.tan(Math.PI / getN());
        return nominator / denominator;
    }
}
