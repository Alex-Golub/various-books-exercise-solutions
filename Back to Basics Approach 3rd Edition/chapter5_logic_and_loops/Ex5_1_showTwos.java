package chapter5_logic_and_loops;

/**
 * 1. Write a method called showTwos that shows the factors of
 * 2 in a given integer.
 *
 * @author Mr.Dr.Professor
 * @since 19-Dec-20 5:21 PM
 */
class Ex5_1_showTwos {
  public static void main(String[] args) {
    showTwos(-2);
    showTwos(-1);
    showTwos(0); // imported corner case
    showTwos(1);
    showTwos(2);

    showTwos(7);
    showTwos(18);
    showTwos(68);
    showTwos(120);
  }

  public static void showTwos(int n) {
    System.out.print(n + " = ");
    while (n != 0 && n % 2 == 0) {
      System.out.print("2 * ");
      n /= 2;
    }
    System.out.println(n);
  }
}
