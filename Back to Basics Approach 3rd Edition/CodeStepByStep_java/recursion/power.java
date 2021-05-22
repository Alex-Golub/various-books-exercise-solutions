package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/power
 *
 * @author Alex Golub
 * @since 12-May-21, 1:08 PM
 */
class power {
  public static void main(String[] args) {
    System.out.println(power(3, 4));
  }
  
  public static int power(int a, int b) {
    if (b < 0) {
      throw new IllegalArgumentException();
    } else if (b == 0) {
      return 1;
    } else if (b % 2 == 0) {
      return power(a * a, b / 2);
    } else {
      return a * power(a, b - 1);
    }
  }
}
