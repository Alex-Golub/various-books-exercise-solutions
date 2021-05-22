package CodeStepByStep.java.recursion;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/recursion/reverseLines
 *
 * @author Alex Golub
 * @since 12-May-21, 12:25 PM
 */
class reverseLines {
  public static void main(String[] args) {
    String data = "Roses are red,\n" +
                  "Violets are blue.\n" +
                  "All my base\n" +
                  "Are belong to you.";
    reverseLines(new Scanner(data));
  }
  
  public static void reverseLines(Scanner in) {
    System.out.println(reverseLines(in, ""));
  }
  
  private static String reverseLines(Scanner in, String res) {
    return in.hasNextLine() ? reverseLines(in, in.nextLine() + "\n" + res) : res;
  }
}
