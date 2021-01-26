package chapter5_Loops;

import java.util.Random;
import java.util.Scanner;

/**
 * **5.32 (Game: lottery)
 * Revise Listing 3.8, Lottery.java, to generate a lottery of a two-digit
 * number.
 * The two digits in the number are distinct.
 * (Hint: Generate the first digit.
 * Use a loop to continuously generate the second digit until it is
 * different from the first digit.)
 *
 * @author Mr.Dr.Professor
 * @since 25-Jan-21 2:33 PM
 */
class Ex5_32_lottery {
  public static void main(String[] args) {
    int lottery;
    while (true) {
      lottery = 10 + (int) (Math.random() * 90); // [10, 99]

      if (lottery % 10 != lottery / 10)
        break;
    }

    // Prompt the user to enter a guess
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (two digits): ");
    int guess = input.nextInt();

    // Get digits from lottery
    int lotteryDigit1 = lottery / 10;
    int lotteryDigit2 = lottery % 10;

    // Get digits from guess
    int guessDigit1 = guess / 10;
    int guessDigit2 = guess % 10;

    System.out.println("The lottery number is " + lottery);

    // Check the guess
    if (guess == lottery)
      System.out.println("Exact match: you win $10,000");
    else if (guessDigit2 == lotteryDigit1
             && guessDigit1 == lotteryDigit2)
      System.out.println("Match all digits: you win $3,000");
    else if (guessDigit1 == lotteryDigit1
             || guessDigit1 == lotteryDigit2
             || guessDigit2 == lotteryDigit1
             || guessDigit2 == lotteryDigit2)
      System.out.println("Match one digit: you win $1,000");
    else
      System.out.println("Sorry, no match");
  }
}