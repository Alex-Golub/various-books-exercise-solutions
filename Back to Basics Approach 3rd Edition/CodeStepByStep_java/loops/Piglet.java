package CodeStepByStep_java.loops;

import java.util.Random;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/Piglet
 *
 * The player's goal is to accumulate as many points as possible
 * without rolling a 1.
 * Each turn, the player rolls the die; if they roll a 1,
 * the game ends and they get a score of 0
 * Otherwise, they add this number to their running total score.
 * The player then chooses whether to roll again,
 * or end the game with their current point total.
 *
 * Welcome to Piglet!
 * You rolled a 5!
 * Roll again? yes
 * You rolled a 4!
 * Roll again? yes
 * You rolled a 1!
 * You got 0 points.
 *
 * Welcome to Piglet!
 * You rolled a 6!
 * Roll again? y
 * You rolled a 2!
 * Roll again? y
 * You rolled a 2!
 * Roll again? n
 * You got 10 points.
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 1:11 PM
 */
/*public*/ class Piglet {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner console = new Scanner(System.in);
    System.out.println("Welcome to Piglet!");

    boolean rollAgain = true;
    int totalPoints = 0, roll;
    while (rollAgain) {
      roll = random.nextInt(6) + 1;
      System.out.println("You rolled a " + roll + "!");

      if (roll == 1) {
        totalPoints = 0;
        break;
      }

      totalPoints += roll;
      System.out.print("Roll again? ");
      rollAgain = console.next().toLowerCase().startsWith("y");
    }

    System.out.println("You got " + totalPoints + " points.");
  }
}




















