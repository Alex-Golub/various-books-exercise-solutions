package CodeStepByStep_java.loops;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/ComputeSumOfDigits
 *
 * You may assume that the user types a non-negative integer.
 *
 * @author Mr.Dr.Professor
 * @since 03-Mar-21 5:11 PM
 */
/*public*/ class ComputeSumOfDigits {
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Type an integer: ");
    int n = console.nextInt();

    int digitSum = 0;
    while (n != 0) {
      digitSum += n % 10;
      n /= 10;
    }

    System.out.println("Digit sum is " + digitSum);
  }
}
