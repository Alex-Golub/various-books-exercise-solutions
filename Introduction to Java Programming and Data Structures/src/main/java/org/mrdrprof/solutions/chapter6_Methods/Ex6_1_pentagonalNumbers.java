package org.mrdrprof.solutions.chapter6_Methods;

/**
 * 6.1 (Math: pentagonal numbers)
 * PN = n * (3 * n - 1) / 2
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 11:35 AM
 */
class Ex6_1_pentagonalNumbers {
  public static void main(String[] args) {
    final int NUMBERS_PER_LINE = 10;
    final int TOTAL = 100;
    for (int i = 1; i < TOTAL; i++) {
      System.out.printf("%7d", getPentagonalNumber(i));
      if (i % NUMBERS_PER_LINE == 0)
        System.out.println();
    }

//    System.out.println(getPentagonalNumber(0)); // exception
//    System.out.println(getPentagonalNumber(-1)); // exception
  }

  public static int getPentagonalNumber(int n) {
    if (n < 1)
      throw new IllegalArgumentException("Pentagonal number defined " +
                                         "only for natural numbers, got: " + n);

    return n * (3 * n - 1) / 2;
  }
}
