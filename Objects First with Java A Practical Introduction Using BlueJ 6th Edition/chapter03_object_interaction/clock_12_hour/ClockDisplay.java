package chapter3_object_interaction.clock_12_hour;

/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 12 hour clock. The clock shows hours and minutes. The
 * range of the clock is 00:00 to 12:59.
 * <p>
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 *
 * @author Mr.Dr.Professor
 * @since 27-Nov-20 7:43 PM
 */
public class ClockDisplay {
  private NumberDisplay hours;
  private NumberDisplay minutes;
  private String        displayString;

  public ClockDisplay() {
    hours = new NumberDisplay(24);
    minutes = new NumberDisplay(60);
    updateDisplay();
  }

  public ClockDisplay(int hour, int minute) {
    hours = new NumberDisplay(24);
    minutes = new NumberDisplay(60);
    setTime(hour, minute);
  }

  public void timeTick() {
    minutes.increment();
    if (minutes.getValue() == 0) {
      if (hours.getValue() + 1 == 13)
        hours.setValue(0);
      hours.increment();
    }
    updateDisplay();
  }

  public void setTime(int hour, int minute) {
    hours.setValue(hour);
    minutes.setValue(minute);
    updateDisplay();
  }

  public String getTime() {
    return displayString;
  }

  private void updateDisplay() {
    displayString = hours.getValue() % 13 + ":" +
            minutes.getDisplayValue();
  }
}
