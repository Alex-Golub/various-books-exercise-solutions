package chapter3_parameters_and_objects;

/**
 * 6. Write a method called largerAbsVal that takes two integers as
 * parameters and returns the larger of the two absolute values.
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 5:32 PM
 */
class Ex3_6_largerAbsVal {
  public static void main(String[] args) {
    System.out.println(largerAbsVal(11, 2));
    System.out.println(largerAbsVal(4, -5));
    System.out.println(largerAbsVal(5, 5));
    System.out.println(largerAbsVal(-11, 0));
  }

  public static int largerAbsVal(int a, int b) {
    return Math.max(Math.abs(a), Math.abs(b));
  }
}
