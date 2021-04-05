package cse_142.cs1_sections.section05_midterm_practice;

/**
 * https://practiceit.cs.washington.edu/problem/view/4194?categoryid=303
 *
 * ifElseMystery(5, 20);   =>  7 5
 * ifElseMystery(42, 42);  =>  43 41
 * ifElseMystery(6, 1);    =>  9 7
 * ifElseMystery(2, 0);    =>  3 -1
 * ifElseMystery(7, 10);   =>  9 7
 * ifElseMystery(4, 4);    =>  5 3
 *
 * @author Alex Golub
 * @since 04-Apr-21 9:36 AM
 */
class ifElseMystery {
  public static void ifElseMystery(int a, int b) {
    if (a > b || a % 2 == 0) {
      a++;
      b--;
    } else if (a % 2 == 1) {
      b = 0;
    }
    if (b == 0 && b != a) {
      a = a + 2;
      b = a - 2;
    }
    System.out.println(a + " " + b);
  }
}


