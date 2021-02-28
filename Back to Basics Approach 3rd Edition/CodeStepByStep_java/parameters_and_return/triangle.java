package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/triangle
 *
 * You may assume that the value passed for the size is at least 1.
 *
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 10:52 PM
 */
/*public*/ class triangle {
  public static void main(String[] args) {
    triangle(5);
  }

  public static void triangle(int n) {
    for (int i = 1; i <= n; i++) {

      // spaces
      for (int j = n; j > i; j--) {
        System.out.print(" ");
      }

      // asterisks
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
