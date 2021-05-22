package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/printStars
 *
 * @author Alex Golub
 * @since 09-May-21, 2:41 PM
 */
class printStars {
  public static void printStars(int n) {
    if (n == 0) {
      return;
    } else if (n == 1) {
      System.out.print("*");
    } else {
      System.out.print("*");
      printStars(n - 1);
    }
  }
}
