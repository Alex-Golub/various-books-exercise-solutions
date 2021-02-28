package CodeStepByStep_java.parameters_and_return;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/BMI
 *
 * Write a console program in a class named BMI that prompts for user
 * input and calculates 2 people's body mass index (BMI),
 * using the following formula:
 *    BMI = weight / height2 * 703
 *
 * The BMI rating groups each person into one of the following four categories:
 *
 * BMI          | Category
 * ------------------------
 * below 18.5   | class 1
 * 18.5 - 24.9  | class 2
 * 25.0 - 29.9  | class 3
 * 30.0 and up  | class 4
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 3:02 PM
 */
/*public*/ class BMI {
  static final Scanner console = new Scanner(System.in);
  static final int PERSONS = 2;

  public static void main(String[] args) {
    intro();

    for (int person = 1; person <= PERSONS; person++) {
      double[] personInfo = getInfo(person);
      calculateBMI(personInfo);
    }

    System.out.println("Have a nice day!");
  }

  public static void calculateBMI(double[] info) {
    double bmi = 703 * info[1] / (info[0] * info[0]);
    System.out.printf("BMI = %.1f\n", bmi);

    System.out.print("class ");
    if (bmi < 18.5) {
      System.out.println("1");
    } else if (bmi < 24.9) {
      System.out.println("2");
    } else if (bmi < 29.9) {
      System.out.println("3");
    } else {
      System.out.println("4");
    }

    System.out.println();
  }

  public static double[] getInfo(int i) {
    System.out.println("Person " + i + "'s information:");
    System.out.print("height (in inches)? ");
    double h = console.nextDouble();
    System.out.print("weight (in pounds)? ");
    double w = console.nextDouble();

    return new double[] {h, w};
  }

  public static void intro() {
    System.out.println("This program reads data for two people");
    System.out.println("and computes their body mass index (BMI).\n");
  }
}
