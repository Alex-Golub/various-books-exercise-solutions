package cse_142.cs1_sections.section06_file_processing;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/4190?categoryid=119
 *
 * Compute the absolute difference between the sum of the purple teams'
 * integers and the sum of the gold teams' integers.
 * The names alternate between purple team member names and
 * gold team member names.
 *
 * Chloe 3 Eyad 7 Noa 14 James 13 Nile 4 Kelvin 12 Justin 6 Mitchell 0
 * console output:
 * 4 purple, 4 gold
 * Difference between purple team and gold team sums: 5
 *
 * Dani 9 Abraham 1
 * console output:
 * 1 purple, 1 gold
 * Difference between purple team and gold team sums: 8
 *
 * Sonic 38 Cloud 61 Mewtwo 24 Mario 1 Link 3 Fox 7
 * console output:
 * 3 purple, 3 gold
 * Difference between purple team and gold team sums: 4
 *
 * Jane 1 Jack 2 John 3 Sarah 4 Eugene 5
 * console output:
 * 3 purple, 2 gold
 * Difference between purple team and gold team sums: 3
 *
 * @author Alex Golub
 * @since 04-Apr-21 10:53 AM
 */
class purpleGold {
  public static void main(String[] args) {
    String mock = "Chloe 3 Eyad 7 Noa 14 James 13 Nile 4 Kelvin 12 Justin 6 Mitchell 0";
    purpleGold(new Scanner(mock));
  }

  public static void purpleGold(Scanner fileReader) {
    int purpleCount = 0, goldCount = 0;
    int purpleSum = 0, goldSum = 0;
    int i = 0;

    while (fileReader.hasNext()) {
      fileReader.next();

      if (i % 2 == 0) { // purple member
        purpleCount++;
        purpleSum += fileReader.nextInt();
      } else {
        goldCount++;
        goldSum += fileReader.nextInt();
      }

      i++;
    }

    System.out.println(purpleCount + " purple, " + goldCount + " gold");
    System.out.println("Difference between purple team and gold team sums: " +
                       Math.abs(purpleSum - goldSum));
  }
}
