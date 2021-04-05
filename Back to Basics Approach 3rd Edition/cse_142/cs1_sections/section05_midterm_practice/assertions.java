package cse_142.cs1_sections.section05_midterm_practice;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/sections/section5.5/assertions
 *
 *           |   y == 0      |   y % 2 == 0   |   z == 0
 * POINT A   |   NEVER       |   ALWAYS       |   ALWAYS
 * POINT B   |   NEVER       |   ALWAYS       |   SOMETIMES
 * POINT C   |   SOMETIMES   |   ALWAYS       |   NEVER
 * POINT D   |   NEVER       |   NEVER        |   SOMETIMES
 * POINT E   |   ALWAYS      |   ALWAYS       |   SOMETIMES
 *
 * @author Alex Golub
 * @since 04-Apr-21 9:46 AM
 */
class assertions {
  public static void mystery(Scanner console) {
    int y = 42;
    int z = 0;
    // Point A
    while (y != 0) {
      // Point B
      y = console.nextInt();
      if (y % 2 == 0) {
        z++;
        // Point C
        y--;
      }
      // Point D
      y--;
    }
    // Point E
    System.out.println("z = " + z);
  }
}
