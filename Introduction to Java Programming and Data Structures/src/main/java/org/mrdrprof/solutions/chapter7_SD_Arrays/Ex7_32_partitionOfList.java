package org.mrdrprof.solutions.chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * **7.32 (Partition of a list)
 * After the partition, the elements in the list are rearranged so all the elements before
 * the pivot are less than or equal to the pivot, and the elements after the pivot are
 * greater than the pivot.
 * The method returns the index where the pivot is located in
 * the new list.
 *
 * Enter list size: 8
 * Enter list content: 10 1 5 16 61 9 11 1
 * After the partition, the list is 9 1 5 1 10 61 11 16
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 7:53 PM
 */
class Ex7_32_partitionOfList {
  public static void main(String[] args) {
    int[] list = getList();
    partition(list); // returns index where the pivot element is located
    System.out.print("After the partition, the ");
    Ex7_31_mergeTwoSortedLists.printList(list, "");
  }

  public static int[] getList() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter list size: ");
    int   size = sc.nextInt();
    int[] list = new int[size];

    System.out.print("Enter list content: ");
    for (int i = 0; i < size; i++)
      list[i] = sc.nextInt();

    return list;
  }

  public static int partition(int[] list) {
    int pivot = list[0];
    int low   = 0;
    int high  = list.length;

    while (low < high) {

      while (low < high && list[--high] >= pivot) ;
      if (low < high)
        list[low] = list[high];

      while (low < high && list[++low] <= pivot) ;
      if (low < high)
        list[high] = list[low];
    }

    list[high] = pivot;
    return high;
  }
}
