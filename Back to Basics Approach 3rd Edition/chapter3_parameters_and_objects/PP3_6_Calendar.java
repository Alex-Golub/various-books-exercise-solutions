package chapter3_parameters_and_objects;

/**
 * 6. Write a program that produces calendars as output.
 * Given parameters to specify how many days are in the
 * month and what the date
 * of the first Sunday is in that month.
 * In the month shown below, these values are 31 and 6, respectively.
 *
 *   Sun    Mon    Tue    Wed    Thu    Fri    Sat
 * +------+------+------+------+------+------+------+
 * |      |      |   1  |   2  |   3  |   4  |   5  |
 * |   6  |   7  |   8  |   9  |  10  |  11  |  12  |
 * |  13  |  14  |  15  |  16  |  17  |  18  |  19  |
 * |  20  |  21  |  22  |  23  |  24  |  25  |  26  |
 * |  27  |  28  |  29  |  30  |  31  |      |      |
 * +------+------+------+------+------+------+------+
 *
 * @author Mr.Dr.Professor
 * @since 21-Nov-20 11:59 PM
 */
class PP3_6_Calendar { // FIXME
  public static void main(String[] args) {
    System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
    System.out.println("+------+------+------+------+------+------+------+");
    int monthDays   = 31;
    int firstSunday = 6;
    for (int i = firstSunday; i < monthDays; i += 7) {
      printLine(i + 7);
    }
    System.out.println("+------+------+------+------+------+------+------+");
  }

  public static void printLine(int to) {
    System.out.print("|");
    for (int i = to - 7; i < to; i++) {
      System.out.print(padded(i, 4) + "  |");
    }
    System.out.println();
  }

  public static String padded(int n, int width) {
    String s = "" + n;
    for (int i = s.length(); i < width; i++) {
      s = " " + s;
    }
    return s;
  }
}
