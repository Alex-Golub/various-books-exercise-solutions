package cse_142.cs1_exams.finals;

/**
 * @author Alex Golub
 * @since 13-Apr-21 10:41 PM
 */
final class ClockTime {
  private int hour;
  private int minute;
  private String amPm;

  public ClockTime(int hour, int minute, String amPm) {
    this.hour = hour;
    this.minute = minute;
    this.amPm = amPm;
  }

  /**
   * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final11/toStandardTime
   *
   * ClockTime t2 = new ClockTime(24, 00, "hours");   // 12:00 AM
   * ClockTime t3 = new ClockTime( 0, 30, "hours");   // 12:30 AM
   * ClockTime t4 = new ClockTime(10, 35, "hours");   // 10:35 AM
   * ClockTime t5 = new ClockTime(12, 15, "hours");   // 12:15 PM
   * ClockTime t6 = new ClockTime(13, 00, "hours");   // 01:00 PM
   * ClockTime t7 = new ClockTime(19, 11, "hours");   // 07:11 PM
   * ClockTime t9 = new ClockTime(23, 59, "hours");   // 11:59 PM
   * ClockTime ta = new ClockTime( 9, 30, "AM");      // 09:30 AM
   * ClockTime tb = new ClockTime( 5, 01, "PM");      // 05:01 PM
   *
   * NB: Change amPm to label to pass tests
   */
  public void toStandardTime() {
    if ("hours".equals(amPm)) {
      if (hour == 0 || hour == 24) {
        hour = 12;
        amPm = "AM";
      } else if (hour < 12) {
        amPm = "AM";
      } else {
        amPm = "PM";
        if (hour > 12) {
          hour -= 12; // wrap back to 12 hours clock
        }
      }
    }
  }

  /**
   * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final9/isWorkTime
   *
   * The isWorkTime method returns true if the ClockTime object represents
   * a time during the normal "work day" from 9:00 AM to 5:00 PM, inclusive.
   * Any times outside that range would cause the method to return
   * a result of false.
   */
  public boolean isWorkTime() {
    return (hour >= 9 && hour <= 11 && amPm.equals("AM")) ||
           ((hour == 12 || hour < 5 || hour == 5 && minute == 0) && amPm.equals("PM"));
  }

  /**
   * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final5/advance
   */
  public void advance(int min) {
    minute += min;
    while (minute >= 60) { // subtract 60 minutes and add hours
      hour++;
      minute -= 60;

      if (hour == 12) {
        amPm = amPm.equalsIgnoreCase("AM") ? "PM" : "AM";
      } else if (hour > 12) {
        hour = 1;
      }
    }
  }

  // param is type long so that the advance problem itself works!
  public void advance(long minutes) {
    for (int i = 0; i < minutes; i++) {
      minute++;
      if (minute >= 60) {
        minute = 0;
        hour++;
        if (hour == 12) {
          amPm = (amPm.equalsIgnoreCase("AM") ? "PM" : "AM");
        } else if (hour > 12) {
          hour = 1;
        }
      }
    }
  }

  public final int getHour() {
    return hour;
  }

  public final int getMinute() {
    return minute;
  }

  public final String getAmPm() {
    return amPm;
  }

  public final String toString() {
    String result = hour + ":";
    if (minute < 10) {
      result += "0" + minute;
    } else {
      result += minute;
    }
    result += " " + amPm;
    return result;
  }

  public boolean equals(Object o) {
    if (o instanceof ClockTime) {
      ClockTime t = (ClockTime) o;
      return t.hour == this.hour &&
             t.minute == this.minute &&
             t.amPm.equals(this.amPm);
    } else {
      return false;
    }
  }
}
