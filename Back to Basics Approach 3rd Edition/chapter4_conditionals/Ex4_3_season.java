package chapter4_conditionals;

/**
 * 3. Write a method called season that takes as parameters two integers
 * representing a month and day and returns a String indicating the season for
 * that month and day.
 * Assume that the month is specified as an integer
 * between 1 and 12 (1 for January, 2 for February, and so on) and that the
 * day of the month is a number between 1 and 31.
 * If the date falls between 12/16 and 3/15, the method should return "winter".
 * If the date falls between 3/16 and 6/15, the method should return "spring".
 * If the date falls between 6/16 and 9/15, the method should return "summer".
 * if the date falls between 9/16 and 12/15, the method should return "fall".
 *
 * @author Mr.Dr.Professor
 * @since 10-Dec-20 12:58 PM
 */
class Ex4_3_season {
  public static void main(String[] args) {
    System.out.println(season(12, 16));
    System.out.println(season(1, 5));
    System.out.println(season(2, 31));
    System.out.println(season(3, 14));

    System.out.println("====");

    System.out.println(season(3, 16));
    System.out.println(season(4, 1));
    System.out.println(season(4, 15));
    System.out.println(season(4, 31));
    System.out.println(season(5, 15));
    System.out.println(season(5, 30));
    System.out.println(season(6, 15));

    System.out.println("====");

    System.out.println(season(6, 16));
    System.out.println(season(7, 1));
    System.out.println(season(7, 15));
    System.out.println(season(7, 31));
    System.out.println(season(8, 15));
    System.out.println(season(8, 30));
    System.out.println(season(9, 15));

    System.out.println("====");
  }

  public static String season(int m, int d) {
    if (m == 12 && d >= 16 || m < 3 || m == 3 && d <= 15)
      return "Winter";
    if (m < 6 || m == 6 && d <= 15)
      return "Spring";
    if (m < 9 || m == 9 && d <= 15)
      return "Summer";
    return "Fall";
  }
}
