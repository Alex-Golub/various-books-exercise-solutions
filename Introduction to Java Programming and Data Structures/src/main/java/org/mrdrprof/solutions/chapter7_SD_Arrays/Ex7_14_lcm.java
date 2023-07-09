package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 7.14 (Computing lcm)
 *
 * @author Mr.Dr.Professor
 * @since 01-Feb-21 10:53 PM
 */
class Ex7_14_lcm {
  public static void main(String[] args) {
    final int N = 3;
//    System.out.println(NumberFormat.getNumberInstance().format(Long.MAX_VALUE));

    int[] arr = getArray(N);

    System.out.printf("HCF%s = %d\n", Arrays.toString(arr), hcf(arr));
    System.out.printf("LCM%s = %,d\n", Arrays.toString(arr), lcm(arr));

  }

  private static int[] getArray(int N) {
    System.out.print("Enter " + N + " numbers: ");
    int[]   arr = new int[N];
    Scanner sc  = new Scanner(System.in);

    for (int i = 0; i < N; i++)
      arr[i] = sc.nextInt();

    return arr;
  }

  // brute force lcm finding
  // LCM of numbers must contain the max value of
  // the number list.
  // Thus find max, and "skip" max multiples and try to find
  // the number that all the number from the list divides it.
  // running this with 1234 1235 1237 1238 1239 values will take long
  // time to finish.
//  public static long lcm(int... numbers) {
//    long max = getMax(numbers);
//    long lcm = max;
//
//    while (true) {
//      boolean allDivides = true; // if all numbers dividing this lcm
//
//      for (int val : numbers) {
//        if (lcm % val != 0) {
//          allDivides = false;
//          break;
//        }
//      }
//
//      if (allDivides)
//        break;
//
//      if (lcm == Long.MIN_VALUE)
//        throw new ArithmeticException("Overflow");
//
//      lcm += max;
//    }
//
//    return lcm;
//  }

  private static long getMax(int[] numbers) {
    long max = numbers[0]; // assuming numbers.length >= 1

    for (long val : numbers)
      max = Math.max(max, val);

    return max;
  }

  public static long lcm(int... numbers) {
    if (numbers == null || numbers.length < 2)
      throw new IllegalStateException("lcm of less then 2 numbers is not defined");

    long a   = numbers[0];
    long b   = numbers[1];
    long lcm = Math.multiplyExact(a, b / hcf(a, b)); // order matters to prevent early overflow

    for (int i = 2; i < numbers.length; i++) {
      a = numbers[i];
      lcm = Math.multiplyExact(lcm, a / hcf(lcm, a));
    }

    return lcm;
  }

  public static long hcf(int... numbers) {
    if (numbers == null || numbers.length < 2) {
      throw new IllegalStateException("hcf of less then 2 numbers is not defined");
    }

    long hcf = hcf(numbers[0], numbers[1]);
    for (int i = 2; i < numbers.length; i++) {
      hcf = hcf(hcf, numbers[i]);

      if (hcf == 1) // once hcf is 1 it will always stay the same
        break;
    }

    return hcf;
  }

  // hcf(a, b) = hcf(b, a%b) = ... = hcf(x, 0) => hcf(a, b) = x
  public static long hcf(long a, long b) {
    while (b != 0) {
      long temp = b;
      b = a % b;
      a = temp;
    }

    return a;
  }

}
