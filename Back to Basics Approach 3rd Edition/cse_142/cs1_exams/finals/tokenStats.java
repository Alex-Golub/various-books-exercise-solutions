package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final4/tokenStats
 *
 * test #1:tokenStats(new Scanner("3 3.14 10 squid 10.x 6.0\n"));
 * console output:
 * integers: 13
 * real numbers: 9.14
 * total tokens: 6
 * result: pass
 *
 * @author Alex Golub
 * @since 13-Apr-21 8:43 PM
 */
class tokenStats {
  public static void main(String[] args) {
    String data = "3 3.14 10 squid 10.x 6.0";
    tokenStats(new Scanner(data));
  }

  public static void tokenStats(Scanner tokens) {
    int integersSum = 0;
    double realSum = 0.0;
    int totalTokens = 0;

    while (tokens.hasNext()) {
      totalTokens++;

      if (tokens.hasNextInt()) {
        integersSum += tokens.nextInt();
      } else if (tokens.hasNextDouble()) {
        realSum += tokens.nextDouble();
      } else {
        tokens.next();
      }
    }

    System.out.println("integers: " + integersSum);
    System.out.println("real numbers: " + realSum);
    System.out.println("total tokens: " + totalTokens);
  }
}
