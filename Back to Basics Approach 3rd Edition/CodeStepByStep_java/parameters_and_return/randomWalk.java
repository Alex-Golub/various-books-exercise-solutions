package CodeStepByStep_java.parameters_and_return;

import java.util.Random;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/randomWalk
 *
 * Position = 0
 * Position = -1
 * Position = -2
 * Position = -3
 * Finished after 3 step(s)
 * Max position = 0
 *
 * @author Mr.Dr.Professor
 * @since 28-Feb-21 9:39 PM
 */
/*public*/ class randomWalk {
  public static void main(String[] args) {
    randomWalk(3);
  }

  public static void randomWalk(int threshold) {
    if (threshold < 1) {
      return;
    }

    Random rnd = new Random();
    int currentPosition = 0;
    int totalSteps = 0;
    int maxPosition = currentPosition;

    while (true) {
      System.out.printf("Position = %d\n", currentPosition);
      currentPosition += rnd.nextBoolean() ? 1 : -1;
      totalSteps++;
      maxPosition = Math.max(currentPosition, maxPosition);

      if (Math.abs(currentPosition) == threshold) {
        System.out.printf("Position = %d\n", currentPosition);
        break;
      }
    }

    System.out.printf("Finished after %d step(s)\n", totalSteps);
    System.out.printf("Max position = %d\n", maxPosition);
  }
}
