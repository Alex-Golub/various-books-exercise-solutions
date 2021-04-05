package cse_142.cs1_sections.section05_while_random_boolean;

/**
 * https://practiceit.cs.washington.edu/problem/view/3805?categoryid=302
 *
 * showTwos(7);   => 7 = 7
 * showTwos(18);  => 18 = 2 * 9
 * showTwos(68);  => 68 = 2 * 2 * 17
 * showTwos(120); => 120 = 2 * 2 * 2 * 15
 *
 * @author Alex Golub
 * @since 01-Apr-21 7:08 PM
 */
class showTwos {
  public static void showTwos(int n) {
    System.out.print(n + " = ");
    while (n != 0 && n % 2 == 0) {
      System.out.print("2 * ");
      n /= 2;
    }
    System.out.println(n);
  }
}
