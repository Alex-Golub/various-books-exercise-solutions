package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * 7.27 (Check whether the array is sorted with constant interval)
 * An array list is sorted with a constant interval if its elements
 * are arranged in an ascending order and there
 * is a constant difference between adjacent elements.
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 10:11 PM
 */
class Ex7_27_sortedConstantInterval {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int[] list = getArray();
    System.out.printf("The list is %ssorted with a constant interval",
                      isSortedConstantInterval(list) ? "" : "not ");
  }

  private static int[] getArray() {
    System.out.print("Enter list: ");
    int   size = sc.nextInt();
    int[] arr  = new int[size];
    for (int i = 0; i < size; i++)
      arr[i] = sc.nextInt();

    return arr;
  }

  public static boolean isSortedConstantInterval(int[] list) {
    if (list == null || list.length < 2)
      return true;

    int interval = list[1] - list[0];
    for (int i = 2; i < list.length; i++) {
      if (list[i] - list[i - 1] != interval)
        return false;
    }

    return true;
  }

}
