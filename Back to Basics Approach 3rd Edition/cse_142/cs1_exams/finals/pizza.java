package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final4/pizza
 *
 * method's task is to figure out the fewest boxes needed to store all
 * leftover pizza, if all the partial pizzas were consolidated together
 * as much as possible.
 *
 * You may assume that the Scanner contains at least 1 line of input,
 * and that no tokens other than whole/half/slice.
 *
 * test #5:multiple lines, all types including case sensitivity (example)
 * console output:
 * 5 / 8 pizza boxes used
 * 7 / 10 pizza boxes used
 * 6 / 10 pizza boxes used
 * 0 / 0 pizza boxes used
 * 1 / 1 pizza boxes used
 * result: pass
 *
 * @author Alex Golub
 * @since 13-Apr-21 8:48 PM
 */
class pizza {
  public static void main(String[] args) {
    String data = "slice half slice whole whole half half half\n" +
                  "whole HALF   WhoLE half WHOLE  WhOlE  Slice         half sLICe halF\n" +
                  "WHOLE slice   WHOLE SLICE whole SLICE    whole slice WHOLE half\n" +
                  "\n" +
                  "slice";
    pizza(new Scanner(data));
  }

  public static void pizza(Scanner file) {
    while (file.hasNextLine()) {
      int boxesUsed = 0;
      int slicesLeft = 0;
      Scanner tokenReader = new Scanner(file.nextLine());

      while (tokenReader.hasNext()) {
        String token = tokenReader.next().toLowerCase();
        boxesUsed++;

        switch (token) {
          case "slice":
            slicesLeft += 1;
            break;
          case "half":
            slicesLeft += 4;
            break;
          case "whole":
            slicesLeft += 8;
            break;
        }
      }

      System.out.printf("%d / %d pizza boxes used\n",
                        (int) Math.ceil(slicesLeft / 8.0), boxesUsed);
    }
  }
}
