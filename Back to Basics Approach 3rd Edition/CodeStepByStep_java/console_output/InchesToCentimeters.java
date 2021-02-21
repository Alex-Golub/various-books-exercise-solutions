package CodeStepByStep_java.console_output;

import java.util.Scanner;

/**
 * Write an interactive console program in a class named InchesToCentimeters
 * that prompts the user to read in two input values: a number of feet,
 * followed on a separate line by a number of inches.
 * The program should convert this amount to centimeters.
 * Here is a sample run of the program (user input is shown like this):
 *
 * This program converts feet and inches to centimeters.
 * Enter number of feet: 5
 * Enter number of inches: 11
 * 5ft 11in = 180.34cm
 *
 * @author Mr.Dr.Professor
 * @since 21-Feb-21 8:52 PM
 */
/*public*/ class InchesToCentimeters {
  static final double CM_PER_FEET = 30.48;
  static  final double CM_PER_INCH = 2.54;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("This program converts feet and inches to centimeters.");

    System.out.print("Enter number of feet: ");
    int feet = Integer.parseInt(sc.nextLine());

    System.out.print("Enter number of inches: ");
    int inches = Integer.parseInt(sc.nextLine());

    System.out.printf("%dft %din = %.2fcm\n",
                      feet, inches,
                      CM_PER_FEET * feet + CM_PER_INCH * inches);
  }
}
