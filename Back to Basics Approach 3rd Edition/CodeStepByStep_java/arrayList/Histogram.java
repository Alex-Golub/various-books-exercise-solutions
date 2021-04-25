package CodeStepByStep_java.arrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/arraylist/Histogram
 *
 * File: midtermscores.txt
 * 00-09:
 * 10-19: *
 * 20-29: *
 * 30-39: **
 * 40-49: *
 * 50-59: *****
 * 60-69: *******
 * 70-79: *****************
 * 80-89: ******
 * 90-99: **********
 *   100: *
 *
 * @author Alex Golub
 * @since 24-Apr-21, 12:17 AM
 */
class Histogram {
  public static void main(String[] args) throws FileNotFoundException {
    System.out.print("File: ");
    Scanner console = new Scanner(System.in);
    String fileName = console.next();
    Scanner fileReader = new Scanner(new File(fileName));
    
    int[] scores = new int[11];
    while (fileReader.hasNextInt()) {
      scores[fileReader.nextInt() / 10]++;
    }
    
    for (int i = 0; i < scores.length - 1; i++) {
      System.out.printf("%d0-%d9: %s\n", i, i, printAsterisks(scores[i]));
    }
  
    System.out.println("  " + 100 + ": " + printAsterisks(scores[scores.length - 1]));
  }
  
  private static String printAsterisks(int n) {
    StringBuilder sb = new StringBuilder(n);
    for (int i = 0; i < n; i++) {
      sb.append("*");
    }
    
    return sb.toString();
  }
}
