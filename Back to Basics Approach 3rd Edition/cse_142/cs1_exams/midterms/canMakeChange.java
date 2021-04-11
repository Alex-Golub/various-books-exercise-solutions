package cse_142.cs1_exams.midterms;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm5/canMakeChange
 *
 * pennies (1-cent coins)
 * nickels (5-cent coins)
 *
 * @author Alex Golub
 * @since 10-Apr-21 2:04 PM
 */
class canMakeChange {
  public static void main(String[] args) {
    System.out.println(canMakeChange(3, 4, 12) == true);
    System.out.println(canMakeChange(1, 5, 26) == true);
    System.out.println(canMakeChange(24, 2, 31) == true);
    System.out.println(canMakeChange(87, 19, 134) == true);
    System.out.println(canMakeChange(0, 0, 0) == true);
    System.out.println(canMakeChange(1, 1, 9) == false);
    System.out.println(canMakeChange(2, 7, 8) == false);
    System.out.println(canMakeChange(4, 3, 39) == false);
    System.out.println(canMakeChange(3, 80, 14) == false);
  }

  /**
   * The method should return true if the coins in the register could be
   * used to produce this exact amount of change, and false if not.
   * NB: You may assume that no negative parameter values are passed
   */
  public static boolean canMakeChange(int pennies, int nickels, int change) {
    return pennies + 5 * Math.min(nickels, change / 5) >= change;
  }
}
