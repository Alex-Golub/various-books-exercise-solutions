package CodeStepByStep_java.arrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/WordCount
 * <p>
 * Reports how many lines, words, and characters appear in it.
 *
 * @author Alex Golub
 * @since 25-Apr-21, 4:08 PM
 */
class WordCount {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    System.out.print("File: ");
    String fn = console.next();
    
    Scanner fileReader = new Scanner(new File(fn));
    int lines = 0;
    int words = 0;
    int chars = 0;
    while (fileReader.hasNextLine()) {
      String line = fileReader.nextLine();
      Scanner wordReader = new Scanner(line);
      lines++;
      chars += line.length();
  
      // split words by any character that is not lower/uppercase or number
      wordReader.useDelimiter("[^a-zA-Z0-9]+");
      while (wordReader.hasNext()) {
        wordReader.next();
        words++;
      }
    }
    
    System.out.println("Lines = " + lines);
    System.out.println("Words = " + words);
    System.out.println("Chars = " + chars);
  }
}
