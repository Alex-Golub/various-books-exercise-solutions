package chapter9_Objects_Classes._9_8_Fan;

/**
 * Created by ag on 21-May-20 3:30 PM
 */
public enum FanColor {
  BLUE("Blue"),
  BLACK("Black"),
  RED("Red"),
  GREEN("Green"),
  YELLOW("Yellow");

  private String fanColor;

  FanColor(String fanColor) {
    this.fanColor = fanColor;
  }

  public String getFanColor() {
    return fanColor;
  }
}
