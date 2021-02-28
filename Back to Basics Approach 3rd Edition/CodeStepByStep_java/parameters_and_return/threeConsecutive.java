package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/threeConsecutive
 *
 * Write a method named threeConsecutive that accepts three integers
 * as parameters and returns true if they are three consecutive numbers;
 * that is, if the numbers can be arranged into an order such that their
 * values differ by exactly 1.
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 10:35 PM
 */
/*public*/ class threeConsecutive {
  public static void main(String[] args) {
    System.out.println(threeConsecutive(1, 2, 3) + " => " + true);
    System.out.println(threeConsecutive(3, 2, 4) + " => " + true);
    System.out.println(threeConsecutive(-10, -8, -9) + " => " + true);
    System.out.println(threeConsecutive(3, 5, 7) + " => " + false);
    System.out.println(threeConsecutive(1, 2, 2) + " => " + false);
    System.out.println(threeConsecutive(7, 7, 9) + " => " + false);
  }

  public static boolean threeConsecutive(int a, int b, int c) {
//    if (Math.abs(a - b) == 1) {
//      return Math.abs(Math.max(a, b) - c) == 1;
//    }
//
//    if (Math.abs(b - c) == 1) {
//      return Math.abs(Math.min(b, c) - a) == 1;
//    }
//
//    return false;

    int min = Math.min(a, Math.min(b, c));
    int max = Math.max(a, Math.max(b, c));
    return max - min == 2 && a != b && a != c && b != c;
  }
}
