package chapter3_parameters_and_objects;

/**
 * 14. Write a method called cylinderSurfaceArea that accepts a
 * radius and height as parameters and returns the surface
 * area of a cylinder with those dimensions.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 6:45 PM
 */
class Ex3_14_cylinderSurfaceArea {
  public static void main(String[] args) {
    System.out.println(cylinderSurfaceArea(3.0, 4.5));    // => 141.3716694115407
    System.out.println(cylinderSurfaceArea(2.0, 11.25));  // => 166.50441064025904
    System.out.println(cylinderSurfaceArea(8.75, 4.125)); // => 707.8400947619502
    System.out.println(cylinderSurfaceArea(0, 0));        // => 0.0
  }

  public static double cylinderSurfaceArea(double r, double h) {
    return 2 * Math.PI * r * (r + h);
  }
}
