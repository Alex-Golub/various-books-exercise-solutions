package chapter7_SD_Arrays;

import java.util.Scanner;

/**
 * *7.30 (Pattern recognition: consecutive four equal numbers)
 * array has four consecutive numbers with the same value?
 *
 * Enter the number of values: 8
 * Enter the values: 3 4 5 5 5 5 4 5
 * The list has consecutive fours
 *
 * Enter the number of values: 9
 * Enter the values: 3 4 5 5 6 5 5 4 5
 * The list has no consecutive fours
 *
 * Enter the number of values: 3
 * Enter the values: 1 2 3
 * The list has no consecutive fours
 *
 * @author Mr.Dr.Professor
 * @since 07-Feb-21 7:26 PM
 */
class Ex7_30_fourConsecutive {
  public static void main(String[] args) {
    int[] arr = getArray();
    System.out.printf("The list has %sconsecutive fours\n",
                      isConsecutiveFour(arr) ? "" : "no ");
  }

  public static boolean isConsecutiveFour(int[] values) {
    if (values.length < 4)
      return false;

    int first  = values[0];
    int second = values[1];
    int third  = values[2];
    for (int i = 3; i < values.length; i++) {
      if (first == second && second == third && third == values[i])
        return true;

      first = second;
      second = third;
      third = values[i];
    }

    return false;
  }

  public static int[] getArray() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of values: ");
    int   size = sc.nextInt();
    int[] arr  = new int[size];

    System.out.print("Enter the values: ");
    for (int i = 0; i < size; i++)
      arr[i] = sc.nextInt();
    return arr;
  }
}
