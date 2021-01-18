package CodeStepByStep_java.classes_and_objects;

/**
 * Ignore leap years and don't store the year in your object.
 *
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 2:10 PM
 */
public class Date {
  private int month;
  private int day;

  public Date(int month, int day) {
    setMonth(month);
    setDay(day);
  }

  private void setDay(int day) {
    if (day < 1 || day > daysInMonth())
      throw new IllegalArgumentException("Illegal day: " + day);
    this.day = day;
  }

  private void setMonth(int month) {
    if (month < 1 || month > 12)
      throw new IllegalArgumentException("Illegal month: " + month);
    this.month = month;
  }

  private int daysInMonth() {
    if (month == 4 || month == 6 || month == 9 || month == 11)
      return 30;
    if (month == 2)
      return 28;
    return 31;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public void nextDay() {
    day++;
    if (day > daysInMonth()) {
      // 1. 31/1 -> 01/02 i.e. wrap to next month
      day = 1;
      month++;
      if (month > 12) {
        // 3. 31/12 -> 01/01 i.e. wrap to next year
        month = 1;
      }
    }
    // 2. 30/1 -> 31/01
  }

  // return the "absolute day of the year" between 1 and 365
  // represented by the Date object
  public int absoluteDay() {
    int absDay = 1;
    for (int m = 1; m < month; m++) {
      if (m == 4 || m == 6 || m == 9 || m == 11)
        absDay += 30;
      else if (m == 2)
        absDay += 28;
      else
        absDay += 31;
    }
    return absDay + day;
  }

  public String toString() {
    return String.format("%02d/%02d", month, day);
  }
}
