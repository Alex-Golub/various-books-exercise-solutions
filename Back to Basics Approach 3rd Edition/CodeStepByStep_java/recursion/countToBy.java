package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/countToBy
 *
 * @author Alex Golub
 * @since 12-May-21, 6:50 PM
 */
class countToBy {
  public static void main(String[] args) {
    countToBy(10, 1);
    System.out.println();
    countToBy(3, 6);
  }
  
  public static void countToBy(int n, int m) {
    if (n < 1 || m < 1)
      throw new IllegalArgumentException();
    helper(n - m, m);
    System.out.println(n);
  }
  
  private static void helper(int n, int m) {
    if (n >= 1) {
      helper(n - m, m);
      System.out.print(n + ", ");
    }
  }
}
