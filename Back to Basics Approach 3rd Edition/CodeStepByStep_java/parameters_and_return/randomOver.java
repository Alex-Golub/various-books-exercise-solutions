package CodeStepByStep_java.parameters_and_return;

import java.util.Random;

/**
 * https://www.codestepbystep.com/problem/view/java/parameters/randomOver
 *
 * Random number: 298
 * Random number: 493
 * Random number: 395
 * Random number: 605
 * Random number: 788
 * Random number: 219
 * Random number: 774
 * Random number: 974
 *
 * @author Mr.Dr.Professor
 * @since 27-Feb-21 1:23 AM
 */
/*public*/ class randomOver {
  public static void main(String[] args) {
    randomOver(900, 1000);
  }

  public static void randomOver(int n, int max) {
    Random rnd = new Random();
    int randomNumber;
    do {
      randomNumber = rnd.nextInt(max + 1);
      System.out.println("Random number: " + randomNumber);
    } while (randomNumber < n);
  }
}
