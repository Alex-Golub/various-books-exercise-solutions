package CodeStepByStep.java.set;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/set/wordCount
 *
 * @author Alex Golub
 * @since 01-May-21, 12:48 PM
 */
class wordCount {
  public static int wordCount(String fn) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File(fn));
    Set<String> unique = new HashSet<>();
    while (scanner.hasNext()) {
      unique.add(scanner.next());
    }
    
    return unique.size();
  }
}
