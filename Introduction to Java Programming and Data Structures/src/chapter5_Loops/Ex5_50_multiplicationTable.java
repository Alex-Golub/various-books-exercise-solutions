package chapter5_Loops;

/**
 * *5.50 (Print multiplication table)
 *
 * @author Mr.Dr.Professor
 * @since 26-Jan-21 10:26 PM
 */
class Ex5_50_multiplicationTable {
  public static void main(String[] args) {
    final int FROM = 1;
    final int TO   = 9;
    System.out.print(" ");

    for (int i = FROM; i <= TO; i++) {
      System.out.printf("%5d", i);
    }

    System.out.println();

    for (int i = FROM; i <= TO; i++) {
      System.out.print(i);

      for (int j = FROM; j <= TO; j++) {
        System.out.printf("%5d", i * j);
      }

      System.out.println();
    }
  }
}
