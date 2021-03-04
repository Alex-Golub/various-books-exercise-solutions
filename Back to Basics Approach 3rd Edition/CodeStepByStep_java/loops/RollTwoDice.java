package CodeStepByStep_java.loops;

import java.util.Random;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/RollTwoDice
 *
 * Desired sum: 10
 * 3 and 5 = 8
 * 1 and 1 = 2
 * 4 and 4 = 8
 * 6 and 4 = 10
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 12:57 PM
 */
/*public*/ class RollTwoDice {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Desired sum: ");
    int desiredSum = console.nextInt();
    Random random = new Random();

    int dice1, dice2, dicesSum = -1;
    while (dicesSum != desiredSum) {
      dice1 = random.nextInt(6) + 1;
      dice2 = random.nextInt(6) + 1;

      dicesSum = dice1 + dice2;
      System.out.printf("%d and %d = %d\n", dice1, dice2, dicesSum);
    }
  }
}
