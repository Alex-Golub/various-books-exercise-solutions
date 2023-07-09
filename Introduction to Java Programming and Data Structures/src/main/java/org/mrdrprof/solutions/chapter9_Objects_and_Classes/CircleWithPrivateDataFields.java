package org.mrdrprof.solutions.chapter9_Objects_and_Classes;

/*public*/ class CircleWithPrivateDataFields {
  private static int numberOfObjects = 0;
  private double radius = 1;

  public CircleWithPrivateDataFields() {
    numberOfObjects++;
  }

  public CircleWithPrivateDataFields(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }

  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double newRadius) {
    radius = (newRadius >= 0) ? newRadius : 0;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public static void main(String[] args) {
    CircleWithPrivateDataFields myCircle =
            new CircleWithPrivateDataFields(5.0);
    System.out.println("The area of the circle of radius "
                       + myCircle.getRadius() + " is " + myCircle.getArea());

    myCircle.setRadius(myCircle.getRadius() * 1.1);
    System.out.println("The area of the circle of radius "
                       + myCircle.getRadius() + " is " + myCircle.getArea());

    System.out.println("The number of objects created is "
                       + CircleWithPrivateDataFields.getNumberOfObjects());
  }
}
