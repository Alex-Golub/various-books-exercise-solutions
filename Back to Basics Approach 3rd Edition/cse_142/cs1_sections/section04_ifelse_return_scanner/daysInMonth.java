package cse_142.cs1_sections.section04_ifelse_return_scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/544?categoryid=118
 *
 * @author Alex Golub
 * @since 01-Apr-21 6:36 PM
 */
class daysInMonth {
  public static int daysInMonth(int month) {
    switch (month) {
      case 4: case 6: case 9: case 11:
        return 30;
      case 2:
        return 28;
    }

    return 31;
  }
}
