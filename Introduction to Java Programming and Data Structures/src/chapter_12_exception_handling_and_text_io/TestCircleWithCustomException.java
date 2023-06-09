package chapter_12_exception_handling_and_text_io;

import utils.exceptions.InvalidRadiusException;

class TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(0);
            new CircleWithCustomException(-5);
        } catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.printf("Number of objects created: %d%n", CircleWithCustomException.getNumberOfObjects());
    }
}

class CircleWithCustomException {
    private static int numberOfObjects = 0;
    private double radius;

    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
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
