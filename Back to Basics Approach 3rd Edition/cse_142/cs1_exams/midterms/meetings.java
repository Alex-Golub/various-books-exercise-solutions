package cse_142.cs1_exams.midterms;

import java.util.Random;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/misc/meetings
 *
 * @author Alex Golub
 * @since 11-Apr-21 9:46 PM
 */
class meetings {
  public static void main(String[] args) {
    meetings(2, 17);
  }

  public static void meetings(int h, int m) {
    Random random = new Random();
    System.out.printf("%dh %dm start time\n", h, m);

    while (true) {
      int add = random.nextInt(16) + 15; // 15 - 30 random meeting length

      m += add;
      if (m > 59) { // wrap to next hour
        m = m % 60;
        h++;
        if (h > 12) {
          h = 1;
        }
      }

      System.out.printf("%dh %dm after %d-min meeting\n", h, m, add);

      if (m >= 55 || m <= 5) { // within +- 5 minutes of round hour
        break;
      }
    }
  }
}
