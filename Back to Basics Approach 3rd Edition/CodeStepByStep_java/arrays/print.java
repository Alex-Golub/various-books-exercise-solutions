package CodeStepByStep_java.arrays;

/**
 * Write a method named print that accepts an array of integers as a
 * parameter and prints them, one per line, in the format shown.
 * Your code should work for an array of any size.
 *
 * @author Mr.Dr.Professor
 * @since 12-Feb-21 4:30 PM
 */
class print {

  public static void print(int[] a) {
    for (int i = 0; i < a.length; i++)
      System.out.printf("element [%d] is %d\n", i, a[i]);
  }
}
