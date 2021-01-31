package chapter6_Methods;

import java.util.Random;

/**
 * **6.30 (Game: craps)
 * sum        outcome
 * ------------------
 * 2, 3, 12   lose
 * 7, 11      win
 *
 * continue, if 7 is rolled you lose
 *           if same point value as previous roll you win
 *
 * @author Mr.Dr.Professor
 * @since 29-Jan-21 1:58 PM
 */
class Ex6_30_crapsGame {
  public static void main(String[] args) {
    Random dice = new Random();

    int prevRoll = 0;
    int score    = 0;

    int roll1   = dice.nextInt(6) + 1;
    int roll2   = dice.nextInt(6) + 1;
    int rollSum = roll1 + roll2;
    System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + rollSum);

    if (rollSum == 2 || rollSum == 3 || rollSum == 12) {
      System.out.println("You lose");
      return;
    } else if (rollSum == 7 || rollSum == 11) {
      System.out.println("You win");
      return;
    } else {
      System.out.println("point is " + rollSum);
      score += rollSum;
    }

    prevRoll = rollSum;

    while (true) {
      roll1 = dice.nextInt(6) + 1;
      roll2 = dice.nextInt(6) + 1;
      rollSum = roll1 + roll2;
      System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + rollSum);

      if (rollSum == 7) {
        System.out.println("You lose");
        break;
      } else if (prevRoll == rollSum) {
        System.out.println("You win");
        break;
      } else {
        System.out.println("point is " + rollSum);
        score += rollSum;
      }

      prevRoll = rollSum;
    }

    System.out.println("\nTotal points: " + score);
  }
}
