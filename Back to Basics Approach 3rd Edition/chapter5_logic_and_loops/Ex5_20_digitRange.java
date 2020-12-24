package chapter5_logic_and_loops;

/**
 * 20. Write a method called digitRange that accepts an integer
 * as a parameter and returns the range of values of its digits.
 * The range is defined as 1 more than the difference between the
 * largest and smallest digit value.
 * If the number contains only one digit, return 1.
 * You should solve this problem without using a String.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 4:26 PM
 */
class Ex5_20_digitRange {
  public static void main(String[] args) {
    System.out.println(digitRange(68437) + " => " + (8 - 3 + 1));
    System.out.println(digitRange(5) + " => " + 1);
    System.out.println(digitRange(0) + " => " + 1);
    System.out.println(digitRange(9999) + " => " + 1);
  }

  public static int digitRange(int n) {
    n = Math.abs(n);

    if (n < 10)
      return 1;

    int low  = 9;
    int high = 0;
    int digit;

    while (n > 0) {
      digit = n % 10;
      if (digit < low) low = digit;
      if (digit > high) high = digit;

      n /= 10;
    }

    return high - low + 1;
  }
}
