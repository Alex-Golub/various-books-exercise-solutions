package chapter5_Control_Statements_Part_2;

/**
 * 5.24 (Diamond Printing Program)
 * Write an application that prints the following diamond shape.
 * You may use output statements that print a single asterisk (*),
 * a single space or a single newline character.
 * Maximize your use of repetition (with nested for statements), and minimize the
 * number of output statements.
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *
 * Created by ag on 12-Oct-20 12:51 PM 
 */
class Ex5_24_Diamond {
  public static void main(String[] args) {
    final int HEIGHT = 5; // change value to get bigger diamond

    // Upper pyramid algorithm:
    // 1. Determine pyramid height (line from top to base count number of *)
    // 2. No. of spaces in each level will be => HEIGHT - level
    // 3. No. of * at each level is odd no. thus in each level
    //    no. of * can be determined by => 2 * level - 1
    for (int row = 1; row <= HEIGHT; row++) {
      for (int i = 1; i <= HEIGHT - row; i++) System.out.print(" ");
      for (int j = 1; j <= 2 * row - 1; j++)  System.out.print("*");

      System.out.println();
    }


    // Upper pyramid reflection
    for (int row = HEIGHT - 1; row >= 1; row--) {
      for (int i = 1; i <= HEIGHT - row; i++) System.out.print(" ");
      for (int j = 1; j <= 2 * row - 1; j++)  System.out.print("*");

      System.out.println();
    }
  }
}