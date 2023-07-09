package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * **3.15 (Game: lottery)
 * Generate a lottery of a three-digit number.
 * The program prompts the user to enter a three-digit number and determines
 * whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order,
 * the award is $12,000.
 * 2. If all digits in the user input match all digits in the lottery number,
 * the award is $5,000.
 * 3. If one digit in the user input matches a digit in the lottery number,
 * the award is $2,000.
 *
 * FIXME
 *
 * Created by ag on 26-Oct-20 6:29 PM
 */
class Ex3_15_Lottery {
  public static void main (String[] args) {

    while (true) {
      // Generate 3 digit random number: 100 + [0, 899] => [100, 999]
      int lotteryNumber = 100 + (int) (Math.random() * 900);

//      System.out.println(lotteryNumber);

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your lottery pick (three digits): ");
      int pick = scanner.nextInt();

      // Extract digits from lotteryNumber and user pick
      int p1 = pick % 10;
      int p2 = pick / 10 % 10;
      int p3 = pick / 100;

      int l1 = lotteryNumber % 10;
      int l2 = lotteryNumber / 10 % 10;
      int l3 = lotteryNumber / 100;

      // Determine prize
      boolean exactMatch = pick == lotteryNumber;
      boolean digitsMatch =
              (p1 == l1 && p2 == l3 && p3 == l2) ||
              (p1 == l2 && ((p2 == l3 && p3 == l1) || (p2 == l1 && p3 == l3))) ||
              (p1 == l3 && ((p2 == l1 && p3 == l2) || (p2 == l2 && p3 == l1)));

      boolean oneMatch =
              ((p1 == l1 || p1 == l2 || p1 == l3) && (p2 != p1 && p3 != p1)) ||
              ((p2 == l1 || p2 == l2 || p2 == l3) && (p2 != p1 && p3 != p2)) ||
              ((p3 == l1 || p3 == l2 || p3 == l3) && (p3 != p1 && p3 != p2));

      // Print result
      System.out.println("Lottery number => " + lotteryNumber +
              "\nYour guess => " + pick);

      if (exactMatch) System.out.println("Exact match: you win $12,000");
      else if (digitsMatch)
        System.out.println("Match all digits: you win $5,000");
      else if (oneMatch) System.out.println("Match one digit: you win $2,000");
      else System.out.println("You won nothing!");

      System.out.println();
    }


  }
}
