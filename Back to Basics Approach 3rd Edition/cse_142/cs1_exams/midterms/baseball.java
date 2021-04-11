package cse_142.cs1_exams.midterms;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/midterms/midterm13/baseball
 *
 * @author Alex Golub
 * @since 11-Apr-21 8:59 PM
 */
class baseball {
  public static void main(String[] args) {
    baseball(new Scanner(System.in));
  }

  public static int baseball(Scanner scanner) {
    int team1 = 0, team2 = 0;
    int inning = 1;

    while (inning <= 9 && Math.abs(team1 - team2) < 10) {
      System.out.print("Inning #" + inning + ": ");
      team1 += scanner.nextInt();
      team2 += scanner.nextInt();
      inning++;
    }

    while (team1 == team2) { // extra innings
      System.out.print("Inning #" + inning + ": ");
      team1 += scanner.nextInt();
      team2 += scanner.nextInt();
      inning++;
    }

    System.out.println("Final score: " + team1 + " - " + team2);

    return team1 > team2 ? 1 : 2;
  }
}
