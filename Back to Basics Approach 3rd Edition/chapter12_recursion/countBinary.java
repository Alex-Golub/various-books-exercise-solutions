package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e19-countBinary
 *
 * You may assume that n is non-negative. If n is 0, a blank line of
 * output should be produced.
 *
 * @author Alex Golub
 * @since 08-May-21, 2:22 PM
 */
class countBinary {
  public static void main(String[] args) {
//    countBinary(1);
//    countBinary(2);
    countBinary(3);
  }
  
  public static void countBinary(int n) {
    countBinary(n, "");
  }
  
  private static void countBinary(int n, String accum) {
    if (n == 0) {
      System.out.println(accum);
    } else {
      countBinary(n - 1, accum + "0");
      countBinary(n - 1, accum + "1");
    }
  }
}
