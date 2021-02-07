package chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * **7.3 (Count occurrence of numbers)
 * 1. Integers between 1 and 50 and counts the occurrences of each.
 * 2. Input ends with 0.
 * 3. Note if a number occurs more than one time,
 * the plural word “times” is used in the output.
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 2:27 PM
 */
class Ex7_3_occurrenceOfNumbers {
  public static void main(String[] args) {
    final int FROM = 1;
    final int TO   = 50;

    Scanner sc = new Scanner(System.in);

    int[] counterArray = new int[TO + 1]; // [0, 50] 0 is ignored
    System.out.printf("Enter the integers between %d and %d zero to stop (e.g. 1 7 6 4 9 0): ",
                      FROM, TO);
    while (true) {
      int number = sc.nextInt();
      if (number == 0) // sentinel value, stop processing and exit
        break;

      counterArray[number]++;
    }

    for (int i = 1; i < counterArray.length; i++) {
      int occurred = counterArray[i];
      if (occurred > 0) {
        System.out.printf("%d occurs %d time%s\n",
                          i, occurred, occurred > 1 ? "s" : "");
      }
    }
  }
}
