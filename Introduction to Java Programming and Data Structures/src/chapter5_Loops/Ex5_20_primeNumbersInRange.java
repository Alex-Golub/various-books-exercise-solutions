package chapter5_Loops;

/**
 * *5.20 (Display prime numbers between 2 and 1,200)
 * Modify Listing 5.15 to display all
 * the prime numbers between 2 and 1,200, inclusive.
 * Display eight prime numbers
 * per line.
 * Numbers are separated by exactly one space.
 *
 * @author Mr.Dr.Professor
 * @since 22-Jan-21 3:47 PM
 */
class Ex5_20_primeNumbersInRange {
  static final int PER_LINE = 8;
  static final int TO       = 1_200;

  public static void main(String[] args) {
    for (int i = 2, count = 0; i <= TO; i++) {
      if (isPrime(i)) {
        System.out.printf("%-6d", i);

        count++;
        if (count % PER_LINE == 0) {
          System.out.println();
        }
      }
    }
  }

  public static boolean isPrime(int n) {
    if (n == 2 || n == 3)
      return true;

    // if prime number must leave reminder 1 or 5 when divided by 6
    if (n % 6 != 1 && n % 6 != 5)
      return false;

    for (int i = 5; i < n; i += 2) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
}
