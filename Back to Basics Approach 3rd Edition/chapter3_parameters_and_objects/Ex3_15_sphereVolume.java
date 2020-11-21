package chapter3_parameters_and_objects;

/**
 * 15. Write a method called sphereVolume that accepts a radius as a
 * parameter and returns the volume of a sphere with that radius.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 6:53 PM
 */
class Ex3_15_sphereVolume {
  public static void main(String[] args) {
    System.out.println(sphereVolume(2.0));    // => 33.510321638291124
    System.out.println(sphereVolume(7.25));   // => 1596.2563172583637
    System.out.println(sphereVolume(1.125));  // => 5.964117303299373
    System.out.println(sphereVolume(0));      // => 0.0
  }

  public static double sphereVolume(double r) {
    return (4.0 / 3) * Math.PI * r * r * r;
  }

}
