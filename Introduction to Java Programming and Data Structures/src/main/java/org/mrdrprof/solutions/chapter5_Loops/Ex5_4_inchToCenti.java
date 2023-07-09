package org.mrdrprof.solutions.chapter5_Loops;

/**
 * 5.4 (Conversion from inch to centimeter)
 * Write a program that displays the following table
 *
 * @author Mr.Dr.Professor
 * @since 21-Jan-21 2:01 PM
 */
class Ex5_4_inchToCenti {
  static final double CENTI_PER_INCH = 2.54;

  public static void main(String[] args) {
    System.out.printf("%-10s%10s\n", "Inches", "Centimeters");
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%-10d%10.2f\n", i, i * CENTI_PER_INCH);
    }
  }
}
