package chapter5_logic_and_loops;

/**
 * 15. Write a method called dominant that accepts three
 * integers as parameters and returns true if any one of the three
 * integers is larger than the sum of the other two integers.
 * <p>
 * NOTES: Assume that none of the numbers is negative.
 * The integers might be passed in any order,
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 2:20 PM
 */
class Ex5_15_dominant {
  public static void main(String[] args) {
    System.out.println(dominant(4, 9, 2));
  }

  public static boolean dominant(int a, int b, int c) {
    return a + b + c < 2 * Math.max(a, Math.max(b, c));
  }
}
