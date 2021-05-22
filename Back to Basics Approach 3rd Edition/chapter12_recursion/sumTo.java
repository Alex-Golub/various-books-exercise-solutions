package chapter12_recursion;

/**
 * https://practiceit.cs.washington.edu/problem/view/bjp3/chapter12/e9-sumTo
 *
 * @author Alex Golub
 * @since 06-May-21, 2:00 PM
 */
class sumTo {
  public static void main(String[] args) {
    System.out.println(sumTo(4));
  }
  
  public static double sumTo(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    
    return n == 0 ? 0.0 : 1.0 / n + sumTo(n - 1);
  }
}
/*
f(2) -> f(1) + 1 / 2
  f(1) -> 1
f(2) -> 1 + 1 / 2 = 1.5
*/
