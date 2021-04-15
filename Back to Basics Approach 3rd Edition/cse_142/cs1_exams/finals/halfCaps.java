package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final5/halfCaps
 *
 * @author Alex Golub
 * @since 13-Apr-21 10:13 PM
 */
class halfCaps {
  public static void main(String[] args) {
    String data = "The QUick brown foX jumPED over the Sleepy student\n";
    halfCaps(new Scanner(data));
  }

  public static void halfCaps(Scanner data) {
    for (int i = 0; data.hasNext(); i++) {
      String word = data.next();
      System.out.print((i % 2 == 0 ? word.toLowerCase() : word.toUpperCase()) + " ");
    }
  }
}
