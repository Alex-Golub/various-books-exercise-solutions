package chapter9_Objects_Classes._9_9_Geometry;

/**
 * **9.9 (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have
 * the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
 *
 * Design a class named RegularPolygon that contains:
 * ■■ A private int data field named n that defines the number of sides in the polygon
 * with default value 3.
 * ■■ A private double data field named side that stores the length of the side with
 * default value 1.
 * ■■ A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
 * ■■ A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
 * ■■ A no-arg constructor that creates a regular polygon with default values.
 * ■■ A constructor that creates a regular polygon with the specified number of sides
 * and length of side, centered at (0, 0).
 * ■■ A constructor that creates a regular polygon with the specified number of sides,
 * length of side, and x- and y-coordinates.
 * ■■ The accessor and mutator methods for all data fields.
 * ■■ The method getPerimeter() that returns the perimeter of the polygon.
 * ■■ The method getArea() that returns the area of the polygon. The formula for
 * computing the area of a regular polygon is
 * Formula here
 *
 * Draw the UML diagram for the class then implement the class.
 * Write a test program that creates three RegularPolygon objects,
 * created using the no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8).
 * For each object, display its perimeter and area
 *
 * Created by ag on 21-May-20 3:47 PM
 */
class GeometryDemo {
    public static void main(String[] args) {

        RegularPolygon polygon = new RegularPolygon(6, 4);
        System.out.printf("polygon perimeter: %.2f%n", polygon.getPerimeter());
        System.out.printf("polygon area: %.2f%n", polygon.getArea());

        System.out.println();

        RegularPolygon polygon2 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.printf("polygon perimeter: %.2f%n", polygon2.getPerimeter());
        System.out.printf("polygon area: %.2f%n", polygon2.getArea());

        System.out.println();

        invalidPolygon();

    }

    private static void invalidPolygon() {
        // Invalid RegularPolygon
        try {
//            RegularPolygon badPolygon = new RegularPolygon(2, 0); // less then 3 sides
//            RegularPolygon badPolygon = new RegularPolygon(3, 0); // side length zero
            RegularPolygon badPolygon = new RegularPolygon(3, -0.000001); // side length is negative
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
