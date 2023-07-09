package org.mrdrprof.solutions.chapter9_Objects_and_Classes;

/**
 * 9.8 (The Fan class)
 *
 * @author Mr.Dr.Professor
 * @since 19/03/2021 13:47
 */
/*public*/ class Fan {
  enum Speed {SLOW, MEDIUM, FAST}
  enum Color {GREEN, YELLOW, BLUE, RED}

  private Speed speed;
  private boolean on;
  private double radius;
  private Color color;

  public Fan() {
    this(5, Color.GREEN);
  }

  public Fan(double radius, Color color) {
    this.speed = Speed.SLOW;
    this.radius = radius;
    this.color = color;
  }

  public Speed getSpeed() {
    return speed;
  }

  public boolean isOn() {
    return on;
  }

  public double getRadius() {
    return radius;
  }

  public Color getColor() {
    return color;
  }

  public void setSpeed(Speed speed) {
    this.speed = speed;
  }

  public void turnOn() {
    if (on) {
      System.out.println("Fan is already turned on");
      return;
    }

    on = true;
  }

  public void turnOff() {
    if (!on) {
      System.out.println("Fan is already turned off");
      return;
    }

    on = false;
  }

  @Override
  public String toString() {
    String s = "Color: " + getColor().toString() +
               ", Radius: " + getRadius();

    if (isOn()) {
      return "Speed: " + getSpeed().toString() +
             ", " + s;
    }

    return s + ", Fan is off";
  }

  public static void main(String[] args) {
    Fan yellowFan = new Fan(10, Color.YELLOW);
    System.out.println(yellowFan);
    yellowFan.turnOff();
    yellowFan.turnOn();
    System.out.println(yellowFan);

    System.out.println();

    Fan blueFan = new Fan(5, Color.BLUE);
    blueFan.setSpeed(Speed.MEDIUM);
    blueFan.turnOn();
    System.out.println(blueFan);
    blueFan.turnOn();
    blueFan.turnOff();
    System.out.println(blueFan);
  }
}
