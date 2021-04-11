package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm10/largerDigits
 *
 * You may assume that a and b are positive integers (greater than 0).
 *
 * @author Alex Golub
 * @since 11-Apr-21 7:44 PM
 */
class largerDigits {
  public static void main(String[] args) {
    System.out.println(largerDigits(172, 312) + " => " + 372);
    System.out.println(largerDigits(21, 3) + " => " + 3);
    System.out.println(largerDigits(90, 38906735) + " => " + 95);
    System.out.println(largerDigits(56002, 123321) + " => " + 56322);
    System.out.println(largerDigits(11223, 4466) + " => " + 4466);
    System.out.println(largerDigits(12345, 12345) + " => " + 12345);
    System.out.println(largerDigits(1, 34892) + " => " + 2);
  }

  public static int largerDigits(int a, int b) {
    int result = 0;
    int multiplier = 1;

    while (a != 0 && b != 0) {
      int digit = Math.max(a % 10, b % 10);
      result = digit * multiplier + result;

      a /= 10;
      b /= 10;
      multiplier *= 10;
    }

    return result;
  }
}
