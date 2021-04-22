package chapter10_arrayLists;

public class CalendarDate implements Comparable<CalendarDate> {
  private int month;
  private int day;
  private int year;

  public CalendarDate(int month, int day, int year) {
    this.month = month;
    this.day = day;
    this.year = year;
  }

  /**
   * Dates that occur chronologically earlier should be
   * considered "less" than dates that occur later.
   */
  @Override
  public int compareTo(CalendarDate o) {
    int diff = this.year - o.year;
    return diff != 0 ? diff : (this.month * 31 + this.day) - (o.month * 31 + o.day);
  }

  public int getMonth() {
    return this.month;
  }

  public int getDay() {
    return this.day;
  }

  public int getYear() {
    return year;
  }

  public String toString() {
    return String.format("%04d:%02d:%02d\n", getYear(), getMonth(), getDay());
  }
}
