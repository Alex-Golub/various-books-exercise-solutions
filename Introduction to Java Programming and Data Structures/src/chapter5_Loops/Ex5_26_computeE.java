package chapter5_Loops;

/**
 * **5.26 (Compute e)
 * Write a program that displays the e value for
 * i = 10000, 20000, …, and 100000.
 * e = 1/0! + 1/1! + 1/2! + ... + 1/i!
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 7:27 PM
 */
class Ex5_26_computeE {
  public static void main(String[] args) {
    final int TO   = 100_000;
    double    e    = 1.0;
    double    item = 1.0;

    for (int i = 1; i <= TO; i++) {
      item /= i;
      e += item;

      if (i % 10_000 == 0) {
        System.out.printf("e = %.15f %,8d Iterations\n", e, i);
      }
    }
  }
}
