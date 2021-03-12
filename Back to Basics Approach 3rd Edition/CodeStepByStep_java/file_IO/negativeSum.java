package CodeStepByStep_java.file_IO;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/negativeSum
 *
 * @author Mr.Dr.Professor
 * @since 06-Mar-21 3:36 PM
 */
/*public*/ class negativeSum {
  public static void main(String[] args) {
//    negativeSum(new Scanner("38 4 19 -27 -15 -3 4 19 38"));
//    negativeSum(new Scanner("14 7 -10 9 -18 -10 17 42 98"));
    negativeSum(new Scanner("-14"));
  }

  public static boolean negativeSum(Scanner file) {
    int currentSum = 0;
    for (int step = 1; file.hasNextInt(); step++) {
      currentSum += file.nextInt();

      if (currentSum < 0) {
        System.out.printf("%d after %d steps\n", currentSum, step);
        return true;
      }
    }

    System.out.println("no negative sum");
    return false;
  }
}
