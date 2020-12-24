package chapter5_logic_and_loops;

/**
 * 14. Write a method called hasMidpoint that accepts three
 * integers as parameters and returns true if one of the integers is
 * the midpoint between the other two integers; that is,
 * if one integer is exactly halfway between them.
 * <p>
 * NOTE: The integers could be passed in any order;
 * the midpoint could be the 1st, 2nd, or 3rd
 * If your method is passed three of the same value, return true.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 2:13 PM
 */
class Ex5_14_hasMidpoint {
  public static void main(String[] args) {
    System.out.println(hasMidpoint(7, 4, 10));
    System.out.println(hasMidpoint(9, 15, 8));
    System.out.println(hasMidpoint(1, 1, 1));
  }

  public static boolean hasMidpoint(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));
    int mid = a + b + c - (max + min);

    return max - mid == mid - min;
  }
}
