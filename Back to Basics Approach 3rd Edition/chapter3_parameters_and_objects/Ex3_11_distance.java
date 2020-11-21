package chapter3_parameters_and_objects;

/**
 * 11. Write a method called distance that accepts four integer
 * coordinates x1, y1, x2, and y2 as parameters and computes
 * the distance between points (x1, y1) and (x2, y2) on the Cartesian plane.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 6:00 PM
 */
class Ex3_11_distance {
  public static void main(String[] args) {

  }

  public static double distance(int x1, int y1, int x2, int y2) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }
}
