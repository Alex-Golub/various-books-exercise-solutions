package chapter9_Objects_Classes._9_8_Fan;

/**
 * Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed
 */
public enum FanSpeed {
  SLOW(1),
  MEDIUM(2),
  FAST(3);

  private int speedValue;

  FanSpeed(int speedValue) {
    this.speedValue = speedValue;
  }

  public int getSpeedValue() {
    return speedValue;
  }
}
