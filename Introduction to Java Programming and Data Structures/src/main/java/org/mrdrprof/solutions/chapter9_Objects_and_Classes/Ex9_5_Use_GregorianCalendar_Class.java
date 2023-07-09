package org.mrdrprof.solutions.chapter9_Objects_and_Classes;

import java.util.GregorianCalendar;

/**
 * *9.5 (Use the GregorianCalendar class)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 12:27
 */
/*public*/ class Ex9_5_Use_GregorianCalendar_Class {
  static final int DAY = 0, MONTH = 1, YEAR = 2;

  public static void main(String[] args) {
    GregorianCalendar calendar = new GregorianCalendar();
    int[] arr = getDayMonthAndYear(calendar);
    System.out.printf("%02d/%02d/%d\n", arr[DAY], arr[MONTH], arr[YEAR]);

    calendar.setTimeInMillis(1234567898765L);
    arr = getDayMonthAndYear(calendar);
    System.out.printf("%02d/%02d/%d\n", arr[DAY], arr[MONTH], arr[YEAR]);
  }

  private static int[] getDayMonthAndYear(GregorianCalendar calendar) {
    return new int[]{
            calendar.get(GregorianCalendar.DAY_OF_MONTH),
            calendar.get(GregorianCalendar.MONTH) + 1,
            calendar.get(GregorianCalendar.YEAR),
            };
  }
}
