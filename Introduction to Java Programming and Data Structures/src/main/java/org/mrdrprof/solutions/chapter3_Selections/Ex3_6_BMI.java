package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * *3.6 (Health application: BMI)
 *
 * Created by ag on 22-Oct-20 9:43 AM
 */
class Ex3_6_BMI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
    double weight = scanner.nextDouble();
    System.out.print("Enter feet: ");
    int feet = scanner.nextInt();
    System.out.print("Enter inches: ");
    int inches = scanner.nextInt();

    final int INCH_IN_FEET = 12;
    int height = inches + feet * INCH_IN_FEET;
    double bmi = weight / (height * height) * 703.0;
    System.out.printf("BMI is %.3f\n", bmi);

    if (bmi < 18.5)      System.out.println("Underweight");
    else if (bmi < 25.0) System.out.println("Normal");
    else if (bmi < 30.0) System.out.println("Overweight");
    else                 System.out.println("Obese");
  }
}
