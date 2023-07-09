package org.mrdrprof.solutions.chapter9_Objects_and_Classes;

/*public*/ class CircleWithStaticMembers {
  static int numberOfObjects;
  double radius;

  CircleWithStaticMembers() {
    radius = 1.0;
    numberOfObjects++;
  }

  CircleWithStaticMembers(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }

  static int getNumberOfObjects() {
    return numberOfObjects;
  }

  double getArea() {
    return radius * radius * Math.PI;
  }

  public static void main(String[] args) {
    System.out.println("Before creating objects");
    System.out.println("The number of Circle objects is " +
                       CircleWithStaticMembers.numberOfObjects);

    // Create c1
    CircleWithStaticMembers c1 = new CircleWithStaticMembers();
    System.out.println("\nAfter creating c1");
    System.out.println("c1: radius (" + c1.radius +
                       ") and number of Circle objects (" +
                       c1.numberOfObjects + ")");

    // Create c2
    CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
    c1.radius = 9;
    System.out.println("\nAfter creating c2 and modifying c1");
    System.out.println("c1: radius (" + c1.radius +
                       ") and number of Circle objects (" +
                       c1.numberOfObjects + ")");
    System.out.println("c2: radius (" + c2.radius +
                       ") and number of Circle objects (" +
                       c2.numberOfObjects + ")");
  }
}
