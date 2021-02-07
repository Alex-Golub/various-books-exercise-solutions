package chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * **7.19 (Sorted?)
 *
 * @author Mr.Dr.Professor
 * @since 06-Feb-21 3:03 PM
 */
class Ex7_19_isSorted {
  static final Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    int[] arr = prompt();
    print(arr);

    System.out.printf("The list is %s sorted\n",
                      isSorted(arr) ? "already" : "not");
  }

  private static void print(int[] arr) {
    System.out.print("The list has " + arr.length + " integers");
    for (int val : arr) {
      System.out.print(" " + val);
    }

    System.out.println();
  }

  private static int[] prompt() {
    int size = getSize();
    System.out.print("Enter the contents of the list (space separated e.g. 1 2 3 4): ");
    int[] list = new int[size];
    for (int i = 0; i < size; i++)
      list[i] = console.nextInt();

    return list;
  }

  private static int getSize() {
    System.out.print("Enter the size of the list: ");
    int size = console.nextInt();
    if (size <= 0)
      throw new IllegalStateException("List size can't be zero or -ve value: " + size);
    return size;
  }

  public static boolean isSorted(int[] list) {
    if (list.length <= 1)
      return true;

    boolean ascending  = true;
    boolean descending = true;

    for (int i = 1; i < list.length; i++) {
      if (list[i - 1] > list[i])
        ascending = false;
      if (list[i - 1] < list[i])
        descending = false;
    }

    return ascending || descending;
  }
}
