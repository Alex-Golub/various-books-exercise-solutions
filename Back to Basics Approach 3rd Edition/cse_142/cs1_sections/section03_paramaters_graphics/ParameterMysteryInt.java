package cse_142.cs1_sections.section03_paramaters_graphics;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section3/ParameterMysteryInt
 *
 * mystery(a, b, c);              => -2 + 4 = 7
 * mystery(c, 3, a);              => 4 + -2 = 3
 * mystery(a + b, b + c, c + a);  => 2 + 11 = 5
 *
 * @author Alex Golub
 * @since 01-Apr-21 5:18 PM
 */
public class ParameterMysteryInt {
  public static void main(String[] args) {
    int a = 4;
    int b = 7;
    int c = -2;
    mystery(a, b, c);
    mystery(c, 3, a);
    mystery(a + b, b + c, c + a);
  }

  public static void mystery(int c, int a, int b) {
    System.out.println(b + " + " + c + " = " + a);
  }
}
