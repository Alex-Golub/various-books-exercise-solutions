package chapter5_logic_and_loops;

/**
 * 13. Write a method called consecutive that accepts three integers
 * as parameters and returns true if they are three
 * consecutive numbers—that is, if the numbers can be arranged into
 * an order such that, assuming some integer k, the
 * parameters’ values are k, k + 1, and k + 2. Your method should
 * return false if the integers are not consecutive. Note
 * that order is not significant; your method should return the same
 * result for the same three integers passed in any order.
 *
 * @author Mr.Dr.Professor
 * @since 21-Dec-20 1:46 PM
 */
class Ex5_13_consecutive {
  public static void main(String[] args) {
    // true
    System.out.println(consecutive(1, 2, 3));
    System.out.println(consecutive(3, 2, 4));
    System.out.println(consecutive(-10, -8, -9));

    System.out.println();

    // false
    System.out.println(consecutive(3, 5, 7));
    System.out.println(consecutive(1, 2, 2));
    System.out.println(consecutive(7, 7, 9));
  }

  public static boolean consecutive(int a, int b, int c) {
    int max = Math.max(a, Math.max(b, c));
    int min = Math.min(a, Math.min(b, c));
    return max - min == 2 && a != b && b != c && a != c;

    // Another approach
//    int mid = a + b + c - (max + min);
//    return max == mid + 1 && min == mid - 1;
  }
}
