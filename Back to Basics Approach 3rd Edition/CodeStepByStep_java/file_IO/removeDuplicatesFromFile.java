package CodeStepByStep_java.file_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/removeDuplicatesFromFile
 * You may assume that the given file exists and is readable.
 *
 * input:
 * tresssssidder union
 * iisss hiiirriingg a
 * neeew bookkeeper !!!!
 *
 * tteehhh  eeend.
 *
 * output:
 * tresider union
 * is hiring a
 * new bokeper !
 *
 * teh end.
 *
 * @author Mr.Dr.Professor
 * @since 10-Mar-21 9:15 PM
 */
/*public*/ class removeDuplicatesFromFile {
  public static void main(String[] args) throws FileNotFoundException {
    String data = "tresssssidder union\n" +
                  "iisss hiiirriingg a\n" +
                  "neeew bookkeeper !!!!\n" +
                  "\n" +
                  "tteehhh  eeend. ";
    removeDuplicatesFromFile(data);
  }

  public static void removeDuplicatesFromFile(String fileName) throws FileNotFoundException {
    Scanner lineReader = new Scanner(new File(fileName));
    StringBuilder result = new StringBuilder();
    while (lineReader.hasNextLine()) {
      String line = lineReader.nextLine();

      Scanner wordReader = new Scanner(line);
      while (wordReader.hasNext()) {
        result.append(removeDuplicate(wordReader.next()))
                .append(" ");
      }

      if (lineReader.hasNextLine()) {
        result.append("\n");
      }
    }

    System.out.println(result);
  }

  public static String removeDuplicate(String word) {
    if (word == null || word.length() == 0) {
      return word;
    }

    char currentChar = word.charAt(0);
    StringBuilder noDup = new StringBuilder(currentChar + "");
    for (int i = 1; i < word.length(); i++) {
      if (currentChar != word.charAt(i)) {
        currentChar = word.charAt(i);
        noDup.append(currentChar);
      }
    }

    return noDup.toString();
  }
}
