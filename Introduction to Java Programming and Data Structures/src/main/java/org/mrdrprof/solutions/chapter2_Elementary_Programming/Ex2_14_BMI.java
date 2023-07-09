package org.mrdrprof.solutions.chapter2_Elementary_Programming;

import java.util.Scanner;

/**
 * *2.14 (Health application: computing BMI)
 * Write a program that prompts the user to enter a weight in pounds and height
 * in inches and displays the BMI.
 * Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 *
 * Created by ag on 13-Oct-20 7:18 PM 
 */
class Ex2_14_BMI {
  public static void main(String[] args) {
    final double KILOGRAM_PER_POUND = 0.45359237;
    final double INCH_PER_METER     = 0.0254;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
    double weight = scanner.nextDouble() * KILOGRAM_PER_POUND;

    System.out.print("Enter height in inches: ");
    double height = scanner.nextDouble() * INCH_PER_METER;

    double bmi = weight / (height * height);
    System.out.printf("BMI is %.4f\n", bmi);
  }
}
