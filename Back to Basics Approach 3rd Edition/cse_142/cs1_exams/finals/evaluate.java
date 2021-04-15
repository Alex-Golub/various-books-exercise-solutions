package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final6/evaluate
 *
 * test #3:1.25 + 3.75 - 1.875 + 2.125 + 6.5 - 1.125 - 2.125 + 1.0
 * return:9.5
 * result: pass
 *
 * @author Alex Golub
 * @since 14-Apr-21 7:54 PM
 */
class evaluate {
  public static void main(String[] args) {
    String data = "4.2 + 3.4 - 4.1";
    System.out.println(Math.abs(evaluate(new Scanner(data)) - 3.5) < 1e-16);
  }

  public static double evaluate(Scanner data) {
    double sum = data.nextDouble();
    while (data.hasNext()) {
      String op = data.next();
      double next = data.nextDouble();
      if (op.equals("-"))
        sum -= next;
      else
        sum += next;
    }

    return sum;
  }
}
