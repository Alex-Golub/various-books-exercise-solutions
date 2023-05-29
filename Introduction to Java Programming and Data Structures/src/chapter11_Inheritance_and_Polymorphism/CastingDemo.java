package chapter11_Inheritance_and_Polymorphism;

import utils.chapter_11.CircleFromSimpleGeometricObject;

class CastingDemo {

  public static void main(String[] args) {
    // Create and initialize two objects
    Object object1 = new CircleFromSimpleGeometricObject(1);
    Object object2 = new RectangleFromSimpleGeometricObject(1, 1);

    // Display circle and rectangle
    displayObject(object1);
    displayObject(object2);
  }

  public static void displayObject(Object object) {
    if (object instanceof CircleFromSimpleGeometricObject) {
      System.out.printf("The circle area is %s%n", ((CircleFromSimpleGeometricObject) object).getArea());
      System.out.printf("The circle diameter is %s%n", ((CircleFromSimpleGeometricObject) object).getDiameter());
    } else if (object instanceof RectangleFromSimpleGeometricObject) {
      System.out.printf("The rectangle area is %s%n", ((RectangleFromSimpleGeometricObject) object).getArea());
    }
  }
}
