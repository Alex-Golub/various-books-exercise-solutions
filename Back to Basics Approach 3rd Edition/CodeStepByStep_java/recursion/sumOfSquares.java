package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/sumOfSquares
 *
 * @author Alex Golub
 * @since 09-May-21, 3:31 PM
 */
class sumOfSquares {
  public static void main(String[] args) {
    System.out.println(sumOfSquares(0));
    System.out.println(sumOfSquares(1));
    System.out.println(sumOfSquares(2));
    System.out.println(sumOfSquares(3));
    System.out.println(sumOfSquares(-1));
  }
  
  public static int sumOfSquares(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    } else if (n == 0) {
      return 0;
    } else {
      return n * n + sumOfSquares(n - 1);
    }
  }
}
