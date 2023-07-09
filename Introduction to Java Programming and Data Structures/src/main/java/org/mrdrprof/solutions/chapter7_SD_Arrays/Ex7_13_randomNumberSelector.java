package org.mrdrprof.solutions.chapter7_SD_Arrays;

/**
 * *7.13 (Random number selector)
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 10:49 PM
 */
class Ex7_13_randomNumberSelector {
  public static void main(String[] args) {
    System.out.println("Random number: " +
                       getRandom(1, 2, 3, 4, 5, 6, 7, 8, 8));
  }

  public static int getRandom(int... numbers) {
    if (numbers == null || numbers.length == 0)
      throw new IllegalArgumentException("numbers list is null or zero");

    return numbers[(int) (Math.random() * numbers.length)];
  }
}
