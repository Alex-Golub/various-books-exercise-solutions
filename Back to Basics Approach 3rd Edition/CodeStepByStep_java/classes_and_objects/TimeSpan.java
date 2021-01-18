package CodeStepByStep_java.classes_and_objects;

/**
 * @author Mr.Dr.Professor
 * @since 18-Jan-21 4:21 PM
 */
class TimeSpan {
  private int totalMinutes;

  public TimeSpan(int hours, int minutes) {
    totalMinutes = hours * 60 + minutes;
  }

  public int getHours() {
    return totalMinutes / 60;
  }

  public int getMinutes() {
    return totalMinutes % 60;
  }

  // pre: hours > 0; 0 <= minutes <= 59
  public void add(int hours, int minutes) {
    totalMinutes += hours * 60 + minutes;
  }

  public void add(TimeSpan span) {
    totalMinutes += span.totalMinutes;
  }

  // Returns the total time in this time span as the real number of hours,
  // such as 9.75 for (9 hours, 45 min)
  public double getTotalHours() {
    return totalMinutes / 60.0;
  }

  public String toString() {
    return getHours() + "h" + getMinutes() + "m";
  }
}
