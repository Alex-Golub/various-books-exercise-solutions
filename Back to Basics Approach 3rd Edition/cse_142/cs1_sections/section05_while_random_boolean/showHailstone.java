package cse_142.cs1_sections.section05_while_random_boolean;

/**
 * https://practiceit.cs.washington.edu/problem/view/4187?categoryid=302
 *
 * sequence for 3: 3, 10, 5, 16, 8, 4, 2, 1
 * sequence for 10: 10, 5, 16, 8, 4, 2, 1
 * sequence for 1: 1
 *
 * @author Alex Golub
 * @since 01-Apr-21 7:12 PM
 */
class showHailstone {
  public static void main(String[] args) {
    showHailstone(3);
    showHailstone(10);
    showHailstone(25);
    showHailstone(1);
  }

  public static void showHailstone(int n) {
    System.out.print("sequence for " + n + ": " + n);
    while (n > 1) {
      n = n % 2 == 1 ? 3 * n + 1 : n / 2;
      System.out.print(", " + n);
    }
    System.out.println();
  }
}
