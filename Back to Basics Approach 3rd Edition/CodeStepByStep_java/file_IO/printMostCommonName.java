package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/printMostCommonName
 *
 * @author Mr.Dr.Professor
 * @since 11-Mar-21 11:53 PM
 */
/*public*/ class printMostCommonName {
  public static int printMostCommonName(String fileName) throws FileNotFoundException {
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

    System.out.printf("Most common name: %s, %d\n",
                      getMostCommonName(namesOccurrences, maxOccurrences),
                      maxOccurrences);

    return namesOccurrences.keySet().size();
  }

  private static String getMostCommonName(Map<String, Integer> namesOccurrences,
                                          int maxOccurrences) {
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
