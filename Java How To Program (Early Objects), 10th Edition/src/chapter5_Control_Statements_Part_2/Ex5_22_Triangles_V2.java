package chapter5_Control_Statements_Part_2;

/**
 * 5.22 (Modified Triangle Printing Program)
 * Modify Exercise 5.15 to combine your code from the four separate triangles
 * of asterisks such that all four patterns print side by side.
 * [Hint: Make clever use of nested for loops.]
 *
 * Created by ag on 25-Sep-20 5:43 PM 
 */
class Ex5_22_Triangles_V2 {
  public static void main(String[] args) {
    final int HEIGHT = 10;
    final int SPACES = 10;

    for (int row = 1; row <= HEIGHT; ++row) {
      // Triangle a
      for (int ast = 1; ast <= row; ast++)           System.out.print("*");
      for (int spc = 1; spc <= SPACES; ++spc)        System.out.print(" ");

      // Triangle b
      for (int ast = HEIGHT - row; ast >= 0; ast--)  System.out.print("*");
      for (int spc = 1; spc <= SPACES; ++spc)        System.out.print(" ");

      // Triangle c
      for (int ast = HEIGHT - row; ast >= 0; ast--)  System.out.print("*");
      for (int spc = 1; spc <= SPACES; ++spc)        System.out.print(" ");

      // Triangle d
      for (int ast = 1; ast <= row; ast++)           System.out.print("*");

      System.out.println();
    }
  }
}
