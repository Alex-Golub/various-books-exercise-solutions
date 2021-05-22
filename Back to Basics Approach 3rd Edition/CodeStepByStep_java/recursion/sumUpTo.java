package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/sumUpTo
 *
 * @author Alex Golub
 * @since 06-May-21, 2:10 PM
 */
class sumUpTo {
  public static double sumUpTo(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    
    return n == 0 ? 0.0 : 1.0 / n + sumUpTo(n - 1);
  }
}
