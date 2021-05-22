package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/factorial
 *
 * @author Alex Golub
 * @since 03-May-21, 7:37 PM
 */
class factorial {
  public static int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
  }
}
