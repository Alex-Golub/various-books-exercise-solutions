package chapter6_file_processing;

import java.util.Scanner;

/**
 * 2. Write a method called evenNumbers that accepts a Scanner reading
 * input from a file with a series of integers, and report various statistics
 * about the integers to the console.
 * Report the total number of numbers, the sum of the numbers,
 * the count of even numbers and the percent of even numbers.
 *
 * @author Mr.Dr.Professor
 * @since 29-Dec-20 10:19 PM
 */
class Ex6_2_evenNumbers {
  public static void main(String[] args) {
    evenNumbers(new Scanner("5 7 2 8 9 10 12 98 7 14 20 22"));
  }

  public static void evenNumbers(Scanner input) {
    int total = 0;
    int sum   = 0;
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
