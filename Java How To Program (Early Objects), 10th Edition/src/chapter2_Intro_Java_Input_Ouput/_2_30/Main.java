package chapter2_Intro_Java_Input_Ouput._2_30;

import java.util.Scanner;

/**
 * 2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting of
 * five digits from the user, separates the number into its individual digits and prints the digits
 * separated from one another by three spaces each.
 * For example, if the user types in the number 42339,
 * the program should print 4   2   3   3   9
 * Assume that the user enters the correct number of digits.
 *
 * What happens when you enter a
 * number with more than five digits? What happens when you enter a number with fewer than five
 * digits?
 *
 * [Hint: It’s possible to do this exercise with the techniques you learned in this chapter.
 * You’ll need to use both division and remainder operations to “pick off” each digit.]
 * Created by ag on 15-Jun-20 1:05 PM
 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter 5 digit number: ");
    int num = scanner.nextInt();

    int tenOfThousands = (num / 10000) % 10;
    int thousands = (num / 1000) % 10;
    int hundreds = (num / 100) % 10;
    int tens = (num / 10) % 10;
    int units = num % 10;

    System.out.printf("%d   %d   %d   %d   %d",
            tenOfThousands, thousands, hundreds, tens, units);

    // number lest then 5 digits there will be heading 0's
    // number grater then 5 digits, digits from 6th places will not be calculated
  }
}
