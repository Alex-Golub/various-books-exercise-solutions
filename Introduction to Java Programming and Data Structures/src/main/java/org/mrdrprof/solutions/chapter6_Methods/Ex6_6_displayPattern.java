package org.mrdrprof.solutions.chapter6_Methods;

/**
 * *6.6 (Display patterns)
 * 1
 * 1 2
 * 1 2 3
 * ...
 * n n-1 n-2 ... 3 2 1
 *
 * @author Mr.Dr.Professor
 * @since 28-Jan-21 12:56 PM
 */
class Ex6_6_displayPattern {
  public static void main(String[] args) {
    displayPattern(10);
  }

  public static void displayPattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
        if (j + 1 <= i)
          System.out.print(" ");
        else
          System.out.println();
      }
    }
  }
}
