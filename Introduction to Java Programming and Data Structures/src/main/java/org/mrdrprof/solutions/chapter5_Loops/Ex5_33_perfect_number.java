package org.mrdrprof.solutions.chapter5_Loops;

/**
 * **5.33 (Perfect number)
 * A positive integer is called a perfect number if it is equal to the
 * sum of all of its positive divisors, excluding itself.
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 3:41 PM
 */
class Ex5_33_perfect_number {
  public static void main(String[] args) {
    final int UP_TO = 10_000;
    for (int i = 6; i <= UP_TO; i++) {
      int sum = 1;

      // Divisors can be obtained up to square root of number i.
      // Other part is symmetric and can be obtained
      // by dividing the number i by divisor.
      // corner case is when number i / divisor == divisor such
      // as in case of 100, sqrt(100) == 10
      // 100 / 10 == 10 we want to count 10 one time only in sum
      for (int divisor = 2; divisor * divisor < i; divisor++) {
        if (i % divisor == 0) {
          sum += divisor;

          if (i % divisor != divisor) {
            sum += i / divisor;
          }
        }
      }

      if (sum == i)
        System.out.println(i);
    }
  }
}
