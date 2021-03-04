package CodeStepByStep_java.loops;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/FizzBuzz
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 5:34 PM
 */
/*public*/ class FizzBuzz {
  static final Scanner console = new Scanner(System.in);
  static final int NUMBER_PER_ROW = 20;

  public static void main(String[] args) {
    System.out.print("Max value? ");
    int max = console.nextInt();

    for (int i = 1; i <= max; i++) {
      if (i % 15 == 0) { // 15 is the LCM of 3 and 5
        System.out.print("FizzBuzz");
      } else if (i % 5 == 0) {
        System.out.print("Buzz");
      } else if (i % 3 == 0) {
        System.out.print("Fizz");
      } else {
        System.out.print(i);
      }

      if (i % NUMBER_PER_ROW == 0) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }
  }
}
