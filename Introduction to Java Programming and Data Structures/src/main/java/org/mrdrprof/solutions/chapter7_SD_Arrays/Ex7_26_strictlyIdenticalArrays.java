package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * 7.26 (Strictly identical arrays)
 * strictly identical if their corresponding elements are equal.
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 10:01 PM
 */
class Ex7_26_strictlyIdenticalArrays {
  static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int[] list1 = getList(1);
    int[] list2 = getList(2);

    System.out.printf("Two lists are %sstrictly identical\n",
                      equals(list1, list2) ? "" : "not ");
  }

  public static int[] getList(int i) {
    System.out.printf("Enter list%d size and contents: ", i);
    int   size = sc.nextInt();
    int[] list = new int[size];
    for (int j = 0; j < size; j++)
      list[j] = sc.nextInt();

    return list;
  }

  public static boolean equals(int[] list1, int[] list2) {
    if (list1 == null || list2 == null || list1.length != list2.length)
      return false;

    for (int i = 0; i < list1.length; i++)
      if (list1[i] != list2[i])
        return false;

    return true;
  }

}
