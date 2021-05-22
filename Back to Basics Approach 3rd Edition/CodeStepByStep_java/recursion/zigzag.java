package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/zigzag
 *
 * @author Alex Golub
 * @since 09-May-21, 3:01 PM
 */
class zigzag {
  public static void zigzag(int n) {
    if (n < 1) {
      throw new IllegalArgumentException();
    } else if (n == 1) {
      System.out.print("*");
    } else if (n == 2) {
      System.out.print("**");
    } else {
      System.out.print("<");
      zigzag(n - 2);
      System.out.print(">");
    }
  }
}
