package chapter5_logic_and_loops;

/**
 * 22. Write a method called allDigitsOdd that returns
 * whether every digit of a positive integer is odd.
 *
 * @author Mr.Dr.Professor
 * @since 23-Dec-20 11:49 PM
 */
class Ex5_22_allDigitsOdd {
  public static void main(String[] args) {
    System.out.println(allDigitsOdd(135319) + " => " + true);
  }

  public static boolean allDigitsOdd(int n) {
    n = Math.abs(n); // work for positive and negative numbers

    do {
      if (n % 2 == 0)
        return false;
      n /= 10;
    } while (n > 0);

    return true;
  }
}
