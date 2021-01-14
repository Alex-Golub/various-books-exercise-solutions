package chapter7_arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 18. Write a method called wordLengths that accepts a Scanner for
 * an input file as its parameter.
 * Your method should open the given file,
 * count the number of letters in each token in the file,
 * and output a result diagram of how many
 * words contain each number of letters.
 *
 * You may assume that no token in the file is more than 80
 * characters in length.
 *
 * @author Mr.Dr.Professor
 * @since 11-Jan-21 8:33 PM
 */
class Ex7_18_wordLengths {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(new File("wl.txt"));
    wordLengths(input);
  }

  public static void wordLengths(Scanner input) {
    int[] freq = new int[81]; // no more then 80 characters
    while (input.hasNext()) {
      freq[input.next().length()]++;
    }

    // print results
    for (int i = 0; i < freq.length; i++) {
      if (freq[i] != 0)
        System.out.println(i + ": " + freq[i] + "\t" + asterisks(freq[i]));
    }
  }

  private static String asterisks(int n) {
    StringBuilder res = new StringBuilder(n);
    while (n-- > 0)
      res.append("*");
    return res.toString();
  }
}
