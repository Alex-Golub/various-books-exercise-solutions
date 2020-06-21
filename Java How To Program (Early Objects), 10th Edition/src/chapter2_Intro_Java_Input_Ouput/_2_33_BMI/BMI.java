package chapter2_Intro_Java_Input_Ouput._2_33_BMI;

import java.util.Scanner;

/**
 * 2.33 (Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in
 * Exercise 1.10. The formulas for calculating BMI are (in book)
 *
 * Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you
 * prefer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
 * body mass index.
 *
 * Also, display the following information from the Department of Health and
 * Human Services/National Institutes of Health so the user can evaluate his/her BMI:
 *
 * Created by ag on 15-Jun-20 1:41 PM
 */
public class BMI {
  public static void main(String[] args) {
    // Get user weight and height in kg and cm
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your weight (kg) -> ");
    double weight = scanner.nextInt();
    System.out.print("Enter your height (cm) -> ");
    double height = scanner.nextInt() / 100.0;

    calculateBMI(weight, height);

  }

  public static void calculateBMI(double weight, double height) { // also used by 3.17 exercise
    System.out.println(
            "BMI VALUES\n" +
            "Underweight: less than 18.5\n" +
            "Normal: between 18.5 and 24.9\n" +
            "Overweight: between 25 and 29.9\n" +
            "Obese: 30 or greater\n"
    );

    // Calculating BMI (using double which is floating point)
//    double bmi = weight / (height * height); // kg and cm
    double bmi = (weight * 703) / (height * height); // pounds and inches

    // Determine user BMI index
    if (bmi < 18.5)
      System.out.println("You are underweight -> Lets go to Macdonald's");
    else if (bmi < 24.9)
      System.out.println("Normal BMI -> Well Done!");
    else if (bmi < 29.9)
      System.out.println("You are overweight -> Today at 5pm at the Gym");
    else
      System.out.println("You are obese -> ...");
  }
}
