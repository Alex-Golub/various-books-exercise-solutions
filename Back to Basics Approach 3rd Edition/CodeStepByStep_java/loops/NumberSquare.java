package CodeStepByStep_java.loops;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/NumberSquare
 * You may assume that min is less than or equal to max.
 *
 * Min? 1
 * Max? 5
 * 12345
 * 23451
 * 34512
 * 45123
 * 51234
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 12:39 AM
 */
/*public*/ class NumberSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Min? ");
    int min = sc.nextInt();
    System.out.print("Max? ");
    int max = sc.nextInt();

    for (int i = min; i <= max; i++) {
      for (int j = i; j <= max; j++) {
        System.out.print(j);
      }

      for (int j = min; j < i; j++) {
        System.out.print(j);
      }

      System.out.println();
    }
  }
}
