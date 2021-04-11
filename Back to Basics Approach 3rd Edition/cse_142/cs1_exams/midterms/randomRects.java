package cse_142.cs1_exams.midterms;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm4/randomRects
 *
 * test #1:test1
 * console output:
 * w: 5, h: 6, area: 30
 * w: 10, h: 5, area: 50
 * w: 2, h: 8, area: 16
 * w: 4, h: 4, area: 16
 * w: 2, h: 9, area: 18
 * w: 8, h: 3, area: 24
 * w: 7, h: 2, area: 14
 * w: 3, h: 10, area: 30
 * w: 7, h: 9, area: 63
 * w: 9, h: 8, area: 72
 * Four rectangles of increasing area.
 * result: pass
 *
 * test #2:test2
 * console output:
 * w: 5, h: 2, area: 10
 * w: 6, h: 5, area: 30
 * w: 7, h: 6, area: 42
 * w: 8, h: 10, area: 80
 * Four rectangles of increasing area.
 * result: pass
 *
 * @author Alex Golub
 * @since 10-Apr-21 1:25 PM
 */
class randomRects {
  public static void main(String[] args) {
    randomRects();
  }

  public static void randomRects() {
    Random random = new Random();
    int count = 0;
    int prevArea = 1; // 1 is the minimum area

    while (count < 4) {
      int w = 1 + random.nextInt(10);
      int h = 1 + random.nextInt(10);
      int currentArea = w * h;
      System.out.printf("w: %d, h: %d, area: %d\n", w, h, currentArea);

      if (currentArea > prevArea) {
        count++;
      } else {
        count = 1; // reset
      }

      prevArea = currentArea; // remember current area for the next iteration
    }

    System.out.println("Four rectangles of increasing area.");
  }
}
