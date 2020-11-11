package chapter2_objects;

import java.util.Random;

/**
 * •• E2.13
 * Write a program DieSimulator that uses the Random class to
 * simulate  the cast of a die, printing a random number between 1
 * and 6 every time that the program is run.
 *
 * Created by ag on 08-Nov-20 2:20 PM
 */
class Ex2_13_DieSimulator {
  public static void main(String[] args) {
    Random generator = new Random();
    int cast = 1 + generator.nextInt(6); // 1 + [0, 5] => [1, 6]
    System.out.println("Casted: " + cast);
  }
}
