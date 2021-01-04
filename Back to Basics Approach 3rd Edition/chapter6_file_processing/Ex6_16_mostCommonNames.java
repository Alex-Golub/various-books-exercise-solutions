package chapter6_file_processing;

import java.util.Scanner;

/**
 * 16. Write a method called mostCommonNames that accepts
 * a Scanner representing an input file with names on each
 * line separated by spaces. Some names appear multiple
 * times in a row on the same line. For each line, print the most
 * commonly occurring name. If there’s a tie, use the first
 * name that had that many occurrences; if all names are
 * unique, print the first name on the line.
 *
 * @author Mr.Dr.Professor
 * @since 03-Jan-21 11:50 PM
 */
class Ex6_16_mostCommonNames {
  public static void main(String[] args) {
    String test = "Benson Eric   Eric  Marty Kim  Kim Kim   Jenny  Nancy Nancy  Nancy  Paul  Paul\n" +
                  "Stuart Stuart Stuart Ethan Alyssa Alyssa Helene Jessica Jessica Jessica Jessica\n" +
                  "Jared  Alisa Yuki   Catriona  Cody   Coral   Trent Kevin  Ben Stefanie Kenneth";
    int uniqueNames = mostCommonNames(new Scanner(test));
    System.out.println(uniqueNames);
  }

  public static int mostCommonNames(Scanner input) {
    int uniqueNames = 0;

    while (input.hasNextLine()) {
      uniqueNames++;
      String  mostCommonName  = "";
      int     mostOccurrences = 0;
      String  line            = input.nextLine();
      Scanner tokenReader     = new Scanner(line);

      if (tokenReader.hasNext()) {
        String currentName = tokenReader.next();
        int    times       = 1;

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
