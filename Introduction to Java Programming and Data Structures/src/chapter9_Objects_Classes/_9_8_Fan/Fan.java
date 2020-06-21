package chapter9_Objects_Classes._9_8_Fan;

import java.math.BigDecimal;

/**
 * Created by ag on 21-May-20 3:24 PM
 */
class Fan {

    private FanSpeed speed; // specifies the speed of the fan
    private boolean isOn; // specifies whether the fan is on
    private double radius; // specifies the radius of the fan
    private FanColor fanColor;

    public Fan() {
        speed = FanSpeed.SLOW;
        isOn = false;
        radius = 5;
        fanColor = FanColor.BLUE;
    }

    public Fan(FanSpeed speed, boolean isOn, double radius, FanColor fanColor) {
        if (BigDecimal.valueOf(radius).compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Radius (" + radius + ") is not valid radius!");

        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.fanColor = fanColor;
    }

    public FanSpeed getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public FanColor getFanColor() {
        return fanColor;
    }

    @Override
    public String toString() {
        String s = "";
        if (isOn) {
            // fan speed, color, and radius
            s = String.format("Speed: %d, Color: %s, Radius: %.2f",
                    getSpeed().getSpeedValue(), getFanColor().getFanColor(), getRadius());
        } else {
            // fan color and radius along with the string “fan is off”
            s = String.format("Color: %s, Radius: %.2f, fan is off",
                    getFanColor().getFanColor(), getRadius());
        }
        return s;
    }
}
