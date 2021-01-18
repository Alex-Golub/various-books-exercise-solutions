package chapter8_classes;

/**
 * @author Mr.Dr.Professor
 * @since 17-Jan-21 1:14 PM
 */
// Represents a time span of hours and minutes elapsed.
// Class invariant: minutes < 60
class TimeSpan {
  private int hours;
  private int minutes;

  // Constructs a time span with the given interval.
  // pre: hours >= 0 && minutes >= 0
  public TimeSpan(int hours, int minutes) {
    this.hours = 0;
    this.minutes = 0;
    add(hours, minutes);
  }

  // Adds the given interval to this time span.
  // pre: hours >= 0 && minutes >= 0
  public void add(int hours, int minutes) {
    this.hours += hours;
    this.minutes += minutes;

    // convert each 60 minutes into one hour
    this.hours += this.minutes / 60;
    this.minutes = this.minutes % 60;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    TimeSpan timeSpan = (TimeSpan) o;
    return hours == timeSpan.hours && minutes == timeSpan.minutes;
  }

  // Returns a String for this time span such as "6h15m".
  public String toString() {
    return hours + "h" + minutes + "m";
  }

  // Ex8_7_addTimeSpan
  // Adds the given amount of time to this time span.
  public void add(TimeSpan span) {
    add(span.hours, span.minutes);
  }

  // Ex8_8_subtractTimeSpan
  public void subtract(TimeSpan span) {
    minutes -= span.minutes;
    hours -= span.hours;
    if (minutes < 0) {
      hours--;
      minutes += 60;
    }
  }

  // Ex8_9_scaleTimeSpan
  // Scales this time span by the given factor.
  // For example, 1 hour and 45 minutes scaled by 2 equals 3 hours and 30 minutes.
  // pre: factor >= 0
  public void scale(int factor) {
    if (factor < 0)
      throw new IllegalArgumentException("Negative factor: " + factor);

    int temp = minutes * factor;
    hours = hours * factor + temp / 60;
    minutes = temp % 60;
  }

}

