package chapter9_Objects_and_Classes;

/*public*/ class TotalArea {
  public static void main(String[] args) {
    CircleWithPrivateDataFields[] circleArray = createCircleArray();
    printCircleArray(circleArray);
  }

  /** Create an array of Circle objects */
  public static CircleWithPrivateDataFields[] createCircleArray() {
    CircleWithPrivateDataFields[] circleArray = 
      new CircleWithPrivateDataFields[5];

    for (int i = 0; i < circleArray.length; i++) {
      circleArray[i] = 
        new CircleWithPrivateDataFields(Math.random() * 100);
    }

    return circleArray;
  }

  /** Print an array of circles and their total area */
  public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
    System.out.printf("%-30s%-15s\n", "Radius", "Area");
    for (CircleWithPrivateDataFields circle : circleArray) {
      System.out.printf("%-30f%-15f\n", circle.getRadius(),
                        circle.getArea());
    }

    System.out.println("-----------------------------------------");

    System.out.printf("%-30s%-15f\n", "The total areas of circles is",
      sum(circleArray));
  }

  /** Add circle areas */
  public static double sum(CircleWithPrivateDataFields[] circleArray) {
    double sum = 0;

    for (int i = 0; i < circleArray.length; i++)
      sum += circleArray[i].getArea();

    return sum;
  }
}
