package chapter4_Control_Statements_Part_1._4_38_Crypto;

import java.util.Scanner;

/**
 * All the data is transmitted as four-digit integers. Your application should read a four-digit
 * integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
 * to the digit and getting the remainder after dividing the new value by 10.
 *
 * Then swap the first digit with the third, and swap the second digit with the fourth.
 * Then print the encrypted integer.
 *
 * Write a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
 * encryption scheme) to form the original number.
 *
 * Created by ag on 02-Jul-20 8:00 PM
 */
class CryptoTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean exit = false;
    while (!exit) {
      menu();
      String choice = scanner.nextLine();
      switch (choice) {
        case "1":
          System.out.println("Number encrypted: " + encrypt(getNumber(scanner)));
          break;
        case "2":
          System.out.println("Number decrypted: " + decrypt(getNumber(scanner)));
          break;
        case "0":
          exit = true;
          break;
        default:
          System.out.println("Sorry, there is no such option");
      }

      System.out.println();
    }

    System.out.println("Bye");
  }

  private static int getNumber(Scanner scanner) {
    System.out.print("Enter 4 digit number to encrypt/decrypt: ");
    int n = Integer.parseInt(scanner.nextLine());

    while (n > 9999 || n < 1000) {
      System.out.print("Wrong input, try again, number range 1000 - 9999: ");
      n = Integer.parseInt(scanner.nextLine());
    }

    return n;
  }

  private static void menu() {
    System.out.print(
            "1. Encrypt\n" +
            "2. Decrypt\n" +
            "0. Exit\n" +
            "Your choice: "
    );
  }

  private static int encrypt(int n) {
    return digitSwapping(buildNewNumber(n, 1)); // build then swap
  }

  private static int decrypt(int n) {
    return digitSwapping(buildNewNumber(n, -1));
//    return buildNewNumber(digitSwapping(n), -1);
  }

  /**
   * 1. Replace each digit with the result of adding 7 to the digit and
   * getting the remainder after dividing the new value by 10.
   */
  private static int buildNewNumber(int n, int sign) {
    int newNum = 0, factor = 1;

    int seven; // if encrypting add 7 else subtract 7
    if (sign == 1)
      seven = 7;
    else
      seven = -7;

    while (n > 0) {
      int digit = (n % 10 + seven) % 10;
      if (digit < 0)
        digit += 10;

      newNum += (factor * digit);
      factor *= 10;
      n /= 10;
    }

    return newNum;
  }

  /** 2. Swap the first digit with the third, and swap the second digit with the fourth. */
  private static int digitSwapping(int num) {
    return (num / 10 % 10 * 1000) + // 2nd number
            (num % 10 * 100) + // 1st number
            (num / 1000 * 10) + // 4th number
            (num / 100 % 10); // 3rd number
  }
}
