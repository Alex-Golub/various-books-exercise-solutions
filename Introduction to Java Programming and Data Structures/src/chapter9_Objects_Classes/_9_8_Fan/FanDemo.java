package chapter9_Objects_Classes._9_8_Fan;

import static chapter9_Objects_Classes._9_8_Fan.FanColor.BLUE;
import static chapter9_Objects_Classes._9_8_Fan.FanColor.YELLOW;
import static chapter9_Objects_Classes._9_8_Fan.FanSpeed.*;

/**
 * 9.8 (The Fan class) Design a class named Fan to represent a fan.
 * The class contains:
 * ■■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3
 * to denote the fan speed.
 * ■■ A private int data field named speed that specifies the speed of the fan (the
 * default is SLOW).
 * ■■ A private boolean data field named on that specifies whether the fan is on (the
 * default is false).
 * ■■ A private double data field named radius that specifies the radius of the fan
 * (the default is 5).
 * ■■ A string data field named color that specifies the color of the fan (the default
 * is blue).
 * ■■ The accessor and mutator methods for all four data fields.
 * ■■ A no-arg constructor that creates a default fan.
 * ■■ A method named toString() that returns a string description for the fan.
 * If the fan is on, the method returns the fan speed, color, and radius in one combined string.
 * If the fan is not on, the method returns the fan color and radius
 * along with the string “fan is off” in one combined string.
 *
 * Draw the UML diagram for the class then implement the class.
 *
 * Write a test program that creates two Fan objects.
 * Assign maximum speed, radius 10, color yellow,
 * and turn it on to the first object. Assign medium speed, radius 5, color blue, and
 * turn it off to the second object. Display the objects by invoking their toString
 * method.
 *
 * Created by ag on 21-May-20 3:23 PM
 */
class FanDemo {
    public static void main(String[] args) {
        Fan fan1 = new Fan(FAST, true, 10, YELLOW); // static enum import here
        Fan fan2 = new Fan(MEDIUM, false, 5, BLUE);

        System.out.println(fan1);
        System.out.println(fan2);

        // Test with negative radius
        try {
            Fan fan3 = new Fan(SLOW, true, -15, BLUE);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

    }
}
