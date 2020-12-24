package chapter5_logic_and_loops;

/**
 * 23. Write a method called hasAnOddDigit that returns
 * whether a given positive integer has at least one digit whose
 * value is odd.
 *
 * @author Mr.Dr.Professor
 * @since 23-Dec-20 11:57 PM
 */
class Ex5_23_hasAnOddDigit {
  public static boolean hasAnOddDigit(int n) {
    n = Math.abs(n);

    do {
      if (n % 2 == 1)
        return true;
      n /= 10;
    } while (n > 0);

    return false;
  }
}
