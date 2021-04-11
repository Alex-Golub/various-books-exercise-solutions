package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm12/highLow
 *
 * @author Alex Golub
 * @since 11-Apr-21 8:37 PM
 */
class highLow {
  public static void main(String[] args) {
    System.out.println(highLow(1918193)	== true);
    System.out.println(highLow(7283)	== true);
    System.out.println(highLow(3827)	== true);
    System.out.println(highLow(9388)	== false);
    System.out.println(highLow(895151)	== false);
    System.out.println(highLow(707)	== true);
    System.out.println(highLow(44)	== false);
    System.out.println(highLow(45)	== true);
    System.out.println(highLow(5) == true);
  }

  /** 0 through 4 are "low" digits and 5 through 9 are "high" digits */
  public static boolean highLow(int n) {
    int digit = n % 10;
    boolean low = digit <= 4;
    n /= 10;

    while (n != 0) {
      digit = n % 10;

      if ((digit <= 4 && low) || (digit > 5 && !low)) {
        return false;
      }

      low = !low;
      n /= 10;
    }

    return true;
  }
}
