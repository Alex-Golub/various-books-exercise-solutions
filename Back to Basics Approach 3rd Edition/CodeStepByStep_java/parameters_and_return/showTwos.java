package CodeStepByStep_java.parameters_and_return;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/showTwos
 *
 * Write a method named showTwos that shows the factors of 2 in a given integer.
 * Assume that your method is passed a number greater than 0.
 *
 * 7 = 7
 * 18 = 2 * 9
 * 68 = 2 * 2 * 17
 * 120 = 2 * 2 * 2 * 15
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 10:19 PM
 */
/*public*/ class showTwos {
  public static void main(String[] args) {
    showTwos(7);
    showTwos(18);
    showTwos(68);
    showTwos(120);
  }

  public static void showTwos(int n) {
    if (n % 2 != 0) {
      System.out.println(n + " = " + n);
      return;
    }

    System.out.print(n + " = 2");
    n /= 2;
    while (n % 2 == 0) {
      System.out.print(" * 2");
      n /= 2;
    }
    System.out.println(" * " + n);
  }
}
