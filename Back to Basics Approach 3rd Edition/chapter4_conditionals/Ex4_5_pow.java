package chapter4_conditionals;

/**
 * 5. Write a method called pow that accepts a base and an exponent as
 * parameters and returns the base raised to the given power.
 * For example, the call pow(3, 4) should return 3 * 3 * 3 * 3, or 81.
 * Assume that the base and exponent are nonnegative.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 1:46 PM
 */
class Ex4_5_pow {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      int rnd = (int) (Math.random() * 1_000);
      int b = rnd % 10;
      int e = rnd / 10 % 10;
      System.out.printf("%d^%d = %,d\n", b, e, pow(b, e));
    }
  }

  public static int pow(int b, int e) {
    if (b == 0 && e == 0)
      throw new IllegalArgumentException("0^0 = UNDEFINED");

    int res = 1;
    for (int i = 0; i < e; i++)
      res *= b;
    return res;
  }
}
