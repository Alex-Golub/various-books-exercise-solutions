package cse_142.cs1_sections.section01_printing_methods;

/**
 * https://practiceit.cs.washington.edu/problem/view/3590?categoryid=301
 *
 * *****
 * *****
 *  * *
 *   *
 *  * *
 *
 * *****
 * *****
 *  * *
 *   *
 *  * *
 * *****
 * *****
 *
 *   *
 *   *
 *   *
 * *****
 * *****
 *  * *
 *   *
 *  * *
 *
 * @author Alex Golub
 * @since 01-Apr-21 3:38 PM
 */
public class StarFigures {
  public static void main(String[] args) {
    twoLines();
    x();
    System.out.println();
    twoLines();
    x();
    twoLines();
    System.out.println();
    verticalLine();
    twoLines();
    x();
  }

  public static void twoLines() {
    System.out.println("*****");
    System.out.println("*****");
  }

  public static void x() {
    System.out.println(" * *");
    System.out.println("  *");
    System.out.println(" * *");
  }

  public static void verticalLine() {
    System.out.println("  *");
    System.out.println("  *");
    System.out.println("  *");
  }
}
