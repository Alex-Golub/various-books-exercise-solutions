package chapter5_logic_and_loops;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Mr.Dr.Professor
 * @since 14-Dec-20 12:23 AM
 */
public class Test {
  public static void main(String[] args) {
    printLetters("Rabbit");

    sentinel();

    int[] arr = new int[4];
    printAllBinaryString(0, arr, 4);

    System.out.println(firstWord("four score and seven years"));
    System.out.println(firstWord("all-one-word-here"));
    System.out.println(firstWord(" lots of space here"));
    System.out.println(firstWord(" "));

    System.out.println(isPrime(1));
    System.out.println(isPrime(2));
    System.out.println(isPrime(3));
    for (int i = 0; i < 20; i++) {
      int n = (int) (Math.random() * 100);
      System.out.println(n + " is prime? => " + isPrime(n));
    }

  }

  public static boolean isLeapYear(int y) {
    return y % 100 == 0 ? y % 400 == 0 : y % 4 == 0;
  }

  public static boolean isPrime(int n) {
    if (n <= 1 || (n != 2 && n % 2 == 0))
      return false;
    if (n == 2)
      return true;

    for (int i = 3; i <= Math.sqrt(n); i += 2)
      if (n % i == 0)
        return false;

    return true;
  }

  private static String firstWord(String s) {
    int start = 0;
    while (start < s.length() && s.charAt(start) == ' ') // not in a word
      start++;

    int end = start;
    while (end < s.length() && s.charAt(end) != ' ') // within a word
      end++;

    return s.substring(start, end);
  }

  private static void printAllBinaryString(int i, int[] arr, int n) {
    if (i == n) {
      printArray(arr, n);
      return;
    }

    arr[i] = 0;
    printAllBinaryString(i + 1, arr, n);

    arr[i] = 1;
    printAllBinaryString(i + 1, arr, n);
  }

  private static void printArray(int[] arr, int n) {
    System.out.print("[");
    for (int i = 0; i < n - 1; i++)
      System.out.print(arr[i] + ", ");
    System.out.println(arr[n - 1] + "]");
  }

  private static void sentinel() {
    final int SENTINEL = -1;
    Scanner   sc       = new Scanner(System.in);
    System.out.printf("Type a number (or %d to stop): ", SENTINEL);
    int in  = sc.nextInt();
    int max = in;
    int min = in;

    while (in != SENTINEL) {
      if (in > max)
        max = in;
      else if (in < min)
        min = in;

      System.out.printf("Type a number (or %d to stop): ", SENTINEL);
      in = sc.nextInt();
    }

    if (max != SENTINEL) {
      System.out.println("Maximum was " + max);
      System.out.println("Minimum was " + min);
    }
  }

  public static void printLetters(String text) {
    if (!text.isEmpty()) {
      System.out.print(text.charAt(0));
      for (int i = 1; i < text.length(); i++) {
        System.out.print("-" + text.charAt(i));
      }
    }
    System.out.println();   // to end the line of output
  }
}
