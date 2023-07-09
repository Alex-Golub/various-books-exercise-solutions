package org.mrdrprof.solutions.chapter5_Loops;

/**
 * @author Mr.Dr.Professor
 * @since 20-Jan-21 6:14 PM
 */
class MultiplicationTable {
  public static void main(String[] args) {
    System.out.println("Multiplication Table");

    for (int i = 1; i <= 9; i++)
      System.out.print("    " + i);

    System.out.println("\n" + "-".repeat(46));

    for (int i = 1; i <= 9; i++) {
      System.out.print(i + " | ");
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%-5d", i * j);
      }
      System.out.println();
    }

  }
}
