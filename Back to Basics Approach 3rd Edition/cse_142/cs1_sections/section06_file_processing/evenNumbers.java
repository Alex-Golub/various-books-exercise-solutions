package cse_142.cs1_sections.section06_file_processing;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/3853?categoryid=119
 *
 * example test
 * console output:
 * 12 numbers, sum = 214
 * 8 evens (66.67%)
 *
 * all odd
 * console output:
 * 8 numbers, sum = 238
 * 0 evens (0.00%)
 *
 * all even
 * console output:
 * 7 numbers, sum = 72
 * 7 evens (100.00%)
 *
 * odd and even
 * console output:
 * 11 numbers, sum = 581
 * 4 evens (36.36%)
 *
 * @author Alex Golub
 * @since 04-Apr-21 11:05 AM
 */
class evenNumbers {
  // pre: at least one integer in file
  public static void evenNumbers(Scanner input) {
    int total = 0;
    int sum = 0;
    int evens = 0;

    while (input.hasNextInt()) {
      int number = input.nextInt();
      total++;
      sum += number;
      evens += number % 2 == 0 ? 1 : 0;
    }

    System.out.printf("%d numbers, sum = %d\n%d evens (%.2f%%)\n",
                      total, sum, evens, 100.0 * evens / total);
  }
}
