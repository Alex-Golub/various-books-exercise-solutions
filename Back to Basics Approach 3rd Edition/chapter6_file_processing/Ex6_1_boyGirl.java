package chapter6_file_processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 1. Write a method called boyGirl that accepts a Scanner that is reading
 * its input from a file containing a series of names followed by integers.
 * The names alternate between boys’ names and girls’ names.
 * Your method should compute the absolute difference between the sum
 * of the boys’ integers and the sum of the girls’ integers.
 * The input could end with either a boy or girl;
 * you may not assume that it contains an even number of names.
 *
 * @author Mr.Dr.Professor
 * @since 29-Dec-20 9:56 PM
 */
class Ex6_1_boyGirl {
  public static void main(String[] args) throws FileNotFoundException {
    // Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6
    boyGirl(new Scanner(new File("tas.txt")));
  }

  public static void boyGirl(Scanner input) {
    int boys  = 0;
    int girls = 0;
    int sum   = 0;

    for (int i = 0; input.hasNext(); i++) {
      input.next(); // read name
      if (i % 2 == 0) {
        boys++;
      } else {
        girls++;
      }

      int value = input.nextInt();
      sum += i % 2 == 0 ? value : -value;
    }

    System.out.printf("%d boys, %d girls\n", boys, girls);
    System.out.printf("Difference between boys' and girls' sums: %d\n",
            Math.abs(sum));
  }
}
