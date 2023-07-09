package org.mrdrprof.solutions.chapter4_Math_Characters_Strings;

/**
 * 4.16 (Random character)
 * Write a program that displays a random lowercase letter.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 4:17 PM
 */
class Ex4_16_RandomChar {
  public static void main(String[] args) {
    int TIMES = 110;

    for (int i = 1; i <= TIMES; i++) {
      // 'a' = 97, 'z' = 122
      // 'z' - 'a' + 1 = 122 - 97 + 1 = 26
      // 'a' + [0, 26)
      // => [97 + 0, 97 + 26)
      // => [97, 123) <=> ['a', 'z']
      char c = (char) ('a' + (Math.random() * ('z' - 'a' + 1)));
      System.out.print(c + " ");

      // line break every 10 characters
      if (i % 10 == 0) System.out.println();
    }
  }
}
