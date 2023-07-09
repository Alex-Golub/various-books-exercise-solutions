package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * *10.14 (The MyDate class)
 *
 * @author Mr.Dr.Professor
 * @since 24-Mar-21 10:45 PM
 */
/*public*/ class MyDate {
  private int year;
  private int month;
  private int day;

  /** creates a MyDate object for the current date. */
  public MyDate() {
    setDate(System.currentTimeMillis());
  }

  /** constructs a MyDate object with a specified elapsed time
   since midnight, January 1, 1970, in milliseconds. */
  public MyDate(long elapsedTime) {
    setDate(elapsedTime);
  }

  public MyDate(int year, int month, int day) {
    isValid(year, month, day);

    this.year = year;
    this.month = month;
    this.day = day;
  }

  /** validate correctness of MyDate parameters before initializing fields */
  private void isValid(int year, int month, int day) {
    if (year <= 0) {
      throw new IllegalStateException("Year can't be zero or negative value, got: " + year);
    }

    if (month <= 0 || month > 12) {
      throw new IllegalStateException("Month not in range [1-12], got: " + month);
    }

    if (day <= 0) {
      throw new IllegalStateException("Day can't be negative value, got: " + day);
    }

    int daysInMonth;
    switch (month) {
      case 4: case 6: case 9: case 11:
        daysInMonth = 30;
        break;
      case 2:
        daysInMonth = Year.isLeap(year) ? 29 : 28;
        break;
      default:
        daysInMonth = 31;
        break;
    }

    if (day > daysInMonth) {
      throw new IllegalStateException("Day is not in range of days of " +
                                      "this month [0-" + daysInMonth + "], got: " + day);
    }
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  /** sets a new date for the object using the elapsed time */
  public void setDate(long elapsedTime) {
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.setTimeInMillis(elapsedTime);

    year = calendar.get(Calendar.YEAR);
    month = calendar.get(Calendar.MONTH) + 1; // NB: base 1
    day = calendar.get(Calendar.DAY_OF_MONTH);
  }

  public String toString() {
    return String.format("%02d-%02d-%04d", day, month, year);
  }

  public static void main(String[] args) {
    MyDate date = new MyDate(System.currentTimeMillis());
    System.out.println(date);
    MyDate myDate = new MyDate(2021, 12, 30);
    System.out.println(myDate);

    myDate.setDate(561555550000L);
    System.out.println(myDate);
  }

}
