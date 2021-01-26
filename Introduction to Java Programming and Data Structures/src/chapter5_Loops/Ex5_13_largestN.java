package chapter5_Loops;

/**
 * 5.13 (Find the largest n such that n^2 < 12,000)
 * Use a while loop to find the largest
 * integer n such that n^2 is less than 12,000.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 7:36 PM
 */
class Ex5_13_largestN {
  public static void main(String[] args) {
    final int BOUND = 12_000;
    int       n     = 2;

    while (n * n < BOUND) {
      n++;
    }

    n--;

    System.out.printf("Largest n such that n^2 < %d is %,d\n",
                      BOUND, n);
    System.out.printf("%d^2 = %,d\n", (n - 1), (n - 1) * (n - 1));
    System.out.printf("%d^2 = %,d\n", n, n * n);
    System.out.printf("%d^2 = %,d\n", n + 1, (n + 1) * (n + 1));
  }
}
