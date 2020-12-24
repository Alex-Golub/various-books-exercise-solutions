package chapter5_logic_and_loops;

/**
 * 18. Write a method called digitSum that accepts an
 * integer as a parameter and returns the sum of the digits of that
 * number.
 * For negative numbers, return the same value that would result
 * if the number were positive.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 4:07 PM
 */
class Ex5_18_digitSum {
  public static void main(String[] args) {
    System.out.println(digitSum(-456) + " => 15");
    System.out.println(digitSum(29107) + " => 19");
  }

  public static int digitSum(int n) {
    n = n < 0 ? -n : n;
    int sum = 0;

    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }

    return sum;
  }
}

