package chapter4_Math_Characters_Strings;

import java.util.Random;

/**
 * *4.25 (Generate vehicle plate numbers)
 * Assume that a vehicle plate number consists of
 * three uppercase letters followed by four digits. LLL-DDDD
 * Write a program to generate a plate number.
 *
 * @author Mr.Dr.Professor
 * @since 16-Nov-20 7:09 PM
 */
class Ex4_25_PlatNumber {
  public static void main(String[] args) {
    Random rnd = new Random();

    StringBuilder plate = new StringBuilder();
    for (int i = 1; i <= 3; i++)
      plate.append((char) (rnd.nextInt(26) + 'A'));

    plate.append("-");
    for (int i = 1; i <= 4; i++)
      plate.append(rnd.nextInt(10));

    System.out.println("Generated Plate Number: " + plate);

  }
}
