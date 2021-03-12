package CodeStepByStep_java.file_IO;

import java.util.Scanner;

/**
 * https://www.codestepbystep.com/problem/view/java/fileio/flipCoins
 *
 * 3 heads (60%)
 * There were more heads!
 *
 * 2 heads (33%)
 *
 * 1 heads (100%)
 * There were more heads!
 *
 * @author Mr.Dr.Professor
 * @since 04-Mar-21 8:15 PM
 */
/*public*/ class flipCoins {
  public static void main(String[] args) {
    String in = "H T H H T\n" +
                "T t   t T h  H\n" +
                "   h";
    flipCoins(new Scanner(in));
  }

  public static void flipCoins(Scanner in) {
    while (in.hasNextLine()) {
      int heads = 0, total = 0;
      Scanner token = new Scanner(in.nextLine());

      while (token.hasNext()) {
        total++;
        heads += token.next().equalsIgnoreCase("h") ? 1 : 0;
      }

      int headsPercentage = 100 * heads / total;
      System.out.printf("%d heads (%d%%)\n", heads, headsPercentage);
      if (headsPercentage > 50) {
        System.out.println("There were more heads!");
      }

      System.out.println();
    }
  }
}
