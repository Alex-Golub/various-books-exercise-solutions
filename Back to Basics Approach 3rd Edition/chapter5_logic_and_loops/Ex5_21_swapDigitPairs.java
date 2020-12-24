package chapter5_logic_and_loops;

/**
 * 21. Write a method called swapDigitPairs that accepts an integer n
 * as a parameter and returns a new integer whose value
 * is similar to n’s but with each pair of digits swapped in order.
 * NOTE: If the number contains an odd number of digits, leave the leftmost digit
 * in its original place.
 * You should solve this problem without using a String
 * <p>
 * swapDigitPairs(482596)  => 845269
 * swapDigitPairs(1234567) => 1325476
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 4:45 PM
 */
class Ex5_21_swapDigitPairs {
  public static void main(String[] args) {
    System.out.println(swapDigitPairs(482596) + " => " + 845269);
    System.out.println(swapDigitPairs(1234567) + " => " + 1325476);
    System.out.println(swapDigitPairs(29107) + " => " + 21970);
    System.out.println(swapDigitPairs(5) + " => " + 5);
  }

  public static int swapDigitPairs(int n) {
    int newNum = 0;
    int i      = 1; // powers of 10 (1, 100, 10_000, 1_000_000 ...)
    int d1, d2;

    // if n single digit this will cause it to be n * 10
    // adding extra 0 which is not what we want thus
    // loop will be stopped when 0 <= n <= 9
    while (n > 9) {
      d1 = n % 10;
      d2 = n / 10 % 10;
      newNum += (d1 * 10 + d2) * i;

      n /= 100;
      i *= 100;
    }

    return newNum + n * i;
  }
}
