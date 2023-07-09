package org.mrdrprof.solutions.chapter10_Object_Oriented_Thinking;

/**
 * *10.1 (The Time class)
 *
 * @author Mr.Dr.Professor
 * @since 3/22/2021 6:54 PM
 */
/*public*/ class Time {
  private int hour;
  private int minute;
  private int second;

  /** creates a Time object for the current time */
  public Time() {
    setTime(System.currentTimeMillis());
  }

  /** constructs a Time object with a specified elapsed time
   since midnight, January 1, 1970, in milliseconds. */
  public Time(long elapsedTime) {
    if (elapsedTime < 0) {
      throw new IllegalArgumentException("elapsedTime can't be negative value, got: " + elapsedTime);
    }

    setTime(elapsedTime);
  }

  /** constructs a Time object with the specified hour, minute, and second */
  public Time(int hour, int minute, int second) {
    isValid(hour, minute, second);

    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  private void isValid(int hour, int minute, int second) {
    if (hour < 0 || hour > 23) {
      throw new IllegalArgumentException("Invalid hour value, range 0-23, got: " + hour);
    }

    if (minute < 0 || minute > 59) {
      throw new IllegalArgumentException("Invalid minute value, range 0-59, got: " + minute);
    }

    if (second < 0 || second > 59) {
      throw new IllegalArgumentException("Invalid second value, range 0-59, got: " + second);
    }
  }

  /** sets a new time for the object using the elapsed time */
  public void setTime(long elapsedTime) {
    elapsedTime /= 1000; // convert from milli-seconds to seconds
    second = (int) elapsedTime % 60;

    long totalMinutes = elapsedTime / 60;
    minute = (int) totalMinutes % 60;

    long totalHours = totalMinutes / 60 + 2; // (GMT+2) Time in Israel
    hour = (int) totalHours % 24;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

  public static void main(String[] args) {
    Time time1 = new Time();
    System.out.println(time1);

    Time time2 = new Time(System.currentTimeMillis());
    System.out.println(time2); // same as time1

    Time time3 = new Time(5, 24, 55);
    System.out.println(time3); // same as time1

//    Time errorTime = new Time(5, 5, 60);
//    Time t = new Time(-15123123);
  }
}
