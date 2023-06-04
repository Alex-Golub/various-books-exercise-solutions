package chapter_12_exception_handling_and_text_io;

import utils.exceptions.InvalidRadiusException;

public class CircleWithRadiusException {

    private static int numberOfObjects = 0;
    private double radius;

    public CircleWithRadiusException() {
        this(1.0);
    }

    public CircleWithRadiusException(double newRadius) {
        try {
            setRadius(newRadius);
            numberOfObjects++;
        } catch (InvalidRadiusException ex) {
            ex.printStackTrace();
        }
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new InvalidRadiusException(newRadius);
        }
    }

    public double findArea() {
        return radius * radius * 3.14159;
    }
}
