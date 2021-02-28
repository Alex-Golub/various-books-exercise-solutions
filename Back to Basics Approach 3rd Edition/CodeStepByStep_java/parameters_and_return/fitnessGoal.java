package CodeStepByStep_java.parameters_and_return;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/fitnessGoal
 *
 * Write a method named fitnessGoal that accepts an integer parameter
 * named goal, and prompts the user for how many minutes he/she
 * exercises each day until they increase their minutes for goal
 * consecutive days in a row.
 *
 * Assumptions:
 * 1. You may assume that the parameter value passed will be a positive integer,
 * 2. You may assume that the user will type a positive integer for the number
 * of minutes each day.
 * 3. You don't need to worry about pluralizing words in the output such
 * as "day" vs "days."
 *
 * Constraints:
 * 1. You should not use data structures such as arrays or strings to help
 * you solve this problem.
 * 2. You may declare as many simple variables (such as ints or doubles) as you like.
 *
 * @author Mr.Dr.Professor
 * @since 24-Feb-21 6:49 PM
 */
/*public*/ class fitnessGoal {
  public static void main(String[] args) {
    fitnessGoal(3);
  }

  public static void fitnessGoal(int days) {
    Scanner console = new Scanner(System.in);

    System.out.println("Train until you increase for " + days + " days.");
    int consecutiveDays = 1;
    int pastDay = 0; // past day minutes trained
    int totalDays = 0;

    while (consecutiveDays <= days) {
      System.out.print("Minutes? ");
      int today = console.nextInt();

      if (today > pastDay) {
        System.out.println("Great job!");
        consecutiveDays++;
      } else {
        System.out.println("Start over.");
        consecutiveDays = 1; // this day is the starting point
      }

      pastDay = today; // save past day minutes to compare to next day minutes
      totalDays++;
    }

    System.out.println("Reached your goal in " + totalDays + " total days!");
  }
}
