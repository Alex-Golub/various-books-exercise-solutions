package chapter5_Loops;

import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 20-Jan-21 8:16 PM
 */
class Dec2Hex {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    System.out.print("Enter a decimal number: ");
    int decimal = console.nextInt();

    StringBuilder hex   = new StringBuilder();
    int           times = 0;
    while (decimal != 0) {
      times++;
      int rem = decimal % 16;

      char value = rem >= 0 && rem <= 9 ?
                   (char) (rem + '0') :
                   (char) ('A' + rem - 10);

      hex.insert(0, value); // insert at front

      decimal /= 16;
    }

    System.out.println("The hex number is " + ((hex.length() == 0) ? "0" : hex));
    System.out.println("Times executed " + times);
  }
}
