package CodeStepByStep_java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a method named countDuplicates that accepts an array of
 * integers as a parameter and that returns the number of duplicate
 * values in the array.
 * A duplicate value is a value that also occurs earlier in the array.
 *
 * Constraints:
 * The array could be empty or could contain only a single element;
 * in such cases, your method should return 0.
 * Do not modify the contents of the array.
 *
 * @author Mr.Dr.Professor
 * @since 14-Jan-21 11:54 PM
 */
class countDuplicates {
  public static void main(String[] args) {
    int[] arr = {1, 4, 2, 4, 7, 1, 1, 9, 2, 3, 4, 1};
    System.out.println(countDuplicates(arr));
  }

  public static int countDuplicates(int[] list) {
    if (list == null || list.length <= 1)
      return 0;

    Set<Integer> set = new HashSet<>();
    for (int n : list) {
      set.add(n);
    }

    return list.length - set.size();
  }

//  public static int countDuplicates(int[] list) {
//    if (list == null || list.length <= 1)
//      return 0;
//
//    int[] copy = Arrays.copyOf(list, list.length);
//    Arrays.sort(copy);
//    int totalDup = 0;
//
//    for (int i = 0; i < copy.length; ) {
//      int dup = 1;
//
//      int j = i + 1;
//      for (; j < copy.length; j++) {
//        if (copy[j] != copy[i])
//          break;
//        dup++;
//      }
//
//      totalDup += dup - 1;
//      i = j;
//    }
//
//    return totalDup;
//  }
}