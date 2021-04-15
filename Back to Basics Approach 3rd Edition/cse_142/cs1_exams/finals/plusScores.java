package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final8/plusScores
 *
 * @author Alex Golub
 * @since 15-Apr-21 1:18 PM
 */
class plusScores {
  public static void main(String[] args) {
    String data = "Kane, Erica\n" +
                  "--+-+\n" +
                  "Chandler, Adam\n" +
                  "++-+\n" +
                  "Martin, Jake\n" +
                  "+++++++\n" +
                  "Dillon, Amanda\n" +
                  "++-++-+-";
    plusScores(new Scanner(data));
  }
  public static void plusScores(Scanner data) {
    while (data.hasNextLine()) {
      String name = data.nextLine();
      String signs = data.nextLine();
      int plus = 0, total = 0;
      for (int i = 0; i < signs.length(); i++) {
        char sign = signs.charAt(i);
        if (sign == '+')
          plus++;
        total++;
      }

      System.out.println(name + ": " + 100.0 * plus / total + "% plus");
    }
  }
}
