package chapter4_conditionals;

/**
 * 21. Write a method called perfectNumbers that accepts an integer maximum
 * as its parameter and prints all "perfect numbers" up to and including that
 * maximum.
 * A perfect number is an integer that is equal to the sum of its proper
 * factors, that is, all numbers that evenly divide it other than 1 and itself.
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 10:03 PM
 */
class Ex4_21_perfectNumbers {
  public static void main(String[] args) {
    perfectNumbers(10_000_000);
  }

  // The first two perfect numbers are 6 and 28
  public static void perfectNumbers(int n) {
    System.out.printf("Perfect numbers up to %d: ", n);
    for (int i = 6; i <= n; i++) {
      if (isPerfect(i))
        System.out.print(i + " ");
    }
  }

  private static boolean isPerfect(int n) {
    int sum = 1;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        sum += i;
        if (n / i != i) { // e.g. 100 has 10 as factor two times ignore one
          sum += n / i;
        }
      }
    }

    return sum == n;
  }
}
