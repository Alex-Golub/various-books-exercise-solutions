package org.mrdrprof.solutions.chapter9_Objects_and_Classes;

import java.util.Date;

/**
 * *9.3 (Use the Date class)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 12:14
 */
/*public*/ class Ex9_3_Use_Date_Class {
  public static void main(String[] args) {
    long elapsed = 10_000;
    Date date = new Date(elapsed);

    for (int i = 0; i < 8; i++) {
      System.out.printf("elapsed(mills) = %,-15d => %s\n",
                        elapsed, date.toString());
      elapsed *= 10;
      date.setTime(elapsed);
    }
  }
}
