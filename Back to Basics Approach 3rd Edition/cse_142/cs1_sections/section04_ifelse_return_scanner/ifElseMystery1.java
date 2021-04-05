package cse_142.cs1_sections.section04_ifelse_return_scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section4/ifElseMystery1
 *
 * mystery1(8)  => 8 6
 * mystery1(-3) => -3 4
 * mystery1(1)  => 1 3
 * mystery1(0)  => 0 0
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:24 PM
 */
class ifElseMystery1 {
  public static void mystery1(int n) {
    System.out.print(n + " ");
    if (n > 0) {
      n = n - 5;
    }
    if (n < 0) {
      n = n + 7;
    } else {
      n = n * 2;
    }

    System.out.println(n);
  }
}
