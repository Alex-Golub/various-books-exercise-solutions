package cse_142.cs1_labs;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/labs/lab7/PromptNumbers
 *
 * @author Alex Golub
 * @since 07-Apr-21 3:28 PM
 */
class PromptNumbers {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("How many numbers will you enter? ");
    int count = console.nextInt();
    int[] arr = new int[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Type a number: ");
      arr[i] = console.nextInt();
    }

    System.out.println();
    System.out.println("Your numbers in forward order:");
    for (int i = 0; i < count; i++) {
      System.out.println(arr[i]);
    }

    System.out.println();
    System.out.println("Your numbers in backward order:");
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.println(arr[i]);
    }
  }
}
