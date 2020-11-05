package chapter3_Selections;

import java.util.Scanner;

/**
 * 3.12 (Palindrome integer)
 * Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer.
 * NOTE: A negative integer is treated the same as a positive integer.
 * <p>
 * Created by ag on 26-Oct-20 3:45 PM
 */
class Ex3_12_Palindrome_Num {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter three digit number: ");
      int num = scanner.nextInt();
      if (num >= 100 && num <= 999) {
        int unitDigit = num % 10;
        int tensDigit = num / 10 % 10;
        int hundredDigit = num / 100;

        int reversedNum = unitDigit * 100 + tensDigit * 10 + hundredDigit;

        if (num == reversedNum) {
          System.out.println(num + " is a three digit palindrome number");
        } else {
          System.out.println(num + " is not a three digit palindrome number");
        }
      } else {
        System.out.println(num + " is not a three digit number, try again");
      }
    }
  }
}
