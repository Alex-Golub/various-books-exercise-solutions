package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final11/triathlon
 *
 * @author Alex Golub
 * @since 15-Apr-21 5:26 PM
 */
class triathlon {
  public static void main(String[] args) {
    String data = "Meghan 12 40 23 Bryan 16\n" +
                  "42 20 Lori 14 41 29 Jessica 18\n" +
                  "\n" +
                  "    37 30 Toni 19   43\n" +
                  "29 Tamara 17 42 34";
    triathlon(new Scanner(data));
  }

  public static void triathlon(Scanner data) {
    // You may assume that the file contains data for at least one athlete.
    String name = data.next();
    int winnerTime = data.nextInt() + data.nextInt() + data.nextInt();
    System.out.println(name + ": " + winnerTime + " min");

    while (data.hasNext()) {
      name = data.next();
      int time = data.nextInt() + data.nextInt() + data.nextInt();
      System.out.println(name + ": " + time + " min (+" + (time - winnerTime) + " min)");
    }
  }
}
