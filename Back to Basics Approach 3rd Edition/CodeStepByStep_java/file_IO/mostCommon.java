package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/mostCommon
 *
 * returns the word that occurs most frequently in the file.
 * Assume that any duplicate words will occur consecutively.
 * If there is a tie, use the earlier word.
 * You may assume that the string contains at least one word.
 *
 * @author Mr.Dr.Professor
 * @since 11-Mar-21 11:35 PM
 */
/*public*/ class mostCommon {
  public static void main(String[] args) throws FileNotFoundException {
    String mockData = "Ben Eric  Eric Marty Kim\n" +
                      "Kim Kim  Jenny   Nancy\n" +
                      "Nancy  Nancy  Paul   Paul";

    System.out.println(mostCommon(mockData));
  }

  public static String mostCommon(String fileName) throws FileNotFoundException {
    Scanner fileReader = new Scanner(new File(fileName));
//    Scanner fileReader = new Scanner(fileName);
    Map<String, Integer> namesOccurrences = new LinkedHashMap<>();
    int maxOccurrences = 0; // keep track for the name with max time occurred

    while (fileReader.hasNextLine()) {
      Scanner tokenReader = new Scanner(fileReader.nextLine());

      while (tokenReader.hasNext()) {
        String name = tokenReader.next();
        namesOccurrences.compute(name, (k, v) -> v == null ? 1 : v + 1);

        maxOccurrences = Math.max(maxOccurrences, namesOccurrences.get(name));
      }
    }

    String mostCommonName = "";
    for (Map.Entry<String, Integer> entry : namesOccurrences.entrySet()) {
      if (entry.getValue() == maxOccurrences) {
        mostCommonName = entry.getKey();
        break;
      }
    }

    return mostCommonName;
  }
}
