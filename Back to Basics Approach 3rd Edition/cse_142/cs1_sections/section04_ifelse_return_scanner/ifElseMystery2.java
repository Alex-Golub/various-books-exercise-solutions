package cse_142.cs1_sections.section04_ifelse_return_scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section4/ifElseMystery2
 *
 * mystery2(20, 4);  => 5 4
 * mystery2(7, 6);   => 7 3
 * mystery2(14, 7);  => 2 5
 * mystery2(24, 8);  => 3 5
 * mystery2(13, 9);  => 4 9
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:27 PM
 */
class ifElseMystery2 {
  public static void mystery2(int a, int b) {
    if (a % b == 0) {
      a = a / b;
      if (a < b) {
        b = b - a;
      }
    } else if (b % 2 == 0) {
      b = b / 2;
    } else {
      a = a - b;
    }
    System.out.println(a + " " + b);
  }
}
