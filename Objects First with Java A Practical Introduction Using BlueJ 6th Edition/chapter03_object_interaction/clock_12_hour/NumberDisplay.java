package chapter3_object_interaction.clock_12_hour;

/**
 * The NumberDisplay class represents a digital number display that can hold
 * values from zero to a given limit. The limit can be specified when creating
 * the display. The values range from zero (inclusive) to limit-1. If used,
 * for example, for the seconds on a digital clock, the limit would be 60,
 * resulting in display values from 0 to 59. When incremented, the display
 * automatically rolls over to zero when reaching the limit.
 *
 * @author Mr.Dr.Professor
 * @since 27-Nov-20 2:50 PM
 */
public class NumberDisplay {
  private int limit;
  private int value;

  public NumberDisplay(int rollOverLimit) {
    limit = rollOverLimit;
    value = 0;
  }

  public int getValue() {
    return value;
  }

  public String getDisplayValue() {
    return String.format("%02d", value);
  }

  public void setValue(int replacementValue) {
    if ((replacementValue >= 0) && (replacementValue < limit)) {
      value = replacementValue;
    }
  }

  public void increment() {
    value = (value + 1) % limit;
  }
}
