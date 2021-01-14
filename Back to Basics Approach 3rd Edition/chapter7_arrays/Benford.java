package chapter7_arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This program finds the distribution of leading digits in a set
 * of positive integers. The program is useful for exploring the
 * phenomenon known as Benford’s Law.
 * use county.txt or sunspot.txt
 *
 * @author Mr.Dr.Professor
 * @since 08-Jan-21 4:26 PM
 */
class Benford {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner console = new Scanner(System.in);
    System.out.print("Input file name? ");
    String  name  = console.nextLine();
    Scanner input = new Scanner(new File(name));
    int[]   count = countDigits(input);
    reportResult(count);
  }

  private static void reportResult(int[] count) {
    System.out.println();
    if (count[0] > 0)
      System.out.println("Excluding " + count[0] + " zeros");
    int total = Arrays.stream(count).sum();
    System.out.println("Digit Count Percent");
    for (int i = 1; i < count.length; i++) {
      double pct = 100.0 * count[i] / total;
      System.out.printf("%5d %5d %6.2f\n", i, count[i], pct);
    }

    System.out.printf("Total %5d %6.2f\n", total, 100.0);
  }

  private static int[] countDigits(Scanner input) {
    int[] count = new int[10];
    while (input.hasNextInt())
      count[firstDigit(input.nextInt())]++;
    return count;
  }

  private static int firstDigit(int n) {
    n = Math.abs(n);
    while (n > 9)
      n /= 10;
    return n;
  }
}
