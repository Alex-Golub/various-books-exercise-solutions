package chapter3_parameters_and_objects;

/**
 * 10. Write a method called area that accepts as a parameter the radius
 * of a circle and that returns the area of the circle.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 5:57 PM
 */
class Ex3_10_area {
  public static void main(String[] args) {
    System.out.println(area(1));     // => 3.141592653589793
    System.out.println(area(2));     // => 12.566370614359172
    System.out.println(area(12.34)); // => 478.38790628097786
    System.out.println(area(0));     // => 0.0
  }

  public static double area(double r) {
    return Math.PI * r * r;
  }
}
