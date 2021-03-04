package CodeStepByStep_java.loops;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/loops/RangeOfNumbers
 *
 * Start? 2
 * End? 8
 * 2, 3, 4, 5, 6, 7, 8
 *
 * Start? 18
 * End? 11
 * 18, 17, 16, 15, 14, 13, 12, 11
 *
 * Start? 42
 * End? 42
 * 42
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 12:06 PM
 */
/*public*/ class RangeOfNumbers {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("Start? ");
    int start = console.nextInt();

    System.out.print("End? ");
    int end = console.nextInt();

    System.out.print(start);
    if (start < end) {
      for (int i = start + 1; i <= end; i++) {
        System.out.print(", " + i);
      }
    } else {
      for (int i = start - 1; i >= end; i--) {
        System.out.print(", " + i);
      }
    }
  }
}
