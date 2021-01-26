package chapter5_Loops;

/**
 * *5.15 (Display the ASCII character table)
 * Write a program that prints the characters in
 * the ASCII character table from ! to ~.
 * Display 10 characters per line. The ASCII
 * table is given in Appendix B.
 * Characters are separated by exactly one space.
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 8:50 PM
 */
class Ex5_16_asciiTable {
  public static void main(String[] args) {
    final int PER_LINE = 10;
    for (char c = '!', count = 0; c <= '~'; c++) {
      System.out.print(c);
      count++;
      if (count % PER_LINE == 0)
        System.out.println();
      else
        System.out.print(" ");
    }
  }
}
