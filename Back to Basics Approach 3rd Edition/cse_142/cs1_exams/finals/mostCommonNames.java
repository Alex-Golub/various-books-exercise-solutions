package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final10/mostCommonNames
 *
 * @author Alex Golub
 * @since 15-Apr-21 4:08 PM
 */
class mostCommonNames {
  public static void main(String[] args) {
    String data = "Benson Eric   Eric  Marty Kim  Kim Kim   Jenny  Nancy Nancy  Nancy  Paul  Paul\n" +
                  "Stuart Stuart Stuart Ethan Alyssa Alyssa Helene Jessica Jessica Jessica Jessica\n" +
                  "Jared  Alisa Yuki   Catriona  Cody   Coral   Trent Kevin  Ben Stefanie Kenneth";
    mostCommonNames(new Scanner(data));
  }

  public static int mostCommonNames(Scanner input) {
    int uniqueNames = 0;

    while (input.hasNextLine()) {
      uniqueNames++;
      String mostCommonName = "";
      int mostOccurrences = 0;
      String line = input.nextLine();
      Scanner tokenReader = new Scanner(line);

      if (tokenReader.hasNext()) {
        String currentName = tokenReader.next();
        int times = 1;

        while (tokenReader.hasNext()) {
          String nextName = tokenReader.next();

          if (nextName.equals(currentName)) {
            times++;
          } else {
            if (times > mostOccurrences) {
              mostCommonName = currentName;
              mostOccurrences = times;
            }

            uniqueNames++;
            currentName = nextName;
            times = 1;
          }
        }

        if (times >= 1 && times > mostOccurrences) {
          mostCommonName = currentName;
        }

        System.out.println("Most common: " + mostCommonName);
      }
    }

    return uniqueNames;
  }
}
