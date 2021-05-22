package CodeStepByStep.java.recursion;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/digitSum
 *
 * @author Alex Golub
 * @since 03-May-21, 7:43 PM
 */
class digitSum {
  public static void main(String[] args) {
    System.out.println(digitSum(1729));
    System.out.println(digitSum(-1729)); // -19
  }
  
  public static int digitSum(int n) {
    return Math.abs(n) < 10 ? n : (n < 0 ? -1 : 1) * Math.abs(n) % 10 + digitSum(n / 10);
  }
}
