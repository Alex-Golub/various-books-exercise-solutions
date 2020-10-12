package chapter5_Control_Statements_Part_2;

/**
 * 5.15 (Triangle Printing Program)
 *  Write an application that displays the following patterns separately, one below the other.
 *  Use for loops to generate the patterns.
 *  [Hint: The last two patterns require that each line begin with an appropriate number of blank spaces.]
 *
 *            (a)         (b)                 (c)               (d)
 *            *          **********          **********          *
 *            **          *********          *********          **
 *            ***          ********          ********          ***
 *            ****          *******          *******          ****
 *            *****          ******          ******          *****
 *            ******          *****          *****          ******
 *            *******          ****          ****          *******
 *            ********          ***          ***          ********
 *            *********          **          **          *********
 *            **********          *          *          **********
 *
 * Created by ag on 12-Jul-20 8:09 PM
 */
class Ex5_15_Triangles {
  public static void main(String[] args) {
    final int HEIGHT = 10;

    a(HEIGHT);
    System.out.println();
    b(HEIGHT);
    System.out.println();
    c(HEIGHT);
    System.out.println();
    d(HEIGHT);
  }

  private static void a(int n) {
    for (int i = 1; i <= n; i++) {
      for (int a = 1; a <= i; a++)    System.out.print("*");
      for (int s = n - i; s > 0; s--) System.out.print(" ");
      System.out.println();
    }
  }

  private static void b(int n) {
    for (int i = 0; i < n; i++) {
      for (int s = 0; s < i; s++) System.out.print(" ");
      for (int a = i; a < n; a++) System.out.print("*");
      System.out.println();
    }
  }

  private static void c(int n) {
    for (int i = 0; i < n; i++) {
      for (int a = 0; a < n - i; a++) System.out.print("*");
      for (int s = 0; s < i; s++)     System.out.print(" ");
      System.out.println();
    }
  }

  private static void d(int n) {
    for (int i = 0; i < n; i++) {
      for (int s = 0; s < n - i - 1; s++) System.out.print(" ");
      for (int a = 0; a <= i; a++)        System.out.print("*");
      System.out.println();
    }
  }
}
