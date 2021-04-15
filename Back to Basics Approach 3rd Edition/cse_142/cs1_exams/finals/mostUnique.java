package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final13/mostUnique
 *
 * 1. Your method should return the highest number of unique scores
 * given in a single class period.
 * 2. The method should also print information about the number of unique
 * scores given in each period, in a format described below.
 *
 * @author Alex Golub
 * @since 15-Apr-21 10:29 PM
 */
class mostUnique {
  public static void main(String[] args) {
    String data = "10 10 10  9 9   8    3\n" +
                  "3 3 8 10 9 7   7 6 6\n" +
                  "4  1 9  9 10  7 7 \n" +
                  "10  10   10 10";
    System.out.println(mostUnique(new Scanner(data)));
  }

  public static int mostUnique(Scanner periods) {
    int maxUniqueScores = 0;
    int prevScore;
    int unique;

    for (int i = 1; periods.hasNextLine(); i++) {
      String line = periods.nextLine();
      Scanner tokenReader = new Scanner(line);
      prevScore = tokenReader.nextInt();
      unique = 1;

      while (tokenReader.hasNextInt()) {
        int next = tokenReader.nextInt();

        if (next != prevScore) {
          unique++;
          prevScore = next;
        }
      }

      maxUniqueScores = Math.max(maxUniqueScores, unique);
      System.out.println("Period " + i + ": " + unique + " unique scores");
    }

    return maxUniqueScores;
  }
}
