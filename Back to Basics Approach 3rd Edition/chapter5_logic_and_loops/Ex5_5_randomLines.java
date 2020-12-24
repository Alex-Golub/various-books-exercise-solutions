package chapter5_logic_and_loops;

import java.util.Random;

/**
 * 5. Write a method called randomLines that prints between
 * 5 and 10 random strings of letters (between “a” and “z”),
 * one per line. Each string should have random length of
 * up to 80 characters.
 *
 * @author Mr.Dr.Professor
 * @since 19-Dec-20 7:00 PM
 */
class Ex5_5_randomLines {
  public static void main(String[] args) {
    randomLines();
  }

  public static void randomLines() {
    Random    rnd   = new Random();
    final int UP_TO = 80;
    int       n     = rnd.nextInt(6) + 5; // [0, 5] + 5 = [5, 10]

    for (int i = 0; i < n; i++)
      printRandomString(rnd.nextInt(UP_TO));
  }

  // print line or length n with random alphabet characters
  public static void printRandomString(int n) {
    Random rnd = new Random();
    for (int i = 0; i < n; i++) {
      // [0, 25] + 97 = [97, 122] which is the
      // range of lowercase alphabet in ASCII table
      char rndChar = (char) (rnd.nextInt('z' - 'a' + 1) + 'a');
      System.out.print(rndChar);
    }
    System.out.println();
  }
}
