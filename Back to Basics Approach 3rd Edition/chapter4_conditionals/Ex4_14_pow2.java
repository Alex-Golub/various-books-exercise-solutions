package chapter4_conditionals;

/**
 * 14. Modify your pow method from Exercise 5 to make a new method called pow2
 * that uses the type double for the first
 * parameter and that works correctly for negative numbers.
 * Do not use Math.pow in your solution.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 7:17 PM
 */
class Ex4_14_pow2 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      double b = Math.random() * 21 - 10;
      int    e = (int) (Math.random() * 21 - 10); // [-10, 10]
      System.out.printf("%.2f^%d = %.2f\n", b, e, pow2(b, e));
    }
  }

  public static double pow2(double a, int x) {
    if (Math.abs(a) < 1e-12 && x == 0)
      throw new IllegalAccessError("0^0 is not defined");

    double res = 1.0;
    for (int i = 0; i < Math.abs(x); i++)
      res *= a;
    return x >= 0 ? res : 1 / res;
  }
}
