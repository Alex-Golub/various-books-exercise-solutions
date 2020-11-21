package chapter3_parameters_and_objects;

/**
 * 7. Write a variation of the largestAbsVal method from the last exercise
 * that takes three integers as parameters and
 * returns the largest of their three absolute values.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 5:37 PM
 */
class Ex3_7_largestAbsVal2 {
  public static void main(String[] args) {
    System.out.println(largestAbsVal(-1, -34, -72));
    System.out.println(largestAbsVal(0, 0, 0));
  }

  public static int largestAbsVal(int a, int b, int c) {
    return Math.max(Math.abs(a), Math.max(Math.abs(b), Math.abs(c)));
  }
}
