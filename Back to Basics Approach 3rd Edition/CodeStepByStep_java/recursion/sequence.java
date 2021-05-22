package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/sequence
 * <p>
 * The order of the numbers should begin with all of the evens in downward order,
 * followed by all of the odds upward from 1.
 * Each time a number is added to the pattern, a new set of parentheses and a
 * plus sign are added to the pattern.
 *
 * @author Alex Golub
 * @since 09-May-21, 3:36 PM
 */
class sequence {
  public static void main(String[] args) {
    sequence(1);
    System.out.println();
    sequence(2); // (2 + 1)
    System.out.println();
    sequence(3); // ((2 + 1) + 3)
    System.out.println();
    sequence(4); // (4 + ((2 + 1) + 3))
  }
  
  public static void sequence(int k) {
    if (k < 1) {
      throw new IllegalArgumentException();
    } else if (k == 1) {
      System.out.print(k);
    } else if (k % 2 == 0) {
      System.out.print("(" + k + " + ");
      sequence(k - 1);
      System.out.print(")");
    } else {
      System.out.print("(");
      sequence(k - 1);
      System.out.print(" + " + k + ")");
    }
  }
}
