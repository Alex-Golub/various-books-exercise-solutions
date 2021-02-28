package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/circleArea
 *
 * Write a method named circleArea that accepts the radius of a
 * circle as a parameter (as a real number) and returns the area
 * of a circle with that radius.
 * For example, the call of circleArea(2.0)
 * should return 12.566370614359172.
 * You may assume that the radius passed is a non-negative number.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 3:32 PM
 */
/*public*/ class circleArea {
  public static double circleArea(double r) {
    return Math.PI * r * r;
  }
}
